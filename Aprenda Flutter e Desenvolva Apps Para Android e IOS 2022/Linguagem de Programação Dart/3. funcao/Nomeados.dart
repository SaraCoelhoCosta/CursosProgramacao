main() {
  /* A ordem de entrada pode ser alterada, desde que indique qual o parâmetro
   * está recebendo o dado.
   */
  saudarPessoa(nome: "João", idade: 33);
  saudarPessoa(idade: 47, nome: "Maria");

  imprimirData(7);
  imprimirData(7, ano: 2020);
  imprimirData(7, ano: 2021, mes: 12);
}

/* No flutter tem uma nova funcionalidade chamada NullSafety, que nos obriga 
   * a fazer uma verificação sobre um valor para evitar que ele seja nulo e 
   * cause problemas no código e no app em alguma situação.
   * 
   * Isso pode gerar a mensagem: 
   * "The parameter 'valor' can't have a value of 'null'".
   * 
   * Para resolver isso utiliza-se a ? ou required, como aparece abaixo.
   */

/* {} - Permite usar a nomeação, que deixa alterar a ordem de entrada das 
 * váriáveis que estão dentro dos {}.
 */
saudarPessoa({String? nome, required int idade}) {
  print("Olá $nome nem parece que vc tem $idade anos.");
}

/* {} - Permite usar a nomeação, que deixa alterar a ordem de entrada das 
 * váriáveis que estão dentro dos {}.
 */
imprimirData(int dia, {int ano = 1970, int mes = 1}) {
  print('$dia/$mes/$ano');
}
