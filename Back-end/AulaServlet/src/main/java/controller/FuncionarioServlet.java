package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Funcionario;

/**
 * Servlet implementation class FuncionarioServlet
 */
public class FuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String setor = request.getParameter("setor");
		String funcao = request.getParameter("funcao");
		
		List<Funcionario> funcionarios =  new ArrayList<>();
		funcionarios.add(new Funcionario(nome, setor, funcao));
		
		request.setAttribute("listaFuncionarios", funcionarios);
		request.getRequestDispatcher("listaFuncionarios.jsp").forward(request, response);
		
	}

}
