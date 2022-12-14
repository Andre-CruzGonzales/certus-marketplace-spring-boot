package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Empresa;
import com.example.demo.entity.Response;

public interface IEmpresaService {
	public Response<Empresa> get();
	public boolean create(Empresa e);
	public Optional<Empresa> getId(int id);
	public void delete(int id);
}
