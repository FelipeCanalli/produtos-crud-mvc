package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {

	/*** Conexão com o Banco de Dados ***/
	Connection con = null;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbpizzaria?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Erro: " + e);
			return null;
		}
		return con;
	}

	/*** CRUD - Create ***/
	public void cadastrarProduto(JavaBeans javabeans) {
		String query = "insert into tbproduto (tipo, nomeproduto, descricao, preco) values (?,?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, javabeans.getTipo());
			pst.setString(2, javabeans.getNomeproduto());
			pst.setString(3, javabeans.getDescricao());
			pst.setString(4, javabeans.getPreco());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}

}
