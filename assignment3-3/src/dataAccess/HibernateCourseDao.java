package dataAccess;

import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao{
    private List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi : " + course.toString());
        courses.add(course);
        return courses;
    }
}
