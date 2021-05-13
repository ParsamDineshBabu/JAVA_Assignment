package dinesh;

import java.security.Key;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.Map;
class Employee {
    private Integer empid;
    private String empname;
    public Employee(Integer empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }
    @Override
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o; */
        return true;
    }
    @Override
    public int hashCode() {
        return 15256;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                '}';
    }
}

