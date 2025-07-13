package com.hccmoraes.usuario_departamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hccmoraes.usuario_departamento.entities.User;
import com.hccmoraes.usuario_departamento.repositories.UserRespository;

@RestController //Para informar que essa é uma classe controladora
@RequestMapping(value = "/users") //Para informar qual o caminho esse controlador ira responder
public class UserController {
	
	@Autowired
	private UserRespository respository;
	 
	@GetMapping //Para informar que o verbo é de consulta
	public List<User> findAll(){
		List<User> result = respository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}") //Para informar que o verbo é de consulta
	public User findById(@PathVariable Long id){
		User result = respository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User user){
		User result = respository.save(user);
		return result;
	}
	
	

}
