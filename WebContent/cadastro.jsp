<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Produtos Cadastrados</title>
</head>
<body>
	<h1>Cadastrar Produto</h1>
	<form name="frmCadastrar" action="Controller">
		<table>
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
		<input type="button" value="Adicionar" onclick="validar()">
	</form>
	<script src="js/validador.js"></script>
</body>
</html>
