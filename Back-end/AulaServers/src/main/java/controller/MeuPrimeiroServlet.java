package controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MeuPrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getContextPath();
		
		String[] pessoas = {"João", "Maria", "Fabio", "Rogerio"};
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<html><body>");
		out.println("<h2 style='color: red'> Ola, mundo!!</h2>");
		out.println("<h3> Nome do projeto: " + path + "</h3>");
		out.println("Pessoas ");
		out.println("<ul>");
		for(String pessoa : pessoas) {
			out.println("<li>" + pessoa + "</li>");
			
		}
		out.println("</ul>");
		
		out.println("</body></html>");
	}

}
