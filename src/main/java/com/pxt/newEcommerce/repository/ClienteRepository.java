package com.pxt.newEcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pxt.newEcommerce.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
