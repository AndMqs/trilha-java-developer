import java.util.Random;

/* Faça um programa que leia 20 números inteiros aleatórios entre 0 e 100 e
  armazene-os em um vetor. Ao final mostre os numeros e seus sucessores. */

public class Array3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
            
        }

        System.out.print("Numeros aleatórios: "); //se quiser uma posição específica não podemos usar o foreach
        for (int numero : numerosAleatorios) {
            System.out.print(numero);
        }

        System.out.print("\nSucessores dos numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }

}