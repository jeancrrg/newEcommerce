package com.pxt.newEcommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxt.newEcommerce.domain.Produto;
import com.pxt.newEcommerce.repository.ProdutoRepository;
import com.pxt.newEcommerce.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	
	@Override
	public Produto buscarPorCodigo(Long codigo) {
		return produtoRepository.findById(codigo).get();
	}
	
	
	@Override
	public List<Produto> buscarTodos() {
		return produtoRepository.findAll();
	}
	
}
