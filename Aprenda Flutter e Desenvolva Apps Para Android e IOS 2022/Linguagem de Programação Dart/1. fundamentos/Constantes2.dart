main() {
  final lista = ['Ana', 'Lia', 'Gui'];
  //var lista2 = const ['Banana', 'Maça'];

  /* Não é possível alterar a lista quando é constante.
   * Quando utiliza o const, mas é possível adicionar elemento, mas é possível 
   * alterar a referência. Isto é, a variável pode receber outra se o
   * const estiver no valor e não na váriavel. (?)
   * Já o final permite adicionar.
   */
  lista.add('Rebeca');
  //lista2.add('Uva')
  print(lista);
}
