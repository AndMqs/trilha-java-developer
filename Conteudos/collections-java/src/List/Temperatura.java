package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        List<Double> temperaturas = new ArrayList<Double>();
        
        int count = 0;
        while (true){
            if(count == 6) break;

            System.out.println("Digite a temperatura: ");
            double temp = input.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("Totas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));
    
    } 
    
}
