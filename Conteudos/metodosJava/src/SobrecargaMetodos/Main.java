package SobrecargaMetodos;
//Sobrecarga ocorre qdo mudamos a lista de parâmetros e manter o nome do método
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);
    }
    
}
