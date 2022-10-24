package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
   @Autowired    
	private IProductoService productoService;
   @GetMapping("/registroproducto")
   public void registroproducto() {
	   
   }
}
