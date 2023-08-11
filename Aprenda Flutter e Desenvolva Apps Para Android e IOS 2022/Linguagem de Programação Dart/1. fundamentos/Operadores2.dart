main() {
  // Operadores Atribuição (binário/infix)
  double a = 2;
  a = a + 3;
  a += 3;
  a -= 3;
  a *= 3;
  a /= 5;
  a %= 2;

  print(a);

  // Operadores Relacionais (binário/infix) -> O resultado sempre é BOOL
  print(3 > 2);
  print(3 >= 3);
  print(3 < 4);
  print(3 <= 3);
  print(3 != 3);
  print(3 == 3);
  print(3 == '3');

  print(2 + 5 > 3 - 1 && 4 + 7 != 7 - 4);

  /* 
   * 101 = 5 e 100 = 4 em binário.
   * (1 && 1) (0 && 0) (1 && 0) = (1)(0)(0) = 100 = 4.
   * Faz operação bit a bit usando operador lógico E.
   */
  print(5 & 4);
}
