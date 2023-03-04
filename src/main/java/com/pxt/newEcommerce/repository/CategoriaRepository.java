package com.pxt.newEcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pxt.newEcommerce.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
