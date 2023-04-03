package br.gov.cesarschool.poo.fidelidade.cartao.entidade;

import java.util.Date;

public class LancamentoExtratoPontuacao extends LancamentoExtrato{
	
	public LancamentoExtratoPontuacao(long numeroCartao, int quantidadePontos, Date dataHoraLancamento) {
		super(numeroCartao, quantidadePontos, dataHoraLancamento);
	}
}
