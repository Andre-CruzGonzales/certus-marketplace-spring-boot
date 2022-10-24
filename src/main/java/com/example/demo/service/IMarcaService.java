package com.example.demo.service;

import java.util.ArrayList;
import com.example.demo.model.Marca;

public interface IMarcaService {
	public void create();
	public void update();
	public Marca getId(int id);
	public ArrayList<Marca> get();

}
