package com.esteban.pruebatecnica.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.esteban.pruebatecnica.modelo.Venta;

@Repository
@Transactional
public interface IVenta extends CrudRepository<Venta, Integer>{

}
