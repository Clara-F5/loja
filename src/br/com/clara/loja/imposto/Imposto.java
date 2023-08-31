package br.com.clara.loja.imposto;

import br.com.clara.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcular(Orcamento orcamento);

    }
