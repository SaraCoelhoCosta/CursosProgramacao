import 'dart:math'; // import da biblioteca matemática.

main() {
  // Random().nextInt(11) - gera número inteiro entre 0 e x.
  var nota = Random().nextInt(11);

  print("Nota selecionada foi $nota.");

  // Estrutura condicional.
  if (nota >= 9) {
    print('Quadro de Honra!');
  } else if (nota >= 7) {
    print('Aprovado!');
  } else if (nota >= 5) {
    print('Recuperação!');
  } else if (nota >= 4) {
    print('Recuperação + Trabalho!');
  } else {
    print('Reprovado!');
  }
}
