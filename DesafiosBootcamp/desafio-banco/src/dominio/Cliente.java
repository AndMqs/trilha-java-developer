package dominio;


public class Cliente {

    private String cliente;
	
	private String cpf;

    public String getNome() {
        return cliente;
    }

    public void setNome(String cliente) {
        this.cliente = cliente;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
