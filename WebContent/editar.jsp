<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Produtos Cadastrados</title>
</head>
<body>
	<form name="frmCadastrar" action="update1">
		<h1>Editar Produto</h1>
		<table>
			<tr>
				<td><input type="number" name="idproduto" readonly /></td>
			</tr>
			<tr>
				<td><label for="tipo">Tipo:</label> <select name="tipo">
						<option value="Pizza salgada">Pizza salgada</option>
						<option value="Pizza doce">Pizza doce</option>
						<option value="Bebida">Bebida</option>
						<option value="Lanche">Lanche</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="text" name="nomeproduto"
					placeholder="Nome do Produto" /></td>
			</tr>
			<tr>
				<td><input type="text" name="descricao" placeholder="Descrição" />
				</td>
			</tr>
			<tr>
				<td><input type="number" name="preco" placeholder="Preço" /></td>
			</tr>
		</table>
		<input type="button" value="Salvar" onclick="validar()">
	</form>
	<script src="js/validador.js"></script>
</body>
</html>