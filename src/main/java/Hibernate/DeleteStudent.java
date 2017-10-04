package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {

    public static void main(String args[]) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();


        Session session = factory.getCurrentSession();
        try {

            int studentId=5;


            session=factory.getCurrentSession();
            session.beginTransaction();

          //  Student mystudent= session.get(Student.class,studentId);
           // session.delete(mystudent);

            session.createQuery("delete from Student where email LIKE '%@yahoo.com'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("deleted record");



        }
        finally {
            factory.close();
        }
    }
}
