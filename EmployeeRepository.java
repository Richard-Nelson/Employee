package com.richard.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import com.richard.learning.model.*;


@RestResource(exported = false)
public interface EmployeeRepository extends JpaRepository<Employee,String> {
	
}