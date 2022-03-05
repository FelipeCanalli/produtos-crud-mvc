<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
String idproduto = (String) request.getAttribute("idproduto");
String tipo = (String) request.getAttribute("tipo");
String nomeproduto = (String) request.getAttribute("nomeproduto");
String descricao = (String) request.getAttribute("descricao");
String preco = (String) request.getAttribute("preco");
%>
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
	<form name="frmCadastrar" action="update2">
		<h1>Editar Produto</h1>
		<table id="tbl2" class="centralizar table">
			<tr>
				<td><input id="inputId" type="text" name="idproduto" value="<%=idproduto%>"
					readonly /></td>
			</tr>
			<tr>
				<td><label for="tipo">Tipo:</label> <select name="tipo">
						<optgroup label="Atual">

							<option value="<%=tipo%>"><%=tipo%></option>

						</optgroup>
						<optgroup label="Outras opções">
							<option value="Pizza salgada">Pizza salgada</option>
							<option value="Pizza doce">Pizza doce</option>
							<option value="Bebida">Bebida</option>
							<option value="Lanche">Lanche</option>
						</optgroup>
				</select></td>
			</tr>
			<tr>
				<td><input type="text" name="nomeproduto"
					placeholder="Nome do Produto" value="<%=nomeproduto%>" /></td>
			</tr>
			<tr>
				<td><input type="text" name="descricao" placeholder="Descrição"
					value="<%=descricao%>" /></td>
			</tr>
			<tr>
				<td><input type="number" name="preco" placeholder="Preço"
					value="<%=preco%>" /></td>

			</tr>
			<tr>
				<td><input class="btn1" type="button" value="Salvar"
					onclick="validar()"></td>
			</tr>
		</table>

	</form>
	<script src="js/validador.js"></script>

</body>
</html>