package com.test.postgresql.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.postgresql.springbootpostgresql.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
