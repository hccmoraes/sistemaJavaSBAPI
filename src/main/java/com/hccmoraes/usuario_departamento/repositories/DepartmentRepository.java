package com.hccmoraes.usuario_departamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hccmoraes.usuario_departamento.entities.Department;

//A interface precisa ser extidade ao JpaRepository, também precisa informar a classe de referência e o tipo do id
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
