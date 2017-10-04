package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UpdateStudent {

    public static void main(String args[]){

        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();


        Session session=factory.getCurrentSession();
        try{


                int studentId=4;

                session=factory.getCurrentSession();
                session.beginTransaction();

                Student mystudent=session.get(Student.class,studentId);

               mystudent.setFirstName("adarsh");




                session.createQuery("update Student set email='url@yahoo.com'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("update done");

            }
        finally {
            factory.close();
        }
    }
}
