import 'dart:math';

main() {
  // Cria função anônima.
  var minhaFuncaoPar = () => print('Eita! O valor é par!');
  var minhaFuncaoImpar = () => print('Legal! O valor é ímpar!');

  // Passa função como parâmetro.
  executar(funcaoImpar: minhaFuncaoImpar, funcaoPar: minhaFuncaoPar);
}

// Recebe a função como parâmetro.
void executar({Function? funcaoPar, Function? funcaoImpar}) {
  var sorteado = Random().nextInt(10);
  print('O valor sorteado foi $sorteado');

  // Executa a função recebida, de acordo com a resposta da condição.
  sorteado % 2 == 0 ? funcaoPar!() : funcaoImpar!();
}
