main() {
  // Parece um cast, convertendo de variável para função (?).
  int Function(int, int) soma1 = somaFuncao;
  print(soma1(20, 313));

  // Função anônima (sem nome)
  int Function(int, int) soma2 = (x, y) {
    return x + y;
  };

  var soma3 = ([int x = 1, int y = 1]) {
    return x + y;
  };
  print(soma2(20, 313));
  print(soma3(20));
  print(soma3());
}

int somaFuncao(int a, int b) {
  return a + b;
}
