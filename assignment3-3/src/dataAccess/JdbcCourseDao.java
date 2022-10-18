package dataAccess;

import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao{
    private List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi : " + course.toString());
        courses.add(course);
        return courses;
    }
}
