// ignore_for_file: prefer_const_constructors_in_immutables, use_key_in_widget_constructors

import 'package:despesas_pessoais/components/chart_bar.dart';
import 'package:despesas_pessoais/models/transacao.dart';
import 'package:flutter/material.dart';
import 'package:intl/intl.dart';

class Chart extends StatelessWidget {
  final List<Transacao> transacaoRecente;

  Chart(this.transacaoRecente);

  List<Map<String, Object>> get grupoTrasacoes {
    return List.generate(
      7,
      (index) {
        final diasSemana = DateTime.now().subtract(
          Duration(days: index),
        );
        double somaTotal = 0.0;
        for (var i = 0; i < transacaoRecente.length; i++) {
          bool mesmoDia = transacaoRecente[i].data.day == diasSemana.day;
          bool mesmoMes = transacaoRecente[i].data.month == diasSemana.month;
          bool mesmoAno = transacaoRecente[i].data.year == diasSemana.year;

          if (mesmoAno && mesmoDia && mesmoMes) {
            somaTotal += transacaoRecente[i].valor;
          }
        }

        return {
          'dia': DateFormat.E().format(diasSemana)[0],
          'valor': somaTotal,
        };
      },
    );
  }

  double get _valorTotalSemana {
    return grupoTrasacoes.fold(0.0, (soma, transacao) {
      return soma + (transacao['valor'] as double);
    });
  }

  @override
  Widget build(BuildContext context) {
    grupoTrasacoes;
    return Card(
      elevation: 6,
      margin: EdgeInsets.all(20.0),
      child: Padding(
        padding: const EdgeInsets.all(10.0),
        child: Row(
          mainAxisAlignment: MainAxisAlignment.spaceAround,
          children: grupoTrasacoes.map(
            (transacao) {
              return Flexible(
                fit: FlexFit.tight,
                child: ChartBar(
                  textoDia: transacao['dia'].toString(),
                  valor: double.parse(transacao['valor'].toString()),
                  porcentagem:
                      (transacao['valor'] as double) / _valorTotalSemana,
                ),
              );
            },
          ).toList(),
        ),
      ),
    );
  }
}
