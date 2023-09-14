package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MapServlet
 */
public class MapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Map<String, String[]> parametros = request.getParameterMap();
		
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h2>Paramentros do Formulario</h2>");
		out.println("<ul>");
		
		for (String key : parametros.keySet()) {
			String parametroKey = key;
			String[] parametrosValores = parametros.get(key);
			
			out.println("<li>" + parametroKey + ": " + Arrays.toString(parametrosValores) + "</li>");
		}
		
		out.println("</ul>");
		out.println("</body></html>");
		out.close();
	}

}
