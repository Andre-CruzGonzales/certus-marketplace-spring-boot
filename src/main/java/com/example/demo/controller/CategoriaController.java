package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ICategoriaService;


@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private ICategoriaService categoriaService;
	@GetMapping("/create")
	public String create() {
		return "categoria-create";
	}
}
