package construtores;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String endereco;

    //Método construtor: não tme retorno, tem queter o mesmo nome da classe e recebe parâmetros
    //Quando quiser cadastrar os dados de uma nova pessoa, automaticamente preciso registrar o cpf e o nome dela
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome; 
    }
    

    public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

    
}
