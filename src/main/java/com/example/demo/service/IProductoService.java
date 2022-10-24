package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Producto;

public interface IProductoService {

	public void registroproducto();
	
	public void update();

	public Producto getId(int id);
    
	public ArrayList<Producto> get();
}
