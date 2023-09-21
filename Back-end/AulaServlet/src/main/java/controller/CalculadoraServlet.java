package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalculadoraServlet
 */
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		String operacao = request.getParameter("operacao");
		
		double resultado = 0;
		
		switch(operacao) {
		
		case "soma":
			resultado = num1 +num2;
			break;
			
		case "subtracao":
			resultado = num1 - num2;
			break;
			
		case "multiplicacao":
			resultado = num1 * num2;
			break;
			
		case "divisao":
			resultado = num1 / num2;
			break;	
		}

		out.println("<html><body><h1>Resultado: " +  resultado + "</h1></body></html>");		
		out.close();
	}

}
