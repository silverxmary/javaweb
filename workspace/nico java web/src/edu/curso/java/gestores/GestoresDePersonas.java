package edu.curso.java.gestores;

import edu.curso.java.servlets.Persona;
import java.sql.*;
import java.util.*;

public class GestoresDePersonas {

	public long altaDePersona(Persona p){
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); //Registra el driver jdbc de mySql contra JAVA
			String url = "jdbc:mysql://127.0.0.1/ejemplojdbc";
			connection = DriverManager.getConnection(url, "root", ""); //Recupera una nueva connection
			connection.setAutoCommit(false);
		
			String sql = "INSERT INTO `ejemplojdbc`.`personas` (nombre, apellido, sexo, email, localidad, esCasado, nota)"
						+ " " +  "VALUES (?, ?, ?, ?, ?, ?, ? );";
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			
			preparedStatement.setString(1, p.getNombre());
			preparedStatement.setString(2, p.getApellido());
			preparedStatement.setString(3, p.getSexo());
			preparedStatement.setString(4, p.getEmail());
			preparedStatement.setString(5, p.getCiudad());
			preparedStatement.setString(6, p.getEsCasado());
			preparedStatement.setString(7, p.getNota());
			
			preparedStatement.execute();
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (Exception e2){}
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {}
		}
		
		return 0 ;
	}

	public void actualizarPersona(Persona p) {
	}

	public void borrarPersona(long id) {

	}

	public Persona recuperarPersona(long id) {
		return null;
	}
	
	public ArrayList<Persona> recuperarPersonas(){
		return recuperarPersonas(null);
	}

	
	public ArrayList<Persona> recuperarPersonas(String textoBuscar) {
		ArrayList<Persona> personas = new ArrayList<>();
		Persona p;
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver"); // Registra el driver jdbc
													// de mySql contra JAVA
			String url = "jdbc:mysql://127.0.0.1/ejemplojdbc";
			connection = DriverManager.getConnection(url, "root", ""); // Recupera
																		// una
																		// nueva
																		// connection
			connection.setAutoCommit(false);

			String sql = "SELECT id, nombre, apellido FROM personas ";
			
			if (textoBuscar != null){
				sql = sql + "WHERE nombre like ? or apellido like ?";
			}

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			if (textoBuscar != null) {
				preparedStatement.setString(1, "%" + textoBuscar + "%");
				preparedStatement.setString(2, "%" + textoBuscar + "%");
			}

			ResultSet resultado = preparedStatement.executeQuery();
			
			while (resultado.next()) {
				p = new Persona();
				p.setId(resultado.getLong("id"));
				p.setNombre(resultado.getString("nombre"));
				p.setApellido(resultado.getString("apellido"));
				personas.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (Exception e2) {
			}
		} finally {
			try {
				connection.close();
			} catch (Exception e2) {
			}
		}
		return personas;
	}
}
