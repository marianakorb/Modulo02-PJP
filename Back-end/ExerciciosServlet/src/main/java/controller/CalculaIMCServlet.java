package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CalculaIMCServlet
 */
public class CalculaIMCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double peso = Double.parseDouble(request.getParameter("peso"));
		double altura = Double.parseDouble(request.getParameter("altura"));
		
		double imc = (peso/(altura * altura));
		String resultado = "";
		
		 if (imc <= 18.5) {
		        resultado = "Abaixo do peso";
		    } else if (imc >= 18.6 && imc <= 24.9) {
		        resultado = "com Peso Normal";
		    } else if (imc >= 25 && imc <= 29.9) {
		        resultado = "com Sobrepeso";
		    } else if (imc >= 30 && imc <= 34.9) {
		        resultado = "com Obesidade grau 1";
		    } else if (imc >= 35 && imc <= 39.9) {
		        resultado = "com Obesidade grau 2";
		    } else {
		        resultado = "com Obesidade grau 3";
		    }
		
		request.setAttribute("imc", imc);
		request.setAttribute("resultado", resultado);
		request.getRequestDispatcher("imc.jsp").forward(request, response);
	}

}
