import java.util.Scanner;
/*
 * Faça um programa que leia 5 números e informe
 * o maior número e a média desses números;
 */
public class Ex3_MaiorEMedia {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma += numero;
            count ++;

            if(numero > maior) 
                maior = numero;
 
        } while(count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + (soma/5));
    }
}
