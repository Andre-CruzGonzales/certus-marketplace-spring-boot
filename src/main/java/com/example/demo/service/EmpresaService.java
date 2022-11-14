package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IEmpresa;
import com.example.demo.model.Empresa;
@Service
public class EmpresaService implements IEmpresaService {
	@Autowired
	private IEmpresa empresaRepository;
	//private ArrayList<Empresa> empresas = new ArrayList<>();
	@Override
	public boolean create(Empresa e) {
		//empresas.add(e);
		Empresa emp = new Empresa();
		emp =empresaRepository.save(e);
		if(emp.getId()>0) {
			return true;
		}
		return false;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Empresa> getId(int id) {
		// TODO Auto-generated method stub
		Optional<Empresa> e = Optional.empty();
		
		e = empresaRepository.findById(id);
		return e;
	}

	@Override
	public ArrayList<Empresa> get() {
		// TODO Auto-generated method stub
		//return this.empresas;
		return (ArrayList<Empresa>)empresaRepository.findAll();
	}

	@Override
	public boolean editar(Empresa e) {
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public void delete(int id) {
		empresaRepository.deleteById(id);
		
	}

}
