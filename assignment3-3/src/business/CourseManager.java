package business;

import core.logging.BaseLogger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private List<Course> courses = new ArrayList<>();

    private CourseDao courseDao;
    private BaseLogger[] baseLoggers;

    public CourseManager(CourseDao courseDao, BaseLogger[] baseLoggers) {
        this.courseDao = courseDao;
        this.baseLoggers = baseLoggers;
    }

    public List<Course> add(Course course) {
        if (controlCourseName(course) && controlCoursePrice(course)) {
            courses = courseDao.add(course);
        }
        for (BaseLogger logger : baseLoggers) {
            logger.log(course.toString() + " eklendi");
        }
        return courses;
    }

    private boolean controlCourseName(Course course) {
        for (Course _course : courses) {
            if (_course.getCourseName().equals(course.getCourseName())) {
                System.err.println("Bu isimde başka bir kurs mevcut!");
                return false;
            }
        }
        return true;
    }

    private boolean controlCoursePrice(Course course) {
        if (course.getPrice() < 0) {
            System.err.println("Fiyat 0'dan büyük olmalıdır.");
            return false;
        }
        return true;
    }

}
