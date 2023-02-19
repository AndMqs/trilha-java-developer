package excecoes;

public class FormatadorCepExemplo{

    public static void main(String[] args) {
            try {
                String cepFormatado = formatarCep("2376506");
                System.out.println(cepFormatado); 

            } catch (CepInvalidoException e) {
                System.out.println("O cep não corresponde com as regras.");
            }

        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length()!=8)
            throw new CepInvalidoException();

            return "23.765-064";
    }

}

/*
 * https://www.oracle.com/br/technical-resources/article/java/erros-java-exceptions.html
 * 
 * https://www.w3schools.com/java/java_try_catch.asp
 * 
 * https://glysns.gitbook.io/java-basico/controle-de-fluxo/estruturas-excepcionais
 * 
 */