package ManytoMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseStudent {

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

            Course tempCourse= new Course("oracle");

            session.save(tempCourse);


            Student tempStudent1 = new Student("chaitu","nadi","chaitu@gmsil.com");
            Student tempStudent2= new Student("barath","murrari","marrari#gamil.com");

            tempCourse.addStudent(tempStudent1);
            tempCourse.addStudent(tempStudent2);

            session.save(tempStudent1);
            session.save(tempStudent2);


            session.getTransaction().commit();

            System.out.println("done");
        }
        finally {
            factory.close();
        }
    }
}

