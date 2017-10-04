 package ManytoMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCoursesOnly {

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

            int courseId=11;

            Course tempCpurse= session.get(Course.class,courseId);

            System.out.println("deleting course"+tempCpurse);

            session.delete(tempCpurse);


            session.getTransaction().commit();

            System.out.println("done");

                    }
        finally {
            factory.close();
        }
    }
}

