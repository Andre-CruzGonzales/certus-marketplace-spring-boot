package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ICatalogoService;


@Controller
@RequestMapping("/catalogo")
public class CatalogoController {
	@Autowired
	private ICatalogoService catalogoService;
	@GetMapping("/create")
	public String create() {
		return "catalogo-create";
	}

}
