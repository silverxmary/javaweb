package edu.curso.java.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Paso2Servlet
 */
@WebServlet({ "/Paso2Servlet", "/paso2" })
public class Paso2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Paso2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String campoText = request.getParameter("campoText");
		request.setAttribute("contenidoCampoTexto", campoText);
		request.getRequestDispatcher("/ejemplosJsp/paso3.jsp").forward(request, response);
	}

}
