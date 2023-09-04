package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SaudacaoServelet
 */
public class SaudacaoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeInformado = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2> Olá, " + nomeInformado + "</h2>");
		out.println("</body></html>");

	}

}
