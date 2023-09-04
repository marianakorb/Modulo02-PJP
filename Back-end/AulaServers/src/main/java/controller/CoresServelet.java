package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CoresServelet
 */
public class CoresServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] coresSelecionadas = request.getParameterValues("cores");
		

		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2> Cores favoritas: </h2>");
		
		if (coresSelecionadas != null && coresSelecionadas.length > 0) {
			out.println("<ul>");
			
			for(String cor : coresSelecionadas) {
				out.println("<li>" + cor +  "</li>");
			}
			 
			out.println("<ul>");
		} else {
			out.println("<p>Nenhuma cor selecionada</p>");
		}
		out.println("</body></html>");

	}

}
