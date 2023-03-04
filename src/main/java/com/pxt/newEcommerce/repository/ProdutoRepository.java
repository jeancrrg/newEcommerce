package com.pxt.newEcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pxt.newEcommerce.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
