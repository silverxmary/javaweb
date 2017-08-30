package edu.curso.java.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.curso.java.gestores.GestoresDePersonas;

/**
 * Servlet implementation class AltaPersona
 */
@WebServlet({"/AltaPersona"})
public class AltaPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaPersona() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		String ciudad= request.getParameter("ciudad");
		String nota = request.getParameter("nota");
		String esCasado = request.getParameter("esCasado");
		
		GestoresDePersonas gestorDePersonas = new GestoresDePersonas();
		
		Persona persona = new Persona();
		
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setEmail(email);
		persona.setSexo(sexo);
		persona.setCiudad(ciudad);
		persona.setNota(nota);
		persona.setEsCasado(esCasado);
		
		gestorDePersonas.altaDePersona(persona);
		
		request.setAttribute("persona", persona);
		
		System.out.println("Nombre: " + nombre);
		
		request.getRequestDispatcher("Personas/vistaPersona.jsp").forward(request, response);
		
	}

}
