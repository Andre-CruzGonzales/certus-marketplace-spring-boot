package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Producto;
import com.example.demo.service.ProductoServicio;

@RestController
@RequestMapping("producto")
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio productoServicio;
	
	@GetMapping("/get")
	public String verPaginaDeInicio(Model modelo) {
		List<Producto> listaProductos = productoServicio.listAll();
		modelo.addAttribute("listaProductos", listaProductos);
		return "index";
	}
	
	
	
	@PostMapping(value = "/create")
	public String guardarProducto(@ModelAttribute("producto")Producto producto) {
		productoServicio.save(producto);
		return "redirect:/";
	}
	
	@PutMapping("/editar/{id}")
	public ModelAndView mostrarFormularioDeEditarProducto(@PathVariable(name = "id") Long id) {
		ModelAndView modelo = new ModelAndView("editar_producto");
		
		Producto producto = productoServicio.get(id);
		modelo.addObject("producto",producto);
		
		return modelo;
	}
	@RequestMapping("/eliminar/{id}")
	public String eliminarProducto(@PathVariable(name = "id") Long id) {
		productoServicio.delete(id);
		return "redirect:/";
	}
}
