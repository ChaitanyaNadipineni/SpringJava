package SpringHibernate;

public interface EmployeeDao {



       void save(Employee employee);
        void update(Employee employee);
        void delete(Employee employee);
        Employee findByEmployeeID(String empId);

    }
