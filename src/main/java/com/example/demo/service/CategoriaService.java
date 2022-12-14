package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Categoria;
import com.example.demo.repository.CategoriaRepository;
@Service
@Transactional
public class CategoriaService implements ICategoriaService {
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override
	public void create(Categoria categoria) {
		categoriaRepository.save(categoria);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Categoria> getId(int id) {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(id);
	}

	@Override
	public List<Categoria> get() {
		// TODO Auto-generated method stub

		return categoriaRepository.findAll();
	}
	public void delete(int id) {
		categoriaRepository.deleteById(id);
	}


}
