package SpringHibernate;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "employee")
public class Employee  {

    private int empId;
    private String empDept;
    private String empName;

    public Employee() {
    }

    public Employee(String empDept, String empName) {
        this.empDept = empDept;
        this.empName = empName;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "emp_id")

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


    @Column(name = "emp_dept")

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }



    @Column(name = "emp_name")

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empDept='" + empDept + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }


}
