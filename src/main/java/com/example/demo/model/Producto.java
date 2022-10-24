package com.example.demo.model;

public class Producto {
	private int id;
	private String nombre;
	private double precio_venta;
	private char estado_registro;
	private Categoria categoria;
	private Marca marca;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public char getEstado_registro() {
		return estado_registro;
	}
	public void setEstado_registro(char estado_registro) {
		this.estado_registro = estado_registro;
	}
	
		
}
