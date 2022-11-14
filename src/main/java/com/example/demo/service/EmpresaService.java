package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IEmpresa;
import com.example.demo.model.Empresa;
@Service
public class EmpresaService implements IEmpresaService {
	@Autowired
	private IEmpresa empresaRepository;
	private ArrayList<Empresa> empresas = new ArrayList<>();
	@Override
	public void create(Empresa e) {
		empresas.add(e);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empresa getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Empresa> get() {
		// TODO Auto-generated method stub
		//return this.empresas;
		return (ArrayList<Empresa>)empresaRepository.findAll();
	}

}
