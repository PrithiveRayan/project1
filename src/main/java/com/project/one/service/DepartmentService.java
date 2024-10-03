package com.project.one.service;

import com.project.one.model.Department;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> saveDepartments(List<Department> departments);

    public List<Department> getDepartments();

    public Department getDepartmentById(Long id);

    public Department updateDepartment(Long id, Department department);

    public void deletedDepartmentById(Long id);
}
