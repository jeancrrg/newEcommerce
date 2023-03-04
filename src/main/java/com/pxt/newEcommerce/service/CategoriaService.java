package com.pxt.newEcommerce.service;

import java.util.List;

import com.pxt.newEcommerce.domain.Categoria;

public interface CategoriaService {

	public Categoria buscarPorCodigo(Long codigo);
	
	public List<Categoria> buscarTodos();
}
