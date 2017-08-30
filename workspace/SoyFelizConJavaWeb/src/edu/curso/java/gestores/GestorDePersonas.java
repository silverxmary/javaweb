package edu.curso.java.gestores;
 import java.util.ArrayList;
import java.sql.*;
import java.util.*;

import edu.curso.java.bo.Persona;

public class GestorDePersonas {

	
	public long altaDePersona(Persona p){
		Connection connection =null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); //registra el jdbc de mysql contra java
			String url = "jdbc:mysql://127.0.0.1/ejemplojdbc";
			connection = DriverManager.getConnection(url,"root", ""); //recupera una nueva conexion
			connection.setAutoCommit(false);
			
			String sql = "INSERT INTO personas (nombre, apellido, sexo, email, localidad, escasado, notas) VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, p.getNombre());
			preparedStatement.setString(2, p.getApellido());
			preparedStatement.setString(3, p.getCampoEsCasado());
			preparedStatement.setString(4, p.getEmail());
			preparedStatement.setString(5, p.getLocalidad());
			preparedStatement.setString(6, p.getSexo());
			preparedStatement.setString(7, p.getNotas());
			preparedStatement.execute();
			
			
			connection.commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (Exception e2) {}
			
		
		}finally {
			try {
				connection.close();
			} catch (Exception e2) {}
		}
		
		return 0;
	}
	
	public void actualizaPersona(Persona p){
		
	}
	
	public void borrarPersona(long id){
		
	}
	
	public Persona recuperaPersona(long id){
		String sql = "select id, nombre, apellido, sexo, email, localidad,escasado, notas from personas";
		Connection connection =null;
		
		
		if(textoBuscar != null)
			sql = sql + "WHERE nombre like ? or apellido like ?";
		
		PreparedStatement preparedStatement = connection.preparedStatement(sql);
		if(textoBuscar != null){
			preparedStament.setString(1,"%"+textoBuscar+"%");
			preparedStament.setString(2,"%"+textoBuscar+"%");
		}
		
		ResultSet resultado = preparedStatement.executeQuery();
		while(resultado.next()){
			p=new Persona();
			p.setId(resultado.getLong("id"));
			p.setNombre(resultado.getString("nombre"));
					
		}
		
		return null;
	}
	
	public ArrayList<Persona> recuperarPersonas(String p ){
		ArrayList<Persona> personas = new ArrayList<>();
		
		return personas;
	}
}
