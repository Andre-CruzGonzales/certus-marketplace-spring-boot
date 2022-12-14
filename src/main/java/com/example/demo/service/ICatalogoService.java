package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.entity.Catalogo;



public interface ICatalogoService {
	public void create();
	public void update();
	public Catalogo getId(int id);
	public ArrayList<Catalogo> get();
}
