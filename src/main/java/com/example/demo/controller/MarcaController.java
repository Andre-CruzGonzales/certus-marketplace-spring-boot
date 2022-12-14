package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.example.demo.entity.Empresa;
import com.example.demo.entity.Marca;
import com.example.demo.service.IEmpresaService;
import com.example.demo.service.IMarcaService;

//@Controller
//@RequestMapping("/marca")
public class MarcaController {
//	@Autowired
//	private IMarcaService marcaService;
//	@GetMapping("/form")
//	public String formCreate(Model model) {
//		model.addAttribute("marca",new Empresa());
//		
//		return "marca-create";
//	}
//	
//	
//	@PostMapping("/crear")
//	public String create(@Validated Marca e,BindingResult br,Model model,SessionStatus status) {
//		model.addAttribute("error", false );
//		
//		if(br.hasErrors()) {
//			model.addAttribute("error", true );
//			return "marca-create";
//		}
//		marcaService.create(e);
//			model.addAttribute("listaMarca", marcaService.get());
//			System.out.println("entr");
//		//	return "empresa-list";
//		
//		status.setComplete();
//		return "redirect:/marca/list";
//		
////		System.out.println(e);
//		
//	}
//	
//	
//	@GetMapping("/list")
//	public String get(Model model) {
//		model.addAttribute("listaMarca", marcaService.get().getList());
//		return "marca-list";
//	}
}
