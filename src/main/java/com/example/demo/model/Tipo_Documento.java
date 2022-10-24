package com.example.demo.model;

public class Tipo_Documento {
	private int id;
	private String nombre;
	private int codigo;
	
	//private Usuario usuario;
	public Tipo_Documento() {
		
	}
	
	public Tipo_Documento(int id, String nombre, int codigo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String razonSocial) {
		this.nombre = razonSocial;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
