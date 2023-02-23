package dominio;

// Representando uma instituição bancária.
 

public class Instituicao {
    
    private String nome;

    private String cnpj;

    private String codigo;

    public Instituicao(){
        this.nome = "Start Bank";
        this.cnpj = "524198/0001";
        this.codigo = "0001";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

}
