package com.project.one.service;

import com.project.one.model.Department;
import com.project.one.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> saveDepartments(List<Department> departments) {
        return departmentRepository.saveAll(departments);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Department dpt = departmentRepository.findById(id).get();
        dpt.setDepartmentAddress(department.getDepartmentAddress());
        dpt.setDepartmentName(department.getDepartmentName());
        dpt.setDepartmentCode(department.getDepartmentCode());

        return departmentRepository.save(dpt);
    }

    @Override
    public void deletedDepartmentById(Long id) {
        departmentRepository.deleteById(id);

    }


}
