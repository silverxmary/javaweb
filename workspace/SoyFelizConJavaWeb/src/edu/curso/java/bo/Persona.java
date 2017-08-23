package edu.curso.java.bo;

public class Persona {
	
	String nombre ;
	String apellido ;
	String email;
	String sexo;
	String campoEsCasado;
	String notas;
	String localidad ;
	
	
	public Persona(String nombre, String apellido, String email, String sexo,
			String campoEsCasado, String notas, String localidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.sexo = sexo;
		this.campoEsCasado = campoEsCasado;
		this.notas = notas;
		this.localidad = localidad;
	}
	
	
	public Persona(){}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCampoEsCasado() {
		return campoEsCasado;
	}
	public void setCampoEsCasado(String campoEsCasado) {
		this.campoEsCasado = campoEsCasado;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
	
}
