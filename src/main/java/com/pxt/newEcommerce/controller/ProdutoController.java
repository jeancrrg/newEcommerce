package com.pxt.newEcommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pxt.newEcommerce.domain.Produto;
import com.pxt.newEcommerce.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;
	
	
	@GetMapping("/{codigo}")
	public ResponseEntity<?> buscarPorCodigo(@PathVariable Long codigo) {
		try {
			return ResponseEntity.ok().body(produtoService.buscarPorCodigo(codigo));
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("ERRO ao buscar produto por código: " + e.getMessage());
		}
	}
	
	
	@GetMapping("/buscarTodos")
	public ResponseEntity<?> buscarTodos(@PathVariable Long codigo) {
		try {
			List<Produto> produtosBuscados = produtoService.buscarTodos();
			return ResponseEntity.ok().body(produtosBuscados);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("ERRO ao buscar todos produtos: " + e.getMessage());
		}
	}
	
}
