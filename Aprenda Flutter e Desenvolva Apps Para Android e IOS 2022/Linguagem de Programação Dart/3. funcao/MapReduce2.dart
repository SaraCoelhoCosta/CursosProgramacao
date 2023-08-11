main() {
  var notas = [7.3, 5.4, 7.7, 8.1, 5.5, 4.9, 9.1, 10.0];

  /* Na primeira chamada a nota 1 e 2 são passadas como parâmetro, na segunda 
   * iteração é passado como parêmetro o  retorno e a posição seguinte, isto é,
   * 3.
   */
  // reduce() - Transforma uma lista em qualquer coisa.
  var total = notas.reduce(somar);
  print(total);

  var nomes = ['Ana', 'Bia', 'Carlos', 'Daniel', 'Maria', 'Pedro'];
  print(nomes.reduce(juntar));
}

double somar(double acumulador, double elemento) {
  print("$acumulador + $elemento = ${acumulador + elemento}");
  return acumulador + elemento;
}

String juntar(String acumulador, String elemento) {
  print("$acumulador => $elemento");
  return "$acumulador, $elemento";
}
