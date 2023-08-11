/*
 * São heterogêneas, pois aceitam diferentes tipos de dados.
 *  - List
 *  - Set
 *  - Map
 */
main() {
  // Cria uma lista (List).
  var aprovados = ['Ana', 'Carlos', 'Daniel', 'Rafael'];

  // Adiciona elemento na lista.
  aprovados.add('Daniel');

  // Verifica se é uma lista.
  print(aprovados is List);

  // Imprime a lista.
  print(aprovados);

  /* Retorna o elemento da posição 2 da lista 
   * (funciona porque a lista é indexada).
   */
  print(aprovados.elementAt(2));

  // Retorna o elemento da posição 0 da lista.
  print(aprovados[0]);

  // Retorna o tamanho da lista.
  print(aprovados.length);

  // Cria um mapa (Map - Estrutura de chave: valor).
  var telefones = {
    'João': '+55 (11) 98765-4321',
    'Maria': '+55 (21) 12345-6789',
    'Pedro': '+55 (85) 45455-8989',
    'Lara': '+55 (11) 77777-7777',
  };

  // Verifica se é map.
  print(telefones is Map);

  // Imprime map.
  print(telefones);

  // Retorna valor da chave 'João'.
  print(telefones['João']);

  // Retorna tamanho do map.
  print(telefones.length);

  // Retorna chaves do map.
  print(telefones.keys);

  // Retorna valores do map.
  print(telefones.values);

  // Retorna chave e valor do map separadamente.
  print(telefones.entries);

  // Cria um Set.
  var times = {'Vasco', 'Flamengo', 'Fortaleza', 'São Paulo'};

  // Verica se é um set.
  print(times is Set);

  /* Adiciona elementos no set (funciona como conjunto, isto é,
   * os valores não se repetem).
   */
  times.add('Palmeiras');
  times.add('Palmeiras');
  times.add('Palmeiras');

  // Retorna o tamanho do set.
  print(times.length);

  // Verifica se 'Vasco' está no set e retorna booleano.
  print(times.contains('Vasco'));

  // Retorna o primeiro elemento.
  print(times.first);

  // Retotrna o último elemento.
  print(times.last);

  // Imprime o set.
  print(times);
}
