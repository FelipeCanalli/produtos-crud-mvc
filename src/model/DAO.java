package model;

import java.sql.Connection;

public class DAO {

	/*** Conexão com o Banco de Dados ***/
	Connection con = null;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbpizzaria?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";

}
