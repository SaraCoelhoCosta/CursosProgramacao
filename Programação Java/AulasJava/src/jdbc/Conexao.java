package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) throws SQLException {
	
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String password = "Jesuse1000";
	
		Connection conexao = DriverManager.getConnection(url, user, password);
		System.out.println("Conexao realizada com sucesso!");
		conexao.close();
	
	}
}
