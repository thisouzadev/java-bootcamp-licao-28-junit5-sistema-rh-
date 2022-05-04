package com.trybe.acc.java.sistemarh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaColaboradoraTest {


  @Test
  @DisplayName("10. Descrição do teste 1 aqui")
  public void testeCalcularSalarioLiquido() {
    PessoaColaboradora pessoaColaboradora = new PessoaColaboradora();
    pessoaColaboradora.setSalarioBruto(3000);
    assertEquals(2400, pessoaColaboradora.calcularSalarioLiquido());
  }


  @Test
  @DisplayName("11. Descrição do teste 2 aqui")
  public void testeCalcularValorBrutoRecebidoAnual() {
    PessoaColaboradora pessoaColaboradora = new PessoaColaboradora();
    pessoaColaboradora.setSalarioBruto(7430.00);
    assertEquals(24000.00, pessoaColaboradora.calcularValorBrutoRecebidoAnual(2));
  }


  @Test
  @DisplayName("12. Descrição do teste 3 aqui")
  public void testeCalcularValorLiquidoRecebidoAnual() {
    PessoaColaboradora pessoaColaboradora = new PessoaColaboradora();
    pessoaColaboradora.setSalarioBruto(3000);
    assertEquals(180000, pessoaColaboradora.calcularValorBrutoRecebidoAnual(5));
  }


  @Test
  @DisplayName("13. Descrição do teste 4 aqui")
  public void testeCalcularValorImpostoAnual() {
    PessoaColaboradora pessoaColaboradora = new PessoaColaboradora();
    pessoaColaboradora.setSalarioBruto(7430);
    assertEquals(445800, pessoaColaboradora.calcularValorBrutoRecebidoAnual(5));
  }

}
