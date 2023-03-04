package com.pxt.newEcommerce.service;

import java.util.List;

import com.pxt.newEcommerce.domain.Cliente;

public interface ClienteService {

	public Cliente buscarPorCodigo(Long codigo);
	
	public List<Cliente> buscarTodos();
}
