import java.util.Scanner;

public class Ex5_Tabuada {
 /*
 * Desenvolva um gerador de tabuada a partir de qualquer número inteiro até 10.
 * O usuario deve informar qual será o número da tabuada.
 * A saída deve ser conforme o exemplo abaixo: 
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10 
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Número da tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10 ; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
 }
}
