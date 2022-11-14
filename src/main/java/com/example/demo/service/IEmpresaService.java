package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.model.Empresa;

public interface IEmpresaService {
	public ArrayList<Empresa> get();
	public boolean create(Empresa e);
	public Optional<Empresa> getId(int id);
	public void delete(int id);
}
