package com.hccmoraes.usuario_departamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hccmoraes.usuario_departamento.entities.Department;
import com.hccmoraes.usuario_departamento.repositories.DepartmentRepository;


@RestController //Para informar que essa é uma classe controladora
@RequestMapping(value = "/departments") //Para informar qual o caminho esse controlador ira responder
public class DepartmentController {
	
	@Autowired //Para instanciar o repository do Department
	private DepartmentRepository repository;
	
	@GetMapping //Para informar que o verbo é de consulta
	public List<Department> findAll(){
		List<Department> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}") //Para informar que o verbo é de consulta
	public Department findById(@PathVariable Long id){
		Department result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Department insert(@RequestBody Department department){
		Department result = repository.save(department);
		return result;
	}
	
	

}
