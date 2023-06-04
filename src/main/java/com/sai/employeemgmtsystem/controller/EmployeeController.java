package com.sai.employeemgmtsystem.controller;

import com.sai.employeemgmtsystem.model.Employee;
import com.sai.employeemgmtsystem.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping({"/displayEmployees","/","/list"})
    public ModelAndView displayEmployees(){
        ModelAndView modelAndView = new ModelAndView("employeeslist");
        List<Employee> employeeList = employeeRepository.findAll();
        modelAndView.addObject("employeeList",employeeList);
        return modelAndView;
    }

    @GetMapping("/addEmployeeForm")
    public ModelAndView addEmployeeForm(){
        ModelAndView modelAndView = new ModelAndView("add-employee-form");
        Employee newEmployee = new Employee();
        modelAndView.addObject("employee",newEmployee);
        return modelAndView;
    }

    @PostMapping("/saveEmployee")
    public RedirectView saveEmployee(@Valid @ModelAttribute Employee employee){
        employeeRepository.save(employee);
        return new RedirectView("/list");
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam int employeeId){
        ModelAndView modelAndView = new ModelAndView("add-employee-form");
        Employee existingEmployee = employeeRepository.findById(employeeId).get();
        System.out.println(existingEmployee);
        modelAndView.addObject("employee",existingEmployee);
        return modelAndView;
    }

    @GetMapping("/deleteEmployee")
    public RedirectView deleteEmployee(@RequestParam int employeeId){
        employeeRepository.deleteById(employeeId);
        return new RedirectView("/list");
    }
}
