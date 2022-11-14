package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
@Table(name="empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotEmpty(message = "La razon socuial no debe ser vacio")
	@Size(min = 3,max = 150)
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
