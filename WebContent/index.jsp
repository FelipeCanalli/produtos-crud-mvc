<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.DAO"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="icon" href="img/pizza-icon.png" />
<title>Produtos Cadastrados</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>

	<div id="header">
		<h1>Produtos Cadastrados</h1>
	</div>
	<div id="caixaBtn">
		<a class="btn1" href="cadastro.jsp">Cadastrar Produto</a>
	</div>


	<table id="tbl1">
		<thead>
			<tr>
				<th>id</th>
				<th>Tipo</th>
				<th>Nome do produto</th>
				<th>Descrição</th>
				<th>Preço</th>
				<th colspan="2">Ações</th>
			</tr>
		</thead>
		<tbody>
			<%
				DAO dao = new DAO();
			ArrayList<JavaBeans> javabeans = dao.listarContatos();
			for (int i = 0; i < javabeans.size(); i++) {
			%>
			<tr>
				<td><%=javabeans.get(i).getIdproduto()%></td>
				<td><%=javabeans.get(i).getTipo()%></td>
				<td><%=javabeans.get(i).getNomeproduto()%></td>
				<td><%=javabeans.get(i).getDescricao()%></td>
				<td>R$ <%=javabeans.get(i).getPreco()%></td>
				<td><a
					href="update1?idproduto=<%=javabeans.get(i).getIdproduto()%>"><img
						class="img-btn" alt="Editar" src="img/edit.png"></a></td>
				<td><a
					href="delete?idproduto=<%=javabeans.get(i).getIdproduto()%>"><img
						class="img-btn" alt="Excluir" src="img/delete.png"></a></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>

</body>
</html>