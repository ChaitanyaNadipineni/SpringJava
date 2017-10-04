package OneToOne;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestOnetoOne {

    public static void main(String[] args){


                SessionFactory factory = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Instructor.class)
                        .addAnnotatedClass(InstructorDetail.class)
                        .buildSessionFactory();

                // create session
                Session session = factory.getCurrentSession();

                try {

                    Instructor tempInstructor = new Instructor("bharatg", "murrari", "bharat@gmail.com");

                    InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com", "movies");


                    tempInstructor.setInstructorDetail(tempInstructorDetail);


                    session.beginTransaction();



                    System.out.println("Saving instructor: " + tempInstructor);
                    session.save(tempInstructor);


                    session.getTransaction().commit();

                    System.out.println("Done!");
                }
                finally {
                    factory.close();
                }
    }
}
