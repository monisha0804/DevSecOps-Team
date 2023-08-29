package com.example.Employee.Service;

import com.example.Employee.Exception.EmployeeRequestException;
import com.example.Employee.Model.Employee;
import com.example.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        //Employee employee = new Employee(employeeDTO);
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchEmployee() {
        List<Employee> orders= employeeRepository.findAll();
        return orders;
        //return orders.stream().map(EmployeeDTO::new).collect(Collectors.toList());
        //return null;
    }

    @Override
    public Optional<Employee> getEmployeeById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isEmpty()) {
            throw new EmployeeRequestException("ID not found ");
        }

        return employee;
        //return (EmployeeDTO) employee.stream().map(EmployeeDTO::new).collect(Collectors.toList());
    }

//    @Override
//    public Employee updateEmployee(Employee employee, long id) {
//        Optional<Employee> emp = employeeRepository.findById(employee.getEmployeeId());
//        if(emp.isPresent()){
//            Employee emplUpdate=emp.get();
//
////            emplUpdate.setEmployeeName(employee.getEmployeeName());
////            emplUpdate.setEmployeeBU(employee.getEmployeeBU());
////            emplUpdate.setLocation(employee.getLocation());
//            return employeeRepository.save(emplUpdate);
//
//        }
//        return null;
//    }

    @Override
    public String deleteEmployee(long id) {
        if(!getEmployeeById(id).isEmpty()){
            employeeRepository.deleteById(id);
            return "Id " + id + " is deleted";
        }
        else{
            return "Id " + id + " not found";
        }


    }
}
