package com.example.demo.model;


public class Categoria {
	private int id;
	private String categoria;
	private String estado_registro;
	
	public Categoria() {
		
	}
	
	public Categoria(int id, String categoria, String estado_registro) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.estado_registro = estado_registro;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getEstado_registro() {
		return estado_registro;
	}


	public void setEstado_registro(String estado_registro) {
		this.estado_registro = estado_registro;
	}
	
	

}
