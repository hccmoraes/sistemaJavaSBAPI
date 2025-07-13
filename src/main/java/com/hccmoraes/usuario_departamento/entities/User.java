package com.hccmoraes.usuario_departamento.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//Para informar que essa classe será mapeada para uma tabela do banco de dados
@Entity
//Para informar qual o nome da tabela no banco de dados
@Table(name = "tb_user")
public class User {
	
	    //Classe implementada conforme projeto do domínio
		//Sempre como private para que a classe seja instanciada através do métodos getters e setters
	    @Id //Para informar que essa é a chave primária do banco
	    @GeneratedValue(strategy = GenerationType.IDENTITY) //Para informar que o id será autoincrementável
		private Long id;
		private String name;
		private String email;
		
		//criado o atributo department, pois o projeto mostra que o usuario será vinculado a um departamento
		@ManyToOne //Para informar a relação muitos para um, onde um departamento possui vários usuários
		@JoinColumn(name = "department_id") //Para informar a coluna que será a chave estrengeira
		private Department department;
		
		//Por boas práticas criar um método construtor vazio
		public User() {
			
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}
		

}
