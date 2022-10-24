package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Rol;

public interface IRolService{
	public void create();
	public void update();
	public Rol getId(int id);
	public ArrayList<Rol> get();
}
