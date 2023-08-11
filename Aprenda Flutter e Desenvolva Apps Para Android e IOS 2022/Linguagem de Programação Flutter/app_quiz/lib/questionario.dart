// ignore_for_file: use_key_in_widget_constructors, prefer_const_constructors_in_immutables, prefer_const_constructors

import 'package:flutter/material.dart';
import './questao.dart';
import './resposta.dart';

class Questionario extends StatelessWidget {
  final List<Map<String, Object>> perguntas;
  final int perguntaSelecionada;
  final void Function(int) quandoResponder;

  Questionario({
    required this.perguntas,
    required this.perguntaSelecionada,
    required this.quandoResponder,
  });

  bool get temPerguntaSelecionada {
    return perguntaSelecionada < perguntas.length;
  }

  @override
  Widget build(BuildContext context) {
    // Lista de respostas. Se tiver perguntas envia respostas, caso contrário envia lista vazia.
    List<Map<String, Object>> respostas = temPerguntaSelecionada
        ? perguntas[perguntaSelecionada].cast()['respostas']
        : [];

    return Column(children: [
      Questao(perguntas[perguntaSelecionada]['texto'].toString()),

      /* Pega as repostas e adiciona como texto dos botões, 
       * criando uma lista de botões. E adiciona os botões da lista na tela.
       */
      ...respostas
          .map((resp) => Resposta(
                resp['texto'].toString(),
                () => quandoResponder(int.parse(resp['pontuacao'].toString())),
              ))
          .toList(),
    ]);
  }
}
