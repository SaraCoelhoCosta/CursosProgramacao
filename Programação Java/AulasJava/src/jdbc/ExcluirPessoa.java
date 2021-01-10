package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {

		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o codigo do registro que sera exluido: ");
		int codigo = entrada.nextInt();
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Registro removido com sucesso!");
		}
		else {
			System.out.println("Codigo nao encontrado!");
		}
		System.out.println("Linhas afetadas: " + contador);

		stmt.close();
		entrada.close();
		conexao.close();
	}
}
