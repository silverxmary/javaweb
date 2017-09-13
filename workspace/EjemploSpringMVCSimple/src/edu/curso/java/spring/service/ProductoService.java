package edu.curso.java.spring.service;

import java.util.List;

import edu.curso.java.spring.bo.Producto;

public interface ProductoService {

	public abstract Long guardarProducto(Producto producto);

	public abstract Producto buscarProducto(Long id);

	public abstract List<Producto> buscarProductos();

	public abstract void borrarProducto(long id);

	public abstract void actualizarProducto(Producto producto);

}