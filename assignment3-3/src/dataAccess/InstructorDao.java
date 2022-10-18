package dataAccess;

import entities.Instructor;

import java.util.List;

public interface InstructorDao {
    List<Instructor> add(Instructor instructor);
}
