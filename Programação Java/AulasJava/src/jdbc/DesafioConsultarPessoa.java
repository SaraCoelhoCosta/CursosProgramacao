package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsultarPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);	
		// Cria conexao.
		Connection conexao = FabricaConexao.getConexao();
		
		// Solicita dados para usuario.
		System.out.print("Digite letra ou palavra para pesquisa: ");
		String busca = entrada.nextLine();

		// Busca informacoes registradas na tabela 'pessoas' a partir do que foi dado pelo usuario.
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + busca + "%");
		ResultSet resultado =  stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		// Identifica pessoas.
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		// Exibe lista.
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		entrada.close();
		stmt.close();
		conexao.close();
	}
}
