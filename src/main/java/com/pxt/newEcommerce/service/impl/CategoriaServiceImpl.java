package com.pxt.newEcommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pxt.newEcommerce.domain.Categoria;
import com.pxt.newEcommerce.repository.CategoriaRepository;
import com.pxt.newEcommerce.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	
	@Override
	public Categoria buscarPorCodigo(Long codigo) {
		return categoriaRepository.findById(codigo).get();
	}
	
	
	@Override
	public List<Categoria> buscarTodos() {
		return categoriaRepository.findAll();
	}
	
}
