// ignore_for_file: prefer_const_constructors, unnecessary_new, prefer_const_literals_to_create_immutables, use_key_in_widget_constructors

import 'package:flutter/material.dart';
import './questionario.dart';
import './resultado.dart';

main() {
  runApp(PerguntaApp());
}

// main() => runApp(PerguntaApp()); ou main() => runApp(new PerguntaApp());

/* Para criar uma função fora da classe precisaria estar da seguinte forma:
 * void Function() funcaoQueRetornaUmaFuncaoVoid(){
 *   return (){
 *    print('Pergunta respondida #04');
 *  }
 * }
*/

// Recebe o StatefulWidget que será mexido.
class _PerguntaAppState extends State<PerguntaApp> {
  // Variável que vai ser alterada (Mudar estado).
  var _perguntaSelecionada = 0;

  var _pontuacaoTotal = 0;

  // Lista de perguntas e respostas.
  final List<Map<String, Object>> _perguntas = const [
    {
      'texto': 'Qual sua cor favorita?',
      'respostas': [
        {'texto': 'Azul', 'pontuacao': 5},
        {'texto': 'Vermelho', 'pontuacao': 5},
        {'texto': 'Verde', 'pontuacao': 3},
        {'texto': 'Amarelo', 'pontuacao': 2},
      ],
    },
    {
      'texto': 'Qual seu animal favorito?',
      'respostas': [
        {'texto': 'Gato', 'pontuacao': 2},
        {'texto': 'Coelho', 'pontuacao': 5},
        {'texto': 'Cachorro', 'pontuacao': 5},
        {'texto': 'Baleia', 'pontuacao': 0},
      ],
    },
    {
      'texto': 'Qual sua linguagem favorita?',
      'respostas': [
        {'texto': 'Java', 'pontuacao': 1},
        {'texto': 'Dart', 'pontuacao': 3},
        {'texto': 'C', 'pontuacao': 2},
        {'texto': 'Python', 'pontuacao': 3},
      ],
    },
  ];

  // Função que vai alterar o estado da variável.
  void _responder(int pontuacao) {
    if (temPerguntaSelecionada) {
      // Controla as alterações (estados) e as notifica.
      setState(() {
        _perguntaSelecionada++;
        _pontuacaoTotal += pontuacao;
      });
    }
    //print('$_pontuacaoTotal');
  }

  void _reiniciarQuestionario() {
    setState(() {
      _perguntaSelecionada = 0;
      _pontuacaoTotal = 0;
    });
  }

  bool get temPerguntaSelecionada {
    return _perguntaSelecionada < _perguntas.length;
  }

  @override
  /* Realiza a construção da aplicação. Quando há mudança de estado, ele precisa 
   * ser retirado da classe StatelessWidget (padrão) e passa para a classe State.
   * Já a classe que antes era StatelessWidget, passa a ser StatefulWidget.
   */
  Widget build(BuildContext context) {
    /*List<String> respostas = temPerguntaSelecionada
     *   ? _perguntas[_perguntaSelecionada].cast()['respostas']
     *   : [];
     */
    /* List<Widget> respostas = [];
    for (String textoResp
        in perguntas[_perguntaSelecionada].cast()['respostas']) {
      respostas.add(Resposta(textoResp, _responder));
    }
    */

    return MaterialApp(
      home: Scaffold(
        // Barra
        appBar: AppBar(title: Text('Quiz')),
        // Corpo
        body: temPerguntaSelecionada
            ? Questionario(
                perguntas: _perguntas,
                perguntaSelecionada: _perguntaSelecionada,
                quandoResponder: _responder,
              )

            /*Resposta('Resposta 1', _responder),
            Resposta('Resposta 2', _responder),
            Resposta('Resposta 3', _responder),
            Resposta('Resposta 4', _responder),
            ElevatedButton(
              child: Column(
                children: [
                  Text('Resposta 1'),
                ],
              ),
              onPressed: _responder, // () { print('Resposta #01');},
            ),
            ElevatedButton(
                child: Column(
                  children: [
                    Text('Resposta 2'),
                  ],
                ),
                onPressed: _responder // () => print('Resposta #02'),
                ),
            ElevatedButton(
              child: Column(
                children: [
                  Text('Resposta 3'),
                ],
              ),
              onPressed:
                  // Chamada da função fora da classe: funcaoQueRetornaUmaFuncaoVoid(),
                  _responder,
            )*/

            : Resultado(_pontuacaoTotal, _reiniciarQuestionario),
      ),
    );
  }
}

class PerguntaApp extends StatefulWidget {
  // Sem estado (não faz alterações): StatelessWidget.
  // "Com estado" (peeermite fazer alterações): StatefulWidget.

  // Retorna o estado da aplicação.
  @override
  _PerguntaAppState createState() {
    return _PerguntaAppState();
  }
}
