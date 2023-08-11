/*
 *  - Números (int e double)
 *  - String (String)
 *  - Booleano (bool)
 * 	- dynamic
 */

main() {
  int n1 = 3;
  double n2 = (-5.67).abs();

  // Converte string para double.
  double n3 = double.parse("12.765");

  // num - é o tipo numérico, pode alterar o tipo entre inteiro e decimal.
  num n4 = 6;

  // abs() - converte positivo em negativo.
  print(n1.abs() + n2 + n3 + n4);

  n4 = 6.7;
  print(n1.abs() + n2 + n3 + n4);

  String s1 = "Bom";
  String s2 = " dia";

  /* Concatena strings
   * toUpperCase() - Converte todas as letras da string em maiúsculo.
   */
  print(s1 + s2.toUpperCase() + "!!!");

  bool estaChovendo = true;
  bool muitoFrio = false;

  // Retorna uma booleano a partir da operação lógica E.
  print(estaChovendo && muitoFrio);

  /* dynamic - permite alterar o tipo de dado a qualquer momento, diferente do 
   * var que apenas identifica o tipo e o mantém.
   */
  dynamic x = "Um texto bem legal";
  print(x);

  x = 123;
  print(x);

  x = false;
  print(x);

  var y = "Outro texto bem legal!";
  // y = 123;
  print(y);
}
