package com.example.demo_h2.controller;

import com.example.demo_h2.model.Employee;
import com.example.demo_h2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/emp")  // optional, but used in production
public class MyController {

    @Autowired
    private EmployeeService employeeService;

//    @GetMapping
//    public List<Employee> getAllemployee(){
//        return employeeService.getEmployees();
//    }
//
//    @GetMapping("/{empId}")
//    public Employee getEmployeeById(@PathVariable Long empId){
//        return employeeService.getEmployeeById(empId);
//    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

//    @PutMapping("/{empId}")
//    public void updateEmployeeDetails(
//            @PathVariable Long empId,
//            @RequestBody Employee employee
//    )
//    {
//        employeeService.updateEmployee(empId, employee);
//    }
//
//    @DeleteMapping("/{empId}")
//    public void delete(@PathVariable Long empId){
//        employeeService.deleteEmployee(empId);
//    }
}
