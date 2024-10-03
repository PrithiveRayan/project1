package com.project.one.controller;

import com.project.one.model.Department;
import com.project.one.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(Department.class);

    @GetMapping("/allDepartments")
    public List<Department> getDepartment(){
        return departmentService.getDepartments();
    }

    @GetMapping("/departmentId/{id}")
    public Department getDepartment(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);
    }

    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("save department api is called");
        return departmentService.saveDepartment(department);

    }

    @PostMapping("/departments")
    public List<Department> saveDepartments(@Valid @RequestBody List<Department> departments){
        LOGGER.info("save departments api is called");
        return departmentService.saveDepartments(departments);

    }

    @PutMapping("/departmentId/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable("id") Long id){
        return departmentService.updateDepartment(id, department);
    }

    @DeleteMapping("/departmentId/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long id){
        departmentService.deletedDepartmentById(id);
        return"Department has been successfully deleted!";
    }
}
