package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test {


    public static void main(String args[]){

        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();


        Session session=factory.getCurrentSession();
        try{
            Student tempstudent1= new Student("stave","m","murrari@gmail.com");




            session.beginTransaction();

            session.save(tempstudent1);

            session.getTransaction().commit();



            session=factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("getting begin"+tempstudent1.getId());

            Student mystudent = session.get(Student.class,tempstudent1.getId());
            System.out.println("get complete"+mystudent);
            session.getTransaction().commit();


        }
        finally {
            factory.close();
        }

    }
}
