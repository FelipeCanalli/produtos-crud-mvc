package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

/*** Ajustando o path para as rotas ***/
@WebServlet(urlPatterns = { "/Controller", "/insert", "/update1", "/update2", "/delete" })

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	JavaBeans javabeans = new JavaBeans();
	DAO dao = new DAO();

	public Controller() {
		super();
	}

	/*** Método principal do servlet (controller) ***/
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		if (action.equals("/insert")) {
			novoProduto(request, response);

		} else if (action.contentEquals("/update1")) {
			editarProduto(request, response);

		} else if (action.contentEquals("/update2")) {
			editarProduto2(request, response);

		} else if (action.contentEquals("/delete")) {
			excluirProduto(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void novoProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

	protected void editarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idproduto = request.getParameter("idproduto");
		javabeans.setIdproduto(idproduto);
		dao.listarContato(javabeans);

		request.setAttribute("idproduto", javabeans.getIdproduto());
		request.setAttribute("tipo", javabeans.getTipo());
		request.setAttribute("nomeproduto", javabeans.getNomeproduto());
		request.setAttribute("descricao", javabeans.getDescricao());
		request.setAttribute("preco", javabeans.getPreco());
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);

	}

	protected void editarProduto2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		javabeans.setIdproduto(request.getParameter("idproduto"));
		javabeans.setTipo(request.getParameter("tipo"));
		javabeans.setNomeproduto(request.getParameter("nomeproduto"));
		javabeans.setDescricao(request.getParameter("descricao"));
		javabeans.setPreco(request.getParameter("preco"));

		dao.alterarContato(javabeans);

		response.sendRedirect("index.jsp");
	}

	protected void excluirProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idproduto = request.getParameter("idproduto");
		javabeans.setIdproduto(idproduto);

		dao.deletarContato(javabeans);

		response.sendRedirect("index.jsp");
	}
}
