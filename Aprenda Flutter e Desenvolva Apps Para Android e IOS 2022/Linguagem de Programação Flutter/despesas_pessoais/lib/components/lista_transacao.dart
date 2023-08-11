// ignore_for_file: prefer_const_constructors_in_immutables, sized_box_for_whitespace, prefer_const_constructors, avoid_unnecessary_containers

import 'package:despesas_pessoais/models/transacao.dart';
import 'package:flutter/material.dart';
import 'package:intl/intl.dart';

class ListaTransacao extends StatelessWidget {
  final List<Transacao> transacoes;

  // ignore: use_key_in_widget_constructors
  ListaTransacao(this.transacoes);

  @override
  Widget build(BuildContext context) {
    return Container(
      height: 700,
      child: transacoes.isEmpty
          ? Column(
              children: <Widget>[
                SizedBox(
                  height: 20,
                ),
                Container(
                  height: 300,
                  child: Image.asset(
                    'assets/images/waiting.png',
                    fit: BoxFit.cover,
                  ),
                ),
                SizedBox(
                  height: 20,
                ),
                Text(
                  'Nenhuma transação cadastrada!',
                  style: Theme.of(context).textTheme.headline6,
                ),
              ],
            )
          : ListView.builder(
              itemBuilder: (ctxt, index) {
                final transacao = transacoes[index];

                return Card(
                  child: Row(
                    children: <Widget>[
                      /* Container:
                     * Aceita um unico elemento;
                     * Alinhamento flexivel e opcao de estilo;
                     * Largura flexivel;
                     * 
                     * Row/Column:
                     * Aceita varios elementos;
                     * Alinhamento, mas sem opcao de estilo;
                     * Sempre ocupa toda altura (coluna);
                     * Sempre ocupa toda a largura (linha);
                     */
                      Container(
                        // Margem (distancia do elemento).
                        margin: EdgeInsets.symmetric(
                          horizontal: 15,
                          vertical: 10,
                        ),
                        decoration: BoxDecoration(
                          border: Border.all(
                            color: Colors.purple,
                            width: 2.0,
                          ),
                        ),

                        // Espacamento interno.
                        padding: EdgeInsets.all(10),
                        child: Text(
                          'R\$' +
                              transacao.valor
                                  .toStringAsFixed(2) // Casas decimais.
                                  .replaceAll(".", ","),
                          // Interpolacao: 'R\$ ${transacao.valor.toStringAsFixed(2)}',
                          style: TextStyle(
                            fontWeight: FontWeight.bold,
                            fontSize: 20,
                            color: Colors.purple,
                          ),
                        ),
                      ),
                      Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: <Widget>[
                          Text(
                            transacao.titulo,
                            style: Theme.of(context).textTheme.headline6,
                          ),
                          Text(
                            DateFormat(
                              'd MMM y',
                            ).format(
                              transacao.data,
                            ),
                            style: TextStyle(
                              color: Colors.grey,
                            ),
                          ),
                        ],
                      ),
                    ],
                  ),
                );
              },
              itemCount: transacoes.length,
            ),
    );
  }
}
