package br.com.clara.loja.imposto;

import br.com.clara.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
      return imposto.calcular(orcamento);

    }
}
