main() {
  // Lista de maps.
  var alunos = [
    {'nome': 'Alfredo', 'nota': 9.9},
    {'nome': 'Wilson', 'nota': 9.3},
    {'nome': 'Mariana', 'nota': 8.7},
    {'nome': 'Guilherme', 'nota': 8.1},
    {'nome': 'Ana', 'nota': 7.6},
    {'nome': 'Ricardo', 'nota': 6.8},
  ];

  // Funções.
  // Percorre lista e entra no Map (tipo de dado) retornando os nomes.
  String Function(Map) pegarApenasONome = (aluno) => aluno['nome'];

  // Recebe uma string e retorna o tamanho.
  int Function(String) qtdeDeLetras = (texto) => texto.length;

  // Recebe valores double e retorna o dobro.
  int Function(int) dobro = (numero) => numero * 2;

  /* Variável recebe lista que é passado para uma função de mapeamento 
   * (map - não é o tipo de dado) e pega os 'nomes', em seguida entra em outro 
   * map e retorna a quantidade de letras, a ação é repetida para um novo map 
   * que dobra os valores recebidos.
   */
  // map() - transforma uma estrutura iteravél em outra (?).
  var resultado = alunos.map(pegarApenasONome).map(qtdeDeLetras).map(dobro);

  print(resultado);
}
