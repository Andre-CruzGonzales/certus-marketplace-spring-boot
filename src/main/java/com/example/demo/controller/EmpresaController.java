package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.example.demo.entity.Empresa;
import com.example.demo.service.IEmpresaService;


@Controller
@RequestMapping("/empresa")
public class EmpresaController {
	@Autowired
	private IEmpresaService empresaService;
	@GetMapping("/formCreate")
	public String formCreate(Model model) {
		model.addAttribute("empresa",new Empresa());
		
		return "empresa-create";
	}
	
	
	@PostMapping("/create")
	public String create(@Validated Empresa e,BindingResult br,Model model,SessionStatus status) {
		model.addAttribute("error", false );
		
		if(br.hasErrors()) {
			model.addAttribute("error", true );
			return "empresa-create";
		}
		empresaService.create(e);
			model.addAttribute("listaEmpresa", empresaService.get());
			System.out.println("entr");
		//	return "empresa-list";
		
		status.setComplete();
		return "redirect:/empresa/list";
		
//		System.out.println(e);
		
	}
	
	
	@GetMapping("/list")
	public String get(Model model) {
		model.addAttribute("listaEmpresa", empresaService.get().getList());
		return "empresa-list";
	}
	
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Empresa> e = empresaService.getId(id);
		
		model.addAttribute("empresa",e);
		return "empresa-create";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		empresaService.delete(id);
		System.out.println("eliminadoooo=>"+id);
		
		return "redirect:/empresa/list";
	}
	
}
