public class Array1_OrdemInversa {
/* Crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa */
    public static void main(String[] args) {
        int [] vetor = {-6, 25, 10, -3, 36, 5};
        int count = 0;

        System.out.print("\nVetor: ");

        while(count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }
        
        System.out.print("\nVetor inverso: ");
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }

    
}
