package SpringHibernate;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext Context =
                new ClassPathXmlApplicationContext("springhibernate.xml");

        EmployeeCrud employeePojo =  Context.getBean("employeePojo",EmployeeCrud.class);



        Employee employee = new Employee();
       employee.setEmpDept("software");
       employee.setEmpName("chaitanya");
       employee.setEmpId(101);
        employeePojo.save(employee);



        System.out.println("Done");

        Context.close();
    }
}
