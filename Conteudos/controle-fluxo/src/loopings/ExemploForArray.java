package loopings;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        /*for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }*/

        // Forma simplificada 
        for (String aluno : alunos) { // a cada interação da variável 'alunos', o aluno do indice atual vai atualizar - terá um novo valor
            System.out.println("Nome do aluno é: "+ aluno);
        }
        /*
         * O uso do for / each está fortemente relacionado, 
         * com um cenário onde contenha um array ou coleção, e assim , a interação é baseada nos elementos da coleção.
         */
    }
}
