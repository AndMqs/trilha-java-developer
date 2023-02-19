package desafiosCodigo;

import java.util.Scanner;

public class EntradaSaida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        for(int i=0 ; i<10 ; i++){
            nomes[i] = sc.nextLine();            
        }

        System.out.println("--------------------------");
        System.out.println("Terceiro nome" + nomes[2]);
        System.out.println("Sétimo nome" +nomes[6]);
        System.out.println("Nono nome" +nomes[8]);
        
    }
}
