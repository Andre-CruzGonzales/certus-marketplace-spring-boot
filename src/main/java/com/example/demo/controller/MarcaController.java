package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.IMarcaService;


@Controller 
@RequestMapping("/marca")
public class MarcaController {
	@Autowired
	private IMarcaService marcaService;
	@GetMapping("/create")
	public String create() {
		return "marca-create";
	}

}
