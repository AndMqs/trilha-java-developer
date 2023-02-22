package dominio;

import java.util.Random;

public class Conta extends Instituicao{
    
    private String numero;
	
	private boolean ativa;
	
	private Double saldo;
	
	private Cliente cliente;

    public Conta() {
		Random random = new Random();
		this.numero = "" + random.nextInt(4) + "-" + random.nextInt(1);
		this.cliente = new Cliente();
		this.saldo = 0.0;
		this.ativa = Boolean.TRUE;
	}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

	
	

}
