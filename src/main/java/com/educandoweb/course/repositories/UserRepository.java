package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//Repositório responsável por fazer operações com a classe User

public interface UserRepository extends JpaRepository<User, Long>{

}
