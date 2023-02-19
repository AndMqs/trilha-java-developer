package condicionais;
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7){ // Com 'else' e o 'if' = condicional composto
            System.out.println("Aprovado");
        }
        
        else if(nota >= 5 && nota <7){ //Condicional encadeado
            System.out.println("Prova Recuperação");
        }

        else{
            System.out.println("Reprovado");
        }

        /*Condição Ternária
         * String resultado = nota >=7 ? "Aprovado" : "Reprovado";
         * 
         * Ou seja, se a nota for mair ou igual a 7 ele está aprovado(?). Se não (:), reprovado.
         * 
         */
    }
}
