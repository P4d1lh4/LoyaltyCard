package br.gov.cesarschool.poo.fidelidade.cliente.negocio;

import br.gov.cesarschool.poo.fidelidade.cartao.negocio.CartaoFidelidadeMediator;
import br.gov.cesarschool.poo.fidelidade.cliente.dao.ClienteDAO;
import br.gov.cesarschool.poo.fidelidade.cliente.entidade.Cliente;

public class ClienteMediator {
	private ClienteDAO repositorioCliente;
	private CartaoFidelidadeMediator cartaoMediator;
	private static ClienteMediator instance;
	
	private ClienteMediator() {
		repositorioCliente = new ClienteDAO();
		cartaoMediator = CartaoFidelidadeMediator.getInstance();
		}
	
	public static ClienteMediator getInstance() {
		if(instance == null) {
			instance = new ClienteMediator();
		}
		return instance;
	}
	
	public ResultadoInclusaoCliente incluir(Cliente cliente) {
		return null;
	}
	
	public String alterar(Cliente cliente) {
		return null;
	}
	
	private String validar(Cliente cliente) {
		return null;
	}
	
	
}
