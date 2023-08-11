package com.esteban.pruebatecnica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esteban.pruebatecnica.interfaceService.IventaService;
import com.esteban.pruebatecnica.interfaces.IVenta;
import com.esteban.pruebatecnica.modelo.Venta;

@Service
public class VentaService implements IventaService{
	
	@Autowired
	private IVenta datav;
	
	@Override
	public List<Venta> listar() {
		return (List<Venta>)datav.findAll();
	}

	@Override
	public Optional<Venta> listarId(int id, int cantidad) {
		return datav.findById(id);
	}

	@Override
	public int save(Venta v) {
		int res=0;
		Venta venta=datav.save(v);
		if(!venta.equals(null)) {
			res=1;
		}
		return res;	
	}
}
