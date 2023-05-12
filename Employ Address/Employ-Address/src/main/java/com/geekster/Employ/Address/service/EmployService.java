package com.geekster.Employ.Address.service;

import com.geekster.Employ.Address.Respository.IEmployRepository;
import com.geekster.Employ.Address.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployService {
    @Autowired
    IEmployRepository employeeRepository;

    public String addEmployees(List<Employees> employees) {
        List<Employees> employeeList = employeeRepository.saveAll(employees);
        if ( employeeList == null ) {
            return "Employees cannot be added";
        }
        return "Employees Added SuccessFully";
    }

    public List<Employees> getEmployees(Long employeeId) {
        if ( employeeId == null ) {
            return employeeRepository.findAll();
        }
        else {
            List<Employees> employees = new ArrayList<>();
            employees.add(employeeRepository.findById(employeeId).get());
            return employees;
        }
    }

    public String removeEmployee(Long employeeId) {
        Optional<Employees> employees = employeeRepository.findById(employeeId);
        if (employees.isEmpty()) {
            return "Employee with employee Id: " + employeeId + " not found";
        }
        else  {
            employeeRepository.deleteById(employeeId);
            return "Employee with employee Id: " + employeeId + " deleted successfully";
        }
    }

    public String updateEmployee(Long employeeId, Employees employees) {
        Optional<Employees> employeeList = employeeRepository.findById(employeeId);
        employees.setEmployeeId(employeeId);
        if (employeeList.isEmpty()) {
            return "Employee with employee Id: " + employeeId + " not found";
        }
        else  {
            employeeRepository.save(employees);
            return "Employee with employee Id: " + employeeId + " updated successfully";
        }
    }
}
