package OnetoMany;

import OneToOne.Instructor;
import OneToOne.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorDemo {

    public static void main(String[] args) {


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)

                .buildSessionFactory();


        Session session = factory.getCurrentSession();

        try {


            Instructor tempInstructor =
                    new Instructor("bahrath", "maurrari", "bharath@gmail.com");

            InstructorDetail tempInstructorDetail =
                    new InstructorDetail(
                            "http://www.youtube.com",
                            "Video Games");


            tempInstructor.setInstructorDetail(tempInstructorDetail);


            session.beginTransaction();


            //
            System.out.println("Saving instructor: " + tempInstructor);
            session.save(tempInstructor);


            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {


            session.close();

            factory.close();
        }
    }

}





