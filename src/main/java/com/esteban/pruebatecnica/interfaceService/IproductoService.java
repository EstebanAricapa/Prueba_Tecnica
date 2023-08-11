package com.esteban.pruebatecnica.interfaceService;

import java.util.List;
import java.util.Optional;

import com.esteban.pruebatecnica.modelo.Producto;

public interface IproductoService {
	public List<Producto>listar();
	public Optional<Producto>ListarId(int id);
	public int save(Producto p);
	public void delete(int id);
}
