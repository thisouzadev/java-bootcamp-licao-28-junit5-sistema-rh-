package com.trybe.acc.java.sistemarh;

public class PessoaColaboradora {
  double salarioBruto = 2200;

  /**
   * Método que cálcula salário líquido.
   * 
   */
  public double calcularSalarioLiquido() {
    return this.salarioBruto * 0.8;
  }

  /**
   * Método que cálcula salário bruto anual.
   */
  public double calcularValorBrutoRecebidoAnual(int ano) {
    int totalDeMeses = 12 * ano;
    double salarioBrutoRecebidoAnos = totalDeMeses * this.salarioBruto;
    return salarioBrutoRecebidoAnos;
  }

  /**
   * Método que cálcula valor líquido recebido anual.
   */
  public double calcularValorLiquidoRecebidoAnual(int ano) {
    int totalDeMeses = 12 * ano;
    double salarioLiquidoRecebidoAnos = totalDeMeses * this.calcularSalarioLiquido();
    return salarioLiquidoRecebidoAnos;
  }

  /**
   * Método que cálcula valor imposto anual.
   */
  public double calcularValorImpostoAnual(int ano) {
    double salarioBruto = this.calcularValorBrutoRecebidoAnual(ano);
    double salarioLiquido = this.calcularValorLiquidoRecebidoAnual(ano);
    return salarioBruto - salarioLiquido;
  }

  public double getSalarioBruto() {
    return salarioBruto;
  }

  public void setSalarioBruto(double salarioBruto) {
    this.salarioBruto = salarioBruto;
  }

}
