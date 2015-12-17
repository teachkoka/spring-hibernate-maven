package com.bellinfo.b2.advance.resource;

import com.bellinfo.b2.advance.modal.Employee;
import com.bellinfo.b2.advance.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by iue820 on 12/3/15.
 */
@Controller
@RequestMapping(value="/dept")
public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/list" )
    public ModelAndView listOfTeams(@ModelAttribute Employee employee){
      ModelAndView modelAndView = new ModelAndView("list-of-employees");
      List<Employee> empList = employeeService.getListEmployee();
      modelAndView.addObject("Employee", empList);
      return modelAndView;
    }

}
