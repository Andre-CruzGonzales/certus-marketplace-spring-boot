package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Empresa;

public interface IEmpresaService {
	public void create();
	public void update();
	public Empresa getId(int id);
	public ArrayList<Empresa> get();
}
