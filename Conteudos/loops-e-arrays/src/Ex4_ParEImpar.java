import java.util.Scanner;

public class Ex4_ParEImpar {
/*
 * Faça um programa que peça N números inteiros, calcule e mostre a quantidade
 * de números pares e a quantidade dos ímpares.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int quantNumeros, numero;
        int count = 0, quantImp = 0, quantPar = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();
        
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

            if(numero % 2 == 0)
                quantPar++;
            else
                quantImp++;

        } while(count < quantNumeros);
    
    System.out.println("Quantidade de números pares: " + quantPar);
    System.out.println("Quantidade de números ímpares: " + quantImp);
  
 }
 
}
