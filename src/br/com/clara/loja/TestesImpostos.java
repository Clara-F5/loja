package br.com.clara.loja;

import br.com.clara.loja.imposto.CalculadoraDeImpostos;
import br.com.clara.loja.imposto.ICMS;
import br.com.clara.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args){

        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        BigDecimal impostoCalculado = calculadora.calcular(orcamento, new ICMS());

        System.out.println("Resultado calculo de imposto: "+impostoCalculado);
    }
}
