import java.util.Random;

/* Gere  e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. */

public class Array4_Multidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int[4][4]; //determinando quantas linhas e colinas a matriz terá
        
        for(int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){ //"j" representa cada coluna dentro da linha "i"
                M[i][j] = random.nextInt(9);
            }
        
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            
            System.out.println();
        }
    }
    
}
