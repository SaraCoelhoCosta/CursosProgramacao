// ignore_for_file: prefer_const_constructors, prefer_const_constructors_in_immutables

import 'package:flutter/material.dart';

class FormularioTransacao extends StatefulWidget {
  final void Function(String, double) submeter;

  FormularioTransacao(this.submeter, {Key? key}) : super(key: key);

  @override
  State<FormularioTransacao> createState() => _FormularioTransacaoEstado();
}

class _FormularioTransacaoEstado extends State<FormularioTransacao> {
  final tituloControle = TextEditingController();
  final valorControle = TextEditingController();

  _submeterFormulario() {
    final titulo = tituloControle.text;
    final valor = double.tryParse(valorControle.text) ?? 0.0;
    if (titulo.isEmpty || valor <= 0) {
      return;
    }
    widget.submeter(titulo, valor);
  }

  @override
  Widget build(BuildContext context) {
    return Card(
      elevation: 5,
      child: Padding(
        padding: const EdgeInsets.all(10.0),
        child: Column(
          children: <Widget>[
            TextField(
              controller: tituloControle,
              decoration: InputDecoration(
                labelText: 'Titulo',
              ),
            ),
            TextField(
              controller: valorControle,
              keyboardType: TextInputType.numberWithOptions(
                decimal: true,
              ),

              // _ ignora o valor que foi passado.
              onSubmitted: (_) => _submeterFormulario(),

              decoration: InputDecoration(
                labelText: 'Valor (R\$)',
              ),
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.end,
              children: <Widget>[
                TextButton(
                  style: ButtonStyle(
                    foregroundColor:
                        MaterialStateProperty.all<Color>(Colors.purple),
                  ),
                  onPressed: () => _submeterFormulario,
                  child: Text(
                    'Nova transacao',
                  ),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
