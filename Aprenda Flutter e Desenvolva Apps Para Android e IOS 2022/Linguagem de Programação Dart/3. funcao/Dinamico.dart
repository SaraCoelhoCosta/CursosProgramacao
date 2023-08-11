main() {
  juntar(1, 9);
  juntar('Bom ', 'dia!!!');
  var resultado = juntar('O valor de PI é ', 3.1415);
  print(resultado.toUpperCase());
}

/*
 * Quando o tipo é implícito ele entende como dynamic. Caso contráio ele é
 * o tipo declarado.
 */
String juntar(dynamic a, b) {
  print(a.toString() + b.toString());
  return a.toString() + b.toString();
}
