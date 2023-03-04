package com.pxt.newEcommerce.service;

import java.util.List;

import com.pxt.newEcommerce.domain.Pedido;

public interface PedidoService {

	public Pedido buscarPorCodigo(Long codigo);
	
	public List<Pedido> buscarTodos();
	
}
