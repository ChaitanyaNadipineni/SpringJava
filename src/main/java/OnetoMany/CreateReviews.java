package OnetoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateReviews {

    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();

        try {


            session.beginTransaction();

           int theCourseId=12;

            Course tempCourse=session.get(Course.class,theCourseId);

            tempCourse.addReview(new Review("used foe scala"));
            tempCourse.addReview(new Review("good for depencdency management"));

            session.save(tempCourse);

            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {


            session.close();

            factory.close();
        }
    }

}
