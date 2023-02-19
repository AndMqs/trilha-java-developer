public class Operadores {

    public static void main( String[] args){
        /*int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);
   
        //repetição
        System.out.println(++numero); //o programa lê na ordem que está digitado
                                      // se o numero vem primeiro depois o sinal, o numero não vai aparecer com os incrementos
    
        //operadores lógicos
        boolean variavel = true;
        System.out.println(!variavel); // neguei a variável e ela apareceu como false
        */
        
        //operadores ternários: if e else 
        /*int a, b;
        a = 6;
        b = 6;*/
        /*String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

           // outra forma de dizer a mesma coisa

        String resultado = a==b?"verdadeiro":"falso";
        //sempre verificar se a expressão vai retornar true ou false (booleana)
        //Pode usar número ao invés de palavras para resultados
        System.out.println(resultado);*/

        //operadores de comparação

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){ 
            System.out.println("A nossa condição é verdadeira");
        }

        // para objetos é interessanto utilizar o "equals" : System.out.println(nome1.equals(nome2));

        System.out.println("numeroUm é igual a numeroDois? " + simNao);  
        
        simNao = numero1 != numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao); 
        
        simNao = numero1 > numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);   

        }
    
}
