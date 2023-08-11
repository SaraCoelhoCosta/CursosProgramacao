main() {
  // Lista.
  var notas = [8.2, 7.3, 6.8, 5.4, 2.7, 9.3];
  // Função anônima que recebe String e retorna booleano.
  var boasNotasFuncao = (double nota) => nota >= 7.5;

  // Função em uma variável recebe double e retorna booleano.
  // OU filtrar<double>(notas, boasNotasFuncao);
  var somenteNotasBoas = filtrar(notas, boasNotasFuncao);

  print(somenteNotasBoas);

  // Lista.
  var nomes = ['Ana', 'Bia', 'Rebeca', 'Gui', 'João'];
  // Função anônima que recebe String e retorna booleano.
  var nomesGrandesFuncao = (String nome) => nome.length >= 5;

  print(filtrar(nomes, nomesGrandesFuncao));
}

// Função recebe uma lista e uma função e retorna uma lista.
List<E> filtrar<E>(List<E> lista, bool Function(E) funcao) {
  List<E> listaFiltrada = [];

  // Percorre a lista.
  for (E elemento in lista) {
    // Chama a função no if para verificar.
    if (funcao(elemento)) {
      // Adiciona elemento em uma lista.
      listaFiltrada.add(elemento);
    }
  }

  // Retorna uma lista.
  return listaFiltrada;
}
