package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Order;

//Repositório responsável por fazer operações com a classe User

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
