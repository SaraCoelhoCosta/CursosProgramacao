// ignore_for_file: use_key_in_widget_constructors, prefer_const_constructors_in_immutables, prefer_const_constructors

import 'package:flutter/material.dart';

class Questao extends StatelessWidget {
  final String pergunta;

  // Entende que o primeiro parâmetro recebido é 'pergunta'.
  Questao(this.pergunta);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: double.infinity,
      margin: EdgeInsets.all(10),
      child: Text(
        pergunta, // Exibe o texto (que é uma pergunta da lista).
        style: TextStyle(
          fontSize: 28,
        ),
        textAlign: TextAlign.center,
      ),
    );
  }
}
