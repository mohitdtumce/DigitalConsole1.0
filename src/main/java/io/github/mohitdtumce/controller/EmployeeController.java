package io.github.mohitdtumce.controller;

import io.github.mohitdtumce.model.Employee;
import io.github.mohitdtumce.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    @GetMapping("/get_all")
    public @ResponseBody
    List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    @PostMapping("/add")
    public @ResponseBody
    Employee addNewUser(@RequestBody String firstName, @RequestBody String lastName, @RequestBody String gender, @RequestBody Integer departmentId, @RequestBody String emailId) {
        System.out.println(firstName + lastName + gender + departmentId + emailId);
        return employeeRepository.save(new Employee(firstName, lastName, gender, departmentId, emailId));
    }
}