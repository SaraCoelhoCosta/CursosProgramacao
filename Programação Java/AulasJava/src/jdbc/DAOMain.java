package jdbc;

public class DAOMain {

	public static void main(String[] args) {

		DAO dao = new DAO();

		// Adiciona nome.
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Joao"));
		System.out.println(dao.incluir(sql, "Ana Julia"));
		System.out.println(dao.incluir(sql, "Djalma Pereira"));


		//String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		//System.out.println(dao.incluir(sql, "Joao", 1001));
		dao.closeConexao();
	}
}
