package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int subcategoria_id;
	private int user_id;
	private String url_imagen;
	private String estado_registro="A";
	
	//lista de relacion
	@OneToMany(mappedBy = "categoriaId",fetch = FetchType.LAZY)
	private Set<Producto> productos;
	public Categoria() {
		
	}
	
	public Categoria(int id, String nombre, String url_imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.url_imagen = url_imagen;
	}
	public Categoria( String nombre, String url_imagen) {
		super();
		
		this.nombre = nombre;
		this.url_imagen = url_imagen;
	}


	public Categoria(int id, String nombre, int subcategoria_id, int user_id, String url_imagen,
			String estado_registro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.subcategoria_id = subcategoria_id;
		this.user_id = user_id;
		this.url_imagen = url_imagen;
		this.estado_registro = estado_registro;
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


	public void setCategoria(String categoria) {
		this.nombre = categoria;
	}


	public String getEstado_registro() {
		return estado_registro;
	}


	public void setEstado_registro(String estado_registro) {
		this.estado_registro = estado_registro;
	}

	public int getSubcategoria_id() {
		return subcategoria_id;
	}

	public void setSubcategoria_id(int subcategoria_id) {
		this.subcategoria_id = subcategoria_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUrl_imagen() {
		return url_imagen;
	}

	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
