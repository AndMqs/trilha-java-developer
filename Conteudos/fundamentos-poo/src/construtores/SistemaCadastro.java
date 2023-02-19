package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa paula = new Pessoa("456", "Paula");

        paula.setEndereco("Rua das Marias");

        System.out.println(paula.getNome() + " - " + paula.getCpf());

    }
}

// https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/construtores