package SpringHibernate;

public interface EmployeeCrud {

        void save(Employee employee);

        void update(Employee employee);

        void delete(Employee employee);

        Employee findByEmpId(String empID);

}
