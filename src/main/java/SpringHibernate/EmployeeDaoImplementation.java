package SpringHibernate;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("employeePojo")
    public class EmployeeDaoImplementation extends CustomHibernateDaoSupport implements EmployeeDao{

        public void save(Employee employee){
            getHibernateTemplate().save(employee);
        }

        public void update(Employee employee){
            getHibernateTemplate().update(employee);
        }

        public void delete(Employee employee){
            getHibernateTemplate().delete(employee);
        }

    @Override
    public Employee findByEmployeeID(String EmpId) {

        List list = getHibernateTemplate().find(
                "from Stock where empId=?",EmpId
        );
        return (Employee) list.get(0);
    }




    }

