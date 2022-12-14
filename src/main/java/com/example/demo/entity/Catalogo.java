package com.example.demo.entity;

public class Catalogo {
	private int id;
	private String nombre;
	private double precio_venta;
	private Categoria categoria;
	private Marca marca;
	private Producto producto;
	
	public Catalogo() {
		
	}
	
	

	public Catalogo(int id, String nombre, double precio_venta, Categoria categoria, Marca marca, Producto producto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio_venta = precio_venta;
		this.categoria = categoria;
		this.marca = marca;
		this.producto = producto;
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	

	
	

}
