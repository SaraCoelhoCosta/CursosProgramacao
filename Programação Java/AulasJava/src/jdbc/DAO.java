package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	private Connection conexao;

	// Faz conexao.
	private Connection getConexao() {
		try {
			if (conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {

		}

		conexao = FabricaConexao.getConexao();
		return conexao;
	}

	// Identifica o atributo da tabela e adiciona(altera ou remove) o valor na tabela. 
	private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {

		int indice = 1;
		for (Object atributo : atributos) {
			if (atributo instanceof String) {
				stmt.setString(indice, (String) atributo);
			} else if (atributo instanceof Integer) {
				stmt.setInt(indice, (Integer) atributo);
			} else if (atributo instanceof Double) {
				stmt.setDouble(indice, (Double) atributo);
			} else if (atributo instanceof Boolean) {
				stmt.setBoolean(indice, (Boolean) atributo);
			}
			indice++;
		}
	}

	// Fecha conexao.
	public void closeConexao() {
		try {
			getConexao().close();
		} catch (SQLException e) {

		} finally {
			conexao = null;
		}
	}

	// Adiciona elementos na tabela.
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(stmt, atributos);

			if (stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();

				if (resultado.next()) {
					return resultado.getInt(1);
				}
			}

			return -1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
