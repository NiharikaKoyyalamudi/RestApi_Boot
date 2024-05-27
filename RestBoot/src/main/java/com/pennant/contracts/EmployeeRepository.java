package com.pennant.contracts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pennant.Model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
