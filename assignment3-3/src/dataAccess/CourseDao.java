package dataAccess;

import entities.Course;

import java.util.List;

public interface CourseDao {
    List<Course> add(Course course);
}
