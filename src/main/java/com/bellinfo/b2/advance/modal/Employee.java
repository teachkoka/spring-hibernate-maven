package com.bellinfo.b2.advance.modal;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by iue820 on 12/3/15.
 */
@Entity
@Table(name="DEPARTMENT")
public class Employee {

    private String id;

    private String dept;

    private String emp_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (dept != null ? !dept.equals(employee.dept) : employee.dept != null) return false;
        return !(emp_id != null ? !emp_id.equals(employee.emp_id) : employee.emp_id != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dept != null ? dept.hashCode() : 0);
        result = 31 * result + (emp_id != null ? emp_id.hashCode() : 0);
        return result;
    }
}
