package com.example.Employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    //@GeneratedValue
    private long employeeId;
    private String employeeName;
    private String employeeBU;
    private String location;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBU() {
        return employeeBU;
    }

    public void setEmployeeBU(String employeeBU) {
        this.employeeBU = employeeBU;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee(long employeeId, String employeeName, String employeeBU, String location) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBU = employeeBU;
        this.location = location;
    }

    public Employee() {
        super();
    }

}
