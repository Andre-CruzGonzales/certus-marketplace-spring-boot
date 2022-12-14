package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepositorio;

@Service
public class ProductoServicio {
	
	@Autowired
	private ProductoRepositorio productoRepositorio;
	
	public List<Producto> listAll(){
		return productoRepositorio.findAll();
		
	}
	
	public void save(Producto producto) {
		productoRepositorio.save(producto);
	
	}
	
	public Producto get(Long id) {
		return productoRepositorio.findById(id).get();
	}
	
	public void delete (Long id) {
		productoRepositorio.deleteById(id);
	}


}
