package com.bellinfo.b2.advance.service;

import com.bellinfo.b2.advance.dao.EmployeeDAO;
import com.bellinfo.b2.advance.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by iue820 on 12/3/15.
 */
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    public List<Employee> getListEmployee() {
        return employeeDAO.getListOfEmployees();
    }

    public static void main(String[] args){
        EmployeeServiceImpl emp = new EmployeeServiceImpl();
        emp.getListEmployee();
    }
}
