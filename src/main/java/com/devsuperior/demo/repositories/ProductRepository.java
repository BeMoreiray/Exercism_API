package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	//jpaRepository componente do sistema que vai possuir varias funções como buscar, deletar, inserir
}
