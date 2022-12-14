package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CategoriaDto;
import com.example.demo.dto.Mensaje;
import com.example.demo.entity.Categoria;
import com.example.demo.service.CategoriaService;
import com.example.demo.service.ICategoriaService;

import antlr.StringUtils;

@RestController
@RequestMapping("/categoria")
@CrossOrigin()
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/get")
	public ResponseEntity<List<Categoria>> get(){
		List<Categoria> list = categoriaService.get();
		return new ResponseEntity<List<Categoria>>(list, HttpStatus.OK);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Categoria> getId(@PathVariable("id") int id){
		Categoria c = categoriaService.getId(id).get();
		return new ResponseEntity<Categoria>(c,HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody CategoriaDto categoriaDto){
		//if(org.apache.commons.lang3.StringUtils.isBlank())
		Categoria c =  new Categoria(categoriaDto.getNombre(),categoriaDto.getUrl_imagen());
		categoriaService.create(c);
		return new ResponseEntity(new Mensaje("producto creado"),HttpStatus.OK);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") int id,@RequestBody CategoriaDto categoriaDto){
		
		Categoria c =  categoriaService.getId(id).get();
		c.setNombre(categoriaDto.getNombre());
		c.setUrl_imagen(categoriaDto.getUrl_imagen());
		categoriaService.create(c);
		return new ResponseEntity(new Mensaje("producto actualizado"),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		categoriaService.delete(id);
		return new ResponseEntity(new Mensaje("categoria eliminado") ,HttpStatus.OK);
	}
}
