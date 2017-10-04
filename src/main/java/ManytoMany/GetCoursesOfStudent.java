package ManytoMany;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class GetCoursesOfStudent {

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

            int theId=1;


            Criteria cr=session.createCriteria(Course.class);
            cr.add(Restrictions.like("title","oracle%"));
            List result = cr.list();
            System.out.println("the record recevied afet criteria applues is "+result.get(0));
            System.out.println("criteria applied");
            Student tempStudent= session.get(Student.class,theId);

            System.out.println("the stucdent sele ted is"+tempStudent);

            System.out.println("the courses os student"+tempStudent.getCourses());



            session.getTransaction().commit();

            System.out.println("done");

                    }
        finally {
            factory.close();
        }
    }
}

