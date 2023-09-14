package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RealParaDolarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	double taxa = 4.93;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Double dolar = Double.parseDouble(request.getParameter("valorDolar"));
		Double real = dolar * taxa;
		
		request.setAttribute("real", real);
		
		request.getRequestDispatcher("converterReal.jsp").forward(request, response);
	}

}
