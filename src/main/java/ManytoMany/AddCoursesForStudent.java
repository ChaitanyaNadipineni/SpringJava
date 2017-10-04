package ManytoMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddCoursesForStudent {

    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();



        Session session = factory.getCurrentSession();

        try

        {
            session.beginTransaction();

            int theId=2;

            Student tempStudent= session.get(Student.class,theId);

            System.out.println("the stucdent sele ted is"+tempStudent);

            Course tempCourse1= new Course("Mysql");
            Course tempCourse2= new Course(".net");

            tempCourse1.addStudent(tempStudent);
            tempCourse2.addStudent(tempStudent);

            session.save(tempCourse1);
            session.save(tempCourse2);

            session.getTransaction().commit();

            System.out.println("done");

                    }
        finally {
            factory.close();
        }
    }
}

