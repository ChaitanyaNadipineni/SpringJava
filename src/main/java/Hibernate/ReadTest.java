package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadTest {


    public static void main(String args[]){

        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();


        Session session=factory.getCurrentSession();
        try{
            Student tempstudent1= new Student("chaitu","u","chaitu@gmail.com");



            session.beginTransaction();

            session.save(tempstudent1);

            session.getTransaction().commit();





        }
        finally {
            factory.close();
        }

    }
}


