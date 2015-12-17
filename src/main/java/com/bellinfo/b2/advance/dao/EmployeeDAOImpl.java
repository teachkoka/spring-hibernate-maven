package com.bellinfo.b2.advance.dao;

import com.bellinfo.b2.advance.modal.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by iue820 on 12/3/15.
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Employee> getListOfEmployees() {
        return getCurrentSession().createQuery("from department").list();
    }
}
