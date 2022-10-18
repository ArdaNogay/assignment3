package dataAccess;

import entities.Category;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JdbcInstructorDao implements InstructorDao{

    private List<Instructor> instructors = new ArrayList<>();

    @Override
    public List<Instructor> add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi : " + instructor.toString());
        instructors.add(instructor);
        return instructors;
    }
}