package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryHibernate {




    public static void main(String args[]){

        SessionFactory factory=new Configuration()
                .configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();


        Session session=factory.getCurrentSession();
        try{
            session.beginTransaction();

            List<Student> thestudents=session.createQuery("from Student").getResultList();

           // displayStudents(thestudents);


            thestudents=session.createQuery("from Student s where email LIKE '%@gmail.com'").getResultList();

            displayStudents(thestudents);

            session.getTransaction().commit();
            System.out.println("done");


        }
        finally {
            factory.close();

        }
        }

    private static void displayStudents(List<Student> thestudents) {
        for(Student tempStudent:thestudents){
            System.out.println(tempStudent);
        }
    }
}
