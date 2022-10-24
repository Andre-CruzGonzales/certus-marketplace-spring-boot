package com.example.demo.model;

public class Marca {
	private int id;
	private String marca;
	private String estado_registro;
	
    public Marca() {
		
	}

	public Marca(int id, String marca, String estado_registro) {
		super();
		this.id = id;
		this.marca = marca;
		this.estado_registro = estado_registro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEstado_registro() {
		return estado_registro;
	}

	public void setEstado_registro(String estado_registro) {
		this.estado_registro = estado_registro;
	}
    
	

}
