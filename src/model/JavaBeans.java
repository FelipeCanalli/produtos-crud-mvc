package model;

public class JavaBeans {
	private String idproduto;
	private String tipo;
	private String nomeproduto;
	private String descricao;
	private String preco;

	// Construtor padrão
	public JavaBeans() {

	}

	// Construtor que recebe o ArrayList do método listarConstatos() (DAO)
	public JavaBeans(String idproduto, String tipo, String nomeproduto, String descricao, String preco) {
		this.idproduto = idproduto;
		this.tipo = tipo;
		this.nomeproduto = nomeproduto;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(String idproduto) {
		this.idproduto = idproduto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

}
