package com.spring.Employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Employee.entity.Employee;

@Repository
public interface Dao extends JpaRepository<Employee, Integer>{

}
