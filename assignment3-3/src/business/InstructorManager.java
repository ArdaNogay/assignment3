package business;

import core.logging.BaseLogger;
import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {

    private List<Instructor> instructors = new ArrayList<>();

    private InstructorDao instructorDao;
    private BaseLogger[] baseLoggers;

    public InstructorManager(InstructorDao instructorDao, BaseLogger[] baseLoggers) {
        this.instructorDao = instructorDao;
        this.baseLoggers = baseLoggers;
    }

    public List<Instructor> add(Instructor instructor) {
        instructors = instructorDao.add(instructor);
        for (BaseLogger logger : baseLoggers) {
            logger.log(instructor.toString() + " eklendi");
        }
        return instructors;
    }
}
