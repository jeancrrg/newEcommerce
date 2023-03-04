package com.pxt.newEcommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pxt.newEcommerce.domain.Cliente;
import com.pxt.newEcommerce.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	
	@GetMapping("/{codigo}")
	public ResponseEntity<?> buscarPorCodigo(@PathVariable Long codigo) {
		try {
			return ResponseEntity.ok().body(clienteService.buscarPorCodigo(codigo));
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("ERRO ao buscar cliente por código: " + e.getMessage());
		}
	}
	
	
	@GetMapping("/buscarTodos")
	public ResponseEntity<?> buscarTodos(@PathVariable Long codigo) {
		try {
			List<Cliente> clientesBuscados = clienteService.buscarTodos();
			return ResponseEntity.ok().body(clientesBuscados);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("ERRO ao buscar todos clientes: " + e.getMessage());
		}
	}
	
	
}
