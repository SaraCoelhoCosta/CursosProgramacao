package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBD {

	public static void main(String[] args) throws SQLException {

		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String password = "Jesuse1000";

		// Realiza conexao.
		Connection conexao = DriverManager.getConnection(url, user, password);
		// Connection conexao = FabricaConexao.getConexao();

		Statement stmt = conexao.createStatement();
		// Comandos para banco de dados.
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

		System.out.println("Banco de dados criado com sucesso!");

		// Finaliza conexao.
		conexao.close();
	}
}
