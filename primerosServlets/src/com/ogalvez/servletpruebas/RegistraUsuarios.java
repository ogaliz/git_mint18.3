package com.ogalvez.servletpruebas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistraUsuarios
 */
@WebServlet("/RegistraUsuarios")
public class RegistraUsuarios extends HttpServlet {

	private static final long serialVersionUID = 1L;
 
    public RegistraUsuarios() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter salida = response.getWriter();
		
		salida.println("<html><body>");
		salida.println("<h1>Prueba Servlet numero 2</h1>");
		salida.println("");
		salida.println("<p>Nombre introducido: </p>"+request.getParameter("nombre"));
		salida.println("<br>");
		salida.println("Para ello utilizamos los atributos de tipo name del formulario");
		salida.println("<br>");
		salida.println("<p>Apellido introducido: </p>"+request.getParameter("apellido"));
		salida.println("</body></html>");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		//si queremos enviar los datos a través de POST, debemos utilizar esta instruccion
		//indicando que la respuesta es de tipo HTML. 
		response.setContentType("text/html");
	}

}
