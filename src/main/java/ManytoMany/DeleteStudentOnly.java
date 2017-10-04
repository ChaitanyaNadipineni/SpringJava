 package ManytoMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 public class DeleteStudentOnly {

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

             int studentID=2;

             Student tempStudent=session.get(Student.class,studentID);

             System.out.println("deleting stduent"+tempStudent);

             session.delete(tempStudent);


             session.getTransaction().commit();

             System.out.println("done");

                     }
         finally {
             factory.close();
         }
     }
 }

