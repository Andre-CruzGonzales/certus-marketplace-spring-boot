package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Empresa;

@Repository
public interface IEmpresa extends CrudRepository<Empresa, Integer> {

}
