package com.pxt.newEcommerce.service;

import java.util.List;

import com.pxt.newEcommerce.domain.Produto;

public interface ProdutoService {

	public Produto buscarPorCodigo(Long codigo);
	
	public List<Produto> buscarTodos();
	
}
