package com.spring.Employee.contoller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Employee.entity.Employee;
import com.spring.Employee.repo.Dao;


@RequestMapping("/api")
@RestController
public class Api 
{
	@Autowired
	Dao dao;
	
	
	@PostMapping("/insert")
	public Employee insert(@RequestBody Employee e)
	{
		return dao.save(e);
	}
	
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id)
	{
		Optional<Employee> byId = dao.findById(id);
		return byId;
		
	}
	
	@DeleteMapping("/dltMapping/{id}")
	public void dltEmployee(@PathVariable int id)
	{
		 dao.deleteById(id);
	}
	
	
	@PutMapping("/updt/{id}")
	public Employee updtEmployee(@RequestBody Employee e)
	{
		
		e.setId(e.getId());
		e.setAge(e.getAge());
		e.setDob(e.getDob());
		e.setF_name(e.getF_name());
		e.setL_name(e.getL_name());
		return dao.save(e);
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee()
	{
		List<Employee> e = dao.findAll();
		return e;
	}
	
	@DeleteMapping("dltAll")
	public void dltAll()
	{
		 dao.deleteAll();
	}
	
}
