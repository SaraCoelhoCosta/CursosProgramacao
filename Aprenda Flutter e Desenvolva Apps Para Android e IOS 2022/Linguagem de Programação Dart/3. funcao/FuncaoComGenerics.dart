main() {
  var lista = [3, 6, 7, 12, 45, 78, 1];

  print(segundoElementoVersao1(lista));

  int segundoElemento = segundoElementoVersao2<int>(lista)!;
  print(segundoElemento);

  segundoElemento = segundoElementoVersao2(lista)!;
  print(segundoElemento);
}

// Sem generics. Tipo de dado que engloba todos os tipos de dados.
Object segundoElementoVersao1(List lista) {
  return lista.length >= 2 ? lista[1] : null;
}

// Com generics, pois não se sabe o tipo de dado.
E? segundoElementoVersao2<E>(List<E> lista) {
  return lista.length >= 2 ? lista[1] : null;
}
