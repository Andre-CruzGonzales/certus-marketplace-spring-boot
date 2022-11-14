package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.model.Empresa;

public interface IEmpresaService {
	public boolean create(Empresa e);
	public void update();
	public Optional<Empresa> getId(int id);
	public ArrayList<Empresa> get();
	public boolean editar(Empresa e);
	public void delete(int id);
}
