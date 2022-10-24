package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Categoria;

public interface ICategoriaService {
	public void create();
	public void update();
	public Categoria getId(int id);
	public ArrayList<Categoria> get();
}
