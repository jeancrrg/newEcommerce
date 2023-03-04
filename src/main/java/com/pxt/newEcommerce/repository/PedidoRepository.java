package com.pxt.newEcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pxt.newEcommerce.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
