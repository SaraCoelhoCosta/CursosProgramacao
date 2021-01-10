package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistro {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();

		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		// Verifica linha de informacoes da tabela pessoas a partir do codigo.
		System.out.print("Digite codigo da pessoa: ");
		int id = entrada.nextInt();

		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("Nome atual e: " + p.getNome());
			entrada.nextLine();

			// Alteracao de dados.
			System.out.print("Digite o novo nome: ");
			String novoNome = entrada.nextLine();

			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, id);
			stmt.execute();
		} else {
			System.out.println("Pessoa nao encontrada!");
		}

		entrada.close();
		stmt.close();
		conexao.close();
	}
}
