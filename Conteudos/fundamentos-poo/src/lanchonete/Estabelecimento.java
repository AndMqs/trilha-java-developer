package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		Atendente atendente = new Atendente();
		Cliente cliente = new Cliente();

		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		atendente.receberPagamento();                
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		atendente.servindoMesa();


		



		
		
		
	}
}