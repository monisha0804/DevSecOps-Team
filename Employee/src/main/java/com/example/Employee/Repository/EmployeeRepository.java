package com.example.Employee.Repository;

import com.example.Employee.Model.Employee;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
