// ignore_for_file: prefer_const_constructors, use_key_in_widget_constructors, sized_box_for_whitespace, unused_field, unused_element, deprecated_member_use

import 'dart:math';
import 'package:despesas_pessoais/components/chart.dart';
import 'package:flutter/material.dart';
import 'components/formulario_transacao.dart';
import 'components/lista_transacao.dart';
import 'models/transacao.dart';

main() => runApp(DespesasPessoaisApp());

class DespesasPessoaisApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final ThemeData tema = ThemeData();

    return MaterialApp(
      home: MinhaPaginaInicial(),
      theme: tema.copyWith(
        colorScheme: tema.colorScheme.copyWith(
          primary: Colors.purple,
          secondary: Colors.amber,
        ),
        textTheme: tema.textTheme.copyWith(
          headline6: TextStyle(
            fontFamily: 'OpenSans',
            fontSize: 18,
            fontWeight: FontWeight.bold,
            color: Colors.black,
          ),
        ),
        appBarTheme: AppBarTheme(
          titleTextStyle: TextStyle(
            fontFamily: 'OpenSans',
            fontSize: 20,
            fontWeight: FontWeight.bold,
          ),
        ),
      ),
      debugShowCheckedModeBanner: false,
    );
  }
}

class MinhaPaginaInicial extends StatefulWidget {
  @override
  State<MinhaPaginaInicial> createState() => _MinhaPaginaInicialEstado();
}

class _MinhaPaginaInicialEstado extends State<MinhaPaginaInicial> {
  final List<Transacao> _transacoes = [
    Transacao(
      id: '1',
      titulo: 'Novo tênis de caminhada',
      valor: 196.99,
      data: DateTime.now().subtract(Duration(days: 40)),
    ),
    Transacao(
      id: '2',
      titulo: 'Calça jeans',
      valor: 95.99,
      data: DateTime.now().subtract(Duration(days: 3)),
    ),
    Transacao(
      id: '3',
      titulo: 'Óculos',
      valor: 450.00,
      data: DateTime.now().subtract(Duration(days: 4)),
    ),
  ];

  List<Transacao> get _transacoesRecentes {
    return _transacoes.where((transacao) {
      return transacao.data.isAfter(DateTime.now().subtract(
        Duration(days: 7),
      ));
    }).toList();
  }

  _addTransacao(String titulo, double valor) {
    final novaTransacao = Transacao(
      id: Random().nextDouble().toString(),
      titulo: titulo,
      valor: valor,
      data: DateTime.now(),
    );

    setState(() {
      _transacoes.add(novaTransacao);
    });

    Navigator.of(context).pop();
  }

  _abrirFormularioTransacoesModal(BuildContext context) {
    showModalBottomSheet(
      context: context,
      builder: (_) {
        return FormularioTransacao(_addTransacao);
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Despesas pessoais'),
        actions: <Widget>[
          IconButton(
            icon: Icon(Icons.add),
            onPressed: () => _abrirFormularioTransacoesModal(context),
          )
        ],
      ),
      body: SingleChildScrollView(
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: <Widget>[
            Chart(_transacoesRecentes),
            ListaTransacao(_transacoes),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.add),
        onPressed: () => _abrirFormularioTransacoesModal(context),
      ),
      floatingActionButtonLocation: FloatingActionButtonLocation.centerFloat,
    );
  }
}
