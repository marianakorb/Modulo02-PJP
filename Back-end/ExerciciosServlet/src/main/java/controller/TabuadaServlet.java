package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TabuadaServlet
 */
public class TabuadaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<String> tabuada = new ArrayList<>();
		
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		
		if(n1 > n2) {
			
			for(int i = n2; i <= n1; i++) {
				
				for(int j = 1; j <= 10; j++) {
					tabuada.add(i + " x " + j + " = " + (i*j));
				}
				tabuada.add("<br>");
				
			}
			
		} else {
			
			{for(int i = n1; i <= n2; i++) 
				for(int j = 1; j <= 10; j++) {
					tabuada.add(i + " x " + j + " = " + (i*j));
				}
				tabuada.add("<br>");
			}
		}
		
		request.setAttribute("tabuada", tabuada);
		request.getRequestDispatcher("tabuada.jsp").forward(request, response);
		
		
	}

}
