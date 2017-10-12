package SpringHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("employeePojo")
    public class EmployeeImplementation implements EmployeeCrud{

        @Autowired
        EmployeeDao employeeDao;

        public void setStockDao(EmployeeDao employeeDao) {
            this.employeeDao = employeeDao;
        }

        public void save(Employee employee){
           employeeDao.save(employee);
        }

        public void update(Employee employee){
            employeeDao.update(employee);
        }

        public void delete(Employee employee){
            employeeDao.delete(employee);
        }

    @Override
    public Employee findByEmpId(String empID) {
        return employeeDao.findByEmployeeID(empID);
    }

    }
