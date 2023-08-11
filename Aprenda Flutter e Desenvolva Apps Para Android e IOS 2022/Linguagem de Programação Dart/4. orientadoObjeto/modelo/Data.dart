class Data {
  int? dia;
  int? mes;
  int? ano;

  /* 
   * Construtor com valores obrigatórios.
   * Data(int dia, int mes, int ano) {
   *  this.dia = dia;
   *  this.mes = mes;
   *  this.ano = ano;
   * }
   */

  // Construtor com valores opcionais.
  Data([this.dia = 1, this.mes = 1, this.ano = 1970]);

  // Named Constructors - Construtor nomeado.
  Data.com({this.dia = 1, this.mes = 1, this.ano = 1970});
  Data.ultimoDiaDoAno(this.ano) {
    dia = 31;
    mes = 12;
  }

  String obterFormatada() {
    return "$dia/$mes/$ano";
  }

  String toString() {
    return obterFormatada();
  }
}
