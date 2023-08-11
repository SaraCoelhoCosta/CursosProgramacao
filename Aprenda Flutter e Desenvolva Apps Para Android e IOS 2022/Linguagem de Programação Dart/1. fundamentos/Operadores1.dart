// ignore_for_file: dead_code

main() {
  // Operadores Aritméticos (binário/infix)

  // Atribuição.
  int a = 7;
  int b = 3;
  int resultado = a + b; // Soma

  print(resultado);
  print(a - b); // Subtração.
  print(a * b); // Multiplicação.
  print(a / b); // Divisão.
  print(a % b); // Módulo (resto da divisão).
  print(33 % 2);
  print(34 % 2);
  print(a + (b * a) - (b / a));

  // Operadores Lógicos
  bool ehFragil = true;
  bool ehCaro = false;

  print(ehFragil && ehCaro); // AND -> E
  print(ehFragil || ehCaro); // OR -> OU
  print(ehFragil ^ ehCaro); // XOR -> OU Exclusivo

  print(!ehFragil); // NOT -> Unário/Prefix
  print(!!ehCaro);
}
