package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Conexao a partir de conexao externa.
public class FabricaConexao {

	public static Connection getConexao() {

		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String user = prop.getProperty("banco.user");
			final String password = prop.getProperty("banco.password");

			return DriverManager.getConnection(url, user, password);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Arquivo com informacoes do banco.
	private static Properties getProperties() throws IOException{
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		
		return prop;
	}

}
