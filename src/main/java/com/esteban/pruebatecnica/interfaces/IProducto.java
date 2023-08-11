package com.esteban.pruebatecnica.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esteban.pruebatecnica.modelo.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer>{

}
