package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

@WebServlet("/Controller")

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	JavaBeans javabeans = new JavaBeans();
	DAO dao = new DAO();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Método principal do Servlet
		String tipo = request.getParameter("tipo");
		String nomeproduto = request.getParameter("nomeproduto");
		String descricao = request.getParameter("descricao");
		String preco = request.getParameter("preco");
		javabeans.setTipo(tipo);
		javabeans.setNomeproduto(nomeproduto);
		javabeans.setDescricao(descricao);
		javabeans.setPreco(preco);
		dao.cadastrarProduto(javabeans);
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
