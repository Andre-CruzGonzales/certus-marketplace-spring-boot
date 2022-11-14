package com.example.demo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IEmpresa;
import com.example.demo.model.Empresa;
import com.example.demo.model.Response;
@Service
public class EmpresaService implements IEmpresaService {
	@Autowired
	private IEmpresa empresaRepository;
	//private ArrayList<Empresa> empresas = new ArrayList<>();
	@Override
	public boolean create(Empresa e) {
		//empresas.add(e);
		
		Empresa emp =empresaRepository.save(e);
		if(!emp.equals(null)) {
			return true;
		}
		return false;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Empresa> getId(int id) {
		// TODO Auto-generated method stub
		//Optional<Empresa> e = Optional.empty();
		
		//e = empresaRepository.findById(id);
		//return e;
		return empresaRepository.findById(id);
	}

	@Override
	public Response<Empresa> get() {
		// TODO Auto-generated method stub
		//return this.empresas;
		Response<Empresa> response= new Response<>();
		try {
			response.setList( (ArrayList<Empresa>)empresaRepository.findAll());
			response.setStatus(true);
			response.setMsg("Listado Correctamente");
			response.setMsgError("");
		} catch (Exception e) {
			
			response.setStatus(false);
			response.setMsg("Ocurrio un error");
			response.setMsgError(e.getStackTrace().toString());
			// TODO: handle exception
		}
		return response;
	}

	@Override
	public void delete(int id) {
		empresaRepository.deleteById(id);
		
	}

}
