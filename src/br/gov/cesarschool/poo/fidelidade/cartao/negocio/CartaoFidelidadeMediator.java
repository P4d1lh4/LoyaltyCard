package br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import br.gov.cesarschool.poo.fidelidade.cartao.dao.CartaoFidelidadeDAO;
import br.gov.cesarschool.poo.fidelidade.cartao.dao.LancamentoExtratoDAO;
import br.gov.cesarschool.poo.fidelidade.cartao.entidade.TipoResgate;
import br.gov.cesarschool.poo.fidelidade.cliente.entidade.Cliente;
import java.time.LocalDateTime;

public class CartaoFidelidadeMediator {
	private CartaoFidelidadeDAO repositorioCartao;
	private LancamentoExtratoDAO repositorioLancamento;
	private static CartaoFidelidadeMediator instance;
	
	private CartaoFidelidadeMediator() {
		repositorioCartao = new CartaoFidelidadeDAO();
		repositorioLancamento = new LancamentoExtratoDAO();
		}
	
	public static CartaoFidelidadeMediator getInstance() {
		if(instance == null) {
			instance = new CartaoFidelidadeMediator();
		}
		return instance;
	}
	
	public long gerarCartao(Cliente cliente) {
		String cpf = cliente.getCpf();
		return 0;
	}
	
	public String pontuar(long numeroCartao, double quantidadePontos) {
		 return null;
	}
	
	public String resgatar(long numeroCartao, double quantidadePontos, TipoResgate tipo) {
		return null;
	}
	
	
}
