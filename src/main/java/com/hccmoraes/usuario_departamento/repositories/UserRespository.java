package com.hccmoraes.usuario_departamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hccmoraes.usuario_departamento.entities.User;

//A interface precisa ser extidade ao JpaRepository, também precisa informar a classe de referência e o tipo do id
public interface UserRespository extends JpaRepository<User, Long>{

}
