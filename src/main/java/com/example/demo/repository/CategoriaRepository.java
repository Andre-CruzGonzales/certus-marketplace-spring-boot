package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
	Optional<Categoria> findByNombre(String nombre);
	boolean existsByNombre(String nombre);
	
}
