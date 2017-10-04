package OnetoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EagerLazyDemo {
    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();

        try {


            session.beginTransaction();


            int theId = 2;
            Instructor tempInstructor = session.get(Instructor.class, theId);

            System.out.println(" first break point instructor" + tempInstructor);
            //System.out.println("Courses" + tempInstructor.getCourses());

            session.getTransaction().commit();
            session.close();


            System.out.println("Courses afetr session close" + tempInstructor.getCourses());
            System.out.println("Done!");
        } finally {


            session.close();

            factory.close();
        }
    }

}
