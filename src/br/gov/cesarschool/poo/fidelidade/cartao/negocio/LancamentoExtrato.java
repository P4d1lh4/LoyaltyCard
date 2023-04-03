package br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import java.util.Date;

public class LancamentoExtrato {
	private long numeroCartao;
	private int quantidadePontos;
	private Date dataHoraLancamento;
	
	public LancamentoExtrato(long numeroCartao, int quantidadePontos, Date dataHoraLancamento) {
		this.numeroCartao = numeroCartao;
		this.quantidadePontos = quantidadePontos;
		this.dataHoraLancamento = dataHoraLancamento;
	}

	public long getNumeroCartao() {
		return numeroCartao;
	}

	public int getQuantidadePontos() {
		return quantidadePontos;
	}

	public Date getDataHoraLancamento() {
		return dataHoraLancamento;
	}
	
	
	
}
