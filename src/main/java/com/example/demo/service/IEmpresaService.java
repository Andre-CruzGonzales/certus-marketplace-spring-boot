package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Empresa;
import com.example.demo.model.Response;

public interface IEmpresaService {
	public Response<Empresa> get();
	public boolean create(Empresa e);
	public Optional<Empresa> getId(int id);
	public void delete(int id);
}
