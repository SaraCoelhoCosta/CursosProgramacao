main() {
  /* var - inferência (identifica o tipo recebido 
   * e não pode ser alterado depois).
   */
  var n1 = 2;
  var n2 = 4.56;
  var t1 = "Texto";

  print(n1 + n2);

  // runtimeType - retorna o tipo da variável.
  print(n1.runtimeType);
  print(n2.runtimeType);
  print(t1.runtimeType);

  /* n1 is int - verifica se a variável(n1) é do tipo int e 
   * retorna a resposta em booleano.
   */
  print(n1 is int);
  print(n1 is String);
}
