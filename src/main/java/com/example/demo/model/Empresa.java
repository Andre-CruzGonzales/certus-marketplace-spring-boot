package com.example.demo.model;

public class Empresa {
	private int id;
	private String razonSocial;
	private String numeroDocumento;
	private String celular;
	private String direccion;
	//private Usuario usuario;
	public Empresa() {
		
	}
	
	public Empresa(int id, String razonSocial, String numeroDocumento, String celular, String direccion) {
		super();
		this.id = id;
		this.razonSocial = razonSocial;
		this.numeroDocumento = numeroDocumento;
		this.celular = celular;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Razon Social"+this.razonSocial;
	}
	
}
