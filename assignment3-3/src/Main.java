import business.CategoryManager;
import business.InstructorManager;
import core.logging.BaseLogger;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Instructor;


public class Main {
    public static void main(String[] args) {


        //Eğitmen

        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setFirstName("Ceyhan Arda");
        instructor1.setLastName("Noğay");

        Instructor instructor2 = new Instructor();
        instructor2.setId(2);
        instructor2.setFirstName("Ceyhan Arda");
        instructor2.setLastName("Noğay");

        BaseLogger[] logger1 = {new DatabaseLogger()};

        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), logger1);
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);


        //Kurs

        entities.Course course1 = new entities.Course();
        course1.setCourseName("Java");
        course1.setId(1);
        course1.setPrice(100);

        entities.Course course2 = new entities.Course();
        course2.setCourseName("Java1");
        course2.setId(1);
        course2.setPrice(-10);

        BaseLogger[] logger2 = {new FileLogger()};

        business.CourseManager courseManager = new business.CourseManager(new HibernateCourseDao(), logger2);
        courseManager.add(course1);
        courseManager.add(course2);


        //Kategori

        Category category1 = new Category();
        category1.setCategoryName("Yazılım");
        category1.setId(1);

        Category category2 = new Category();
        category2.setCategoryName("Elektronik");
        category2.setId(2);

        BaseLogger[] logger3 = {new DatabaseLogger(), new FileLogger()};

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), logger3);
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category1);
        categoryManager.deleteById(1);


    }
}