package br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import java.util.Date;

public class LancamentoTipoResgate extends LancamentoExtrato {
	TipoResgate tipoResgate;
	
	public LancamentoTipoResgate(long numeroCartao, int quantidadePontos, Date dataHoraLancamento, TipoResgate tipoResgate) {
		super(numeroCartao, quantidadePontos, dataHoraLancamento);
		this.tipoResgate = tipoResgate;
	}
	
	public TipoResgate getTipoResgate() {
		return tipoResgate;
	}
}
