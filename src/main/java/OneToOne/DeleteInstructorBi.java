package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorBi {

    public static void main(String[] args){


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            int theId=4;
            InstructorDetail tempInstructorDetail=session.get(InstructorDetail.class,theId);

            System.out.println("the instructor detail"+tempInstructorDetail);

            tempInstructorDetail.getInstructor().setInstructorDetail(null);

            session.delete(tempInstructorDetail);

            session.getTransaction().commit();

            System.out.println("Done!");
        }
        catch (Exception exc){
            exc.printStackTrace();
        }
        finally {
            session.close();
        }
            factory.close();
        }

    }
