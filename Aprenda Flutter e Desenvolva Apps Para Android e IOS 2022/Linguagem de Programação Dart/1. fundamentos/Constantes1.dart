import 'dart:io'; // import para entrada e saída.

main() {
  // Calcula a área da circunferência = PI * raio * raio.

  /* const/final - são constantes.
   * const - não pode receber o valor em tempo de execução.
   * final - recebe valor em tempo de execução e não alterados depois que recebe 
   * um valor.
   */
  const PI = 3.1415;

  // Impressão sem pular linha.
  stdout.write("Informe o raio: ");

  // Leitura dos dados passados pelo usuário.
  final entradaDoUsuario = stdin.readLineSync();

  /* No flutter tem uma nova funcionalidade chamada NullSafety, que nos obriga 
   * a fazer uma verificação sobre um valor para evitar que ele seja nulo e 
   * cause problemas no código e no app em alguma situação.
   * 
   * Isso pode gerar a mensagem: 
   * "The parameter 'valor' can't have a value of 'null'".
   * 
   * Para resolver isso utiliza-se a ! (que aparece no fim da variável abaixo).
   */
  final double raio = double.parse(entradaDoUsuario!);

  final area = PI * raio * raio;
  print("O valor da área é: " + area.toString());
}
