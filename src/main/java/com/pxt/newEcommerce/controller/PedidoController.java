package com.pxt.newEcommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pxt.newEcommerce.domain.Pedido;
import com.pxt.newEcommerce.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	PedidoService pedidoService;
	
	
	@GetMapping("/{codigo}")
	public ResponseEntity<?> buscarPorCodigo(@PathVariable Long codigo) {
		try {
			return ResponseEntity.ok().body(pedidoService.buscarPorCodigo(codigo));
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("ERRO ao buscar pedido por código: " + e.getMessage());
		}
	}
	
	
	@GetMapping("/buscarTodos")
	public ResponseEntity<?> buscarTodos(@PathVariable Long codigo) {
		try {
			List<Pedido> pedidosBuscados = pedidoService.buscarTodos();
			return ResponseEntity.ok().body(pedidosBuscados);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("ERRO ao buscar todos pedidos: " + e.getMessage());
		}
	}
	
	
}
