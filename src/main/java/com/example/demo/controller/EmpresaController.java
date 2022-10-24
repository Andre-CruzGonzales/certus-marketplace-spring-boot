package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Empresa;
import com.example.demo.service.IEmpresaService;


@Controller
@RequestMapping("/empresa")
public class EmpresaController {
	@Autowired
	private IEmpresaService empresaService;
	@GetMapping("/formCreate")
	public String formCreate() {
		
		return "empresa-create";
	}
	@PostMapping("/create")
	public String create(@Validated Empresa e,BindingResult br,Model model) {
		model.addAttribute("error", false );
		if(br.hasErrors()) {
			model.addAttribute("error", true );
			return "empresa-create";
		}
		empresaService.create(e);
//		System.out.println(e);
		model.addAttribute("listaEmpresa", empresaService.get());
		return "empresa-list";
	}
	@GetMapping("/list")
	public String get(Model model) {
		model.addAttribute("listaEmpresa", empresaService.get());
		return "empresa-list";
	}
}
