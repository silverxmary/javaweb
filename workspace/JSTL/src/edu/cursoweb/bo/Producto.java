package edu.cursoweb.bo;

public class Producto {
 private Long id; 
 private String nombre;
 private double costo;
 private int cantidad;

 public Producto(Long id, String nombre, double costo, int cantidad) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.costo = costo;
	this.cantidad = cantidad;
}
 
public Producto(){}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getCosto() {
	return costo;
}

public void setCosto(double costo) {
	this.costo = costo;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
 
 
 
 
 
}
