package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Carro;

/**
 * Servlet implementation class AluguelServlet
 */
public class AluguelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private List<Carro> carros = new ArrayList<>();
	
	public void init() throws ServletException {
		carros.add(new Carro("Carro A"));
		carros.add(new Carro("Carro B"));
		carros.add(new Carro("Carro C"));
	}
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("carros", carros);
		request.getRequestDispatcher("aluguelCarro.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");
		String modelo = request.getParameter("modelo");
		
		String mensagem = "";
		
		Carro carroSelecionado = null;
		String indisponivel = "";
		for(Carro carro : carros) {
			if(carro.getModelo().equals(modelo)) {
				carroSelecionado = carro;
				break;
			}
		}
		
		
		if (carroSelecionado != null) {
			if(acao.equals("alugar")) {
				if(carroSelecionado.isDisponivel()) {
					carroSelecionado.alugar();
					carroSelecionado.setDisponivel(false);
					mensagem = "Operação realizada com sucesso";
				} else {
					mensagem = "Carro indisponível";
				}
				
			} else if (acao.equals("devolver")) {
				if(!carroSelecionado.isDisponivel()) {
					carroSelecionado.desvolver();
					carroSelecionado.setDisponivel(true);
					mensagem = "Operação realizada com sucesso";
				}
			}
		}
		
		
		
		request.setAttribute("carros", carros);
		request.setAttribute("indisponivel", indisponivel);
		request.setAttribute("mensagem", mensagem);
		request.getRequestDispatcher("aluguelCarro.jsp").forward(request, response);
		
	} 

}









