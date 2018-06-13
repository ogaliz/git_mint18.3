package com.ogalvez.servletpruebas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//especificamos formato de respuesta.
		PrintWriter salida = response.getWriter();
		
		//generar la respuesta de la petición
		salida.println("<html><body>");
		salida.println("<h1>Prueba Servlet</h1>");
		salida.println("");
		salida.println("<p>De papichuleo</p>");
		salida.println("");
		salida.println("");
		salida.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
