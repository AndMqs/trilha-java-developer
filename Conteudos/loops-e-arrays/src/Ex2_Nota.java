import java.util.Scanner;
    
/*
 * Faça um programa que peça uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo um valor
 * até que o usuário informe um valor válido.
 */

public class Ex2_Nota {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

        if(nota<=5){
            System.out.println("Você foi reprovado.");
        }else
            System.out.println("Você foi aprovado!4");
 }
/*
 * Acrescentei uma condição ao exercício referente a nota inserida, 
 * considerando que com 6 ou mais a pessoa estaria aprovada.
 */
}
