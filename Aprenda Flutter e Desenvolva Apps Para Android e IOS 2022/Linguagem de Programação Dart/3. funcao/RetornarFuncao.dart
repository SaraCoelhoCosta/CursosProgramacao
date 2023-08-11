main() {
  /* Função recebe parâmentro extreno e retorna uma função que 
   * recebe parâmetro interno.
   */
  print(somaParcial(2)(10));

  // Função anônima recebe função que recebe parâmetro externo.
  var somaCom10 = somaParcial(10);

  // Função anômima recebe parâmentro interno a uma função.
  print(somaCom10(3));
  print(somaCom10(7));
  print(somaCom10(19));
}

// Função recebe parâmetro externo e retorna uma função.
int Function(int) somaParcial(int a) {
  int c = 0;

  // Função interna recebe parâmetro e é o retorno da função externa.
  return (int b) {
    return a + b + c; // Retorno da função interna
  };
}
