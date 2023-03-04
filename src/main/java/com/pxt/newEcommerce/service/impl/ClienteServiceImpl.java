package com.pxt.newEcommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxt.newEcommerce.domain.Cliente;
import com.pxt.newEcommerce.repository.ClienteRepository;
import com.pxt.newEcommerce.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	
	@Override
	public Cliente buscarPorCodigo(Long codigo) {
		return clienteRepository.findById(codigo).get();
	}
	
	
	@Override
	public List<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}
	
}
