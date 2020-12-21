package com.example.deparment.services;

import com.example.deparment.entity.Department;
import com.example.deparment.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department getDepartment(Long id){
        return departmentRepository.findById(id).orElse(new Department(0L, "NOT FOUND"));
    }
}
