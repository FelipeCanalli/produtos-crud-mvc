package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	/*** CRUD - Read ***/
	public ArrayList<JavaBeans> listarContatos() {
		ArrayList<JavaBeans> javabeans = new ArrayList<>();
		String query = "select * from tbproduto order by tipo desc";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String idproduto = rs.getString(1);
				String tipo = rs.getString(2);
				String nomeproduto = rs.getString(3);
				String descricao = rs.getString(4);
				String preco = rs.getString(5);
				javabeans.add(new JavaBeans(idproduto, tipo, nomeproduto, descricao, preco));
			}
			return javabeans;
		} catch (Exception e) {
			System.out.println("Erro: " + e);
			return null;
		}
	}

	/*** CRUD - Update ***/
	public void listarContato(JavaBeans javabeans) {
		String query = "select * from tbproduto where idproduto=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, javabeans.getIdproduto());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				javabeans.setIdproduto(rs.getString(1));
				javabeans.setTipo(rs.getString(2));
				javabeans.setNomeproduto(rs.getString(3));
				javabeans.setDescricao(rs.getString(4));
				javabeans.setPreco(rs.getString(5));
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}

	public void alterarContato(JavaBeans javabeans) {
		String query = "update tbproduto set tipo=?, nomeproduto=?, descricao=?, preco=? where idproduto=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, javabeans.getTipo());
			pst.setString(2, javabeans.getNomeproduto());
			pst.setString(3, javabeans.getDescricao());
			pst.setString(4, javabeans.getPreco());
			pst.setString(5, javabeans.getIdproduto());
			pst.executeUpdate();
			// con.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}
}
