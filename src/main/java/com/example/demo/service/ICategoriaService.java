package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Categoria;

public interface ICategoriaService {
	public void create(Categoria c);
	public void update();
	public Optional<Categoria> getId(int id);
	public List<Categoria> get();
	public void delete(int id);
}
