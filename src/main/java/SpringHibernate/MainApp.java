package SpringHibernate;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

        EmployeeCrud employeePojo = (EmployeeCrud) appContext.getBean("employeePojo");

        /** insert **/
        Employee employee = new Employee();
       employee.setEmpDept("software");
       employee.setEmpName("chaitanya");
       employee.setEmpId(101);
        employeePojo.save(employee);



        System.out.println("Done");
    }
}
