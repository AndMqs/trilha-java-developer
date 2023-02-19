package excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
 * Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. 
 * O termo técnico para isso é: Java lançará uma exceção (jogará um erro).
 * 
 * De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drásticamente. 
 * Já exceções é um fluxo inesperado da nossa aplicação
 * 
 * https://glysns.gitbook.io/java-basico/controle-de-fluxo/estruturas-excepcionais
 */


public class AboutMe{
    public static void main(String[] args) {

        try{

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();   

        } 
        catch(InputMismatchException e){
            System.err.println("Os campos 'idade' e 'altura' precisam ser numéricos.");
        }
    }
}