function validar() {
	let nomeproduto = frmCadastrar.nomeproduto.value
	let preco = frmCadastrar.preco.value

	if (nomeproduto === "") {
		alert("Prencha o campo 'Nome Produto' ")
		frmCadastrar.nomeproduto.focus()
		return false

	} else if (preco === "") {
		alert("Prencha o campo 'Preço' ")
		frmCadastrar.preco.focus()
		return false
	} else {
		document.forms["frmCadastrar"].submit()
	}

}