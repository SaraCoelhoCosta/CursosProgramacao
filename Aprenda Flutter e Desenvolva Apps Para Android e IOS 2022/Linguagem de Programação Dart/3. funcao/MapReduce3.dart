main() {
  var alunos = [
    {'nome': 'Alfredo', 'nota': 9.9},
    {'nome': 'Wilson', 'nota': 9.3},
    {'nome': 'Mariana', 'nota': 8.7},
    {'nome': 'Guilherme', 'nota': 8.1},
    {'nome': 'Ana', 'nota': 7.6},
    {'nome': 'Ricardo', 'nota': 6.8},
  ];

  /* 1. Pega os alunos e retorna as notas;
   * 2. Diz que valor é double (porque ele está entendendo que valor é Object) e 
   * arredonda o valor;
   * 3. Filtra as notas maiores ou iguai a 8.5.
   */
  var notasFinais = alunos
      .map((aluno) => aluno['nota'])
      .map((nota) => (nota as double).roundToDouble())
      .where((nota) => nota >= 8.5);

  /* 1. Pega as notas finais e soma tudo.
   */
  var total = notasFinais.reduce((acumulador, nota) => acumulador + nota);

  print("O valor da média é: ${total / notasFinais.length}.");
}
