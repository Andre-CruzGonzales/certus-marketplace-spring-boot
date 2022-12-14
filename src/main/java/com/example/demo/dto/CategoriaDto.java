package com.example.demo.dto;

public class CategoriaDto {
	private String nombre;
	private String url_imagen;
	
	public CategoriaDto() {
		
	}

	public CategoriaDto(String nombre, String url_imagen) {
		super();
		this.nombre = nombre;
		this.url_imagen = url_imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl_imagen() {
		return url_imagen;
	}

	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}
	
}
