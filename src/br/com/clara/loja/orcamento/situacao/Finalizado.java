package br.com.clara.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.clara.loja.DomainException;
import br.com.clara.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
