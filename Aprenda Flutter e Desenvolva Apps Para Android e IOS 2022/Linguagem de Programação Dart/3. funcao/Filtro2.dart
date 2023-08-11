main() {
  var notas = [8.2, 7.1, 6.2, 4.4, 3.9, 8.8, 9.1, 5.1];

  // Função anônima recebe parâmetro double e retorna um booleano.
  var notasBoasFuncao = (double nota) => nota >= 7;
  var notasMuitoBoasFuncao = (double nota) => nota >= 8.8;

  /* Variável recebe uma estrutura de dados do tipo double, e enquanto a lista
   * 'notas' é percorrida e filtrada pelo where através de uma função 
   * que o mesmo recebeu, a nota que tiver um retorno verdadeiro 
   * (que é recebido pelo retorno da função passada) é adicionada na variável.
   */
  // where() - Filtra.
  var notasBoas = notas.where(notasBoasFuncao);
  var notasMuitoBoas = notas.where(notasMuitoBoasFuncao);

  print(notas);
  print(notasBoas);
  print(notasMuitoBoas);
}
