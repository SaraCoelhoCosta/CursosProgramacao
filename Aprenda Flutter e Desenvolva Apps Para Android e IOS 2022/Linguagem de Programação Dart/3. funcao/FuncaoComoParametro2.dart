main() {
  print('Teste');

  var meuPrint = (String texto) {
    print(texto);
    return texto;
  };

  int tamanho = executarPor(10, meuPrint, 'Muito legal');
  print('O tamanho da string é $tamanho');
}

// Recebe int, função que retorna e recebe uma String e uma String.
int executarPor(int quantidade, String Function(String) funcao, String texto) {
  String textoCompleto = '';
  for (int i = 0; i < quantidade; i++) {
    // Concatena texto.
    textoCompleto += funcao(texto);
  }
  return textoCompleto.length;
}
