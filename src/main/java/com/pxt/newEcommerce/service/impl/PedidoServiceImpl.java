package com.pxt.newEcommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxt.newEcommerce.domain.Pedido;
import com.pxt.newEcommerce.repository.PedidoRepository;
import com.pxt.newEcommerce.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;
	
	
	@Override
	public Pedido buscarPorCodigo(Long codigo) {
		return pedidoRepository.findById(codigo).get();
	}
	
	
	@Override
	public List<Pedido> buscarTodos() {
		return pedidoRepository.findAll();
	}
	
}
