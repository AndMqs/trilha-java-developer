package condicionais;
public class PlanoOperadora {
    
    public static void main(String[] args) {
        String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
    }
}

/*
switch (expressão): é onde passamos a variável de teste que servirá de referência para as comparações que o programa deve fazer;
Ao usar a estrutura switch case é importante lembrar que:
    *cada switch pode conter um ou N cases;
    *os valores dos cases não podem ser repetidos, caso contrário ocorrerá um erro durante a compilação do código;
    *o valor de cada case deve ser do mesmo tipo da expressão switch;
    *os valores dos cases não podem ser variáveis;
    *a variável passada no switch deve ser de um dos tipos aceitos pela estrutura (short, byte, long, int, enum, string).


case: é onde definimos o valor que será comparado com a variável de teste e o código que será executado caso sejam compatíveis;

break: é a declaração opcional de quebra;

default: é a declaração opcional padrão, na qual definimos o código que deve ser executado, se nenhum dos valores declarados nos cases for compatível com o valor passado na variável de teste.

https://blog.betrybe.com/java/switch-case-java/
https://glysns.gitbook.io/java-basico/controle-de-fluxo/estruturas-condicionais
 
 */
