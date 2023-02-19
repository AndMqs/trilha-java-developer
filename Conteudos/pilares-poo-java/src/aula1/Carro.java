package aula1;

public class Carro extends Veiculo{
    /*public void ligar(){
        System.out.println("O CARRO DEU PARTIDA");
    }

    public void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }

    public void confereCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }*/

    
    
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");

        //somente um método publico na operação
    }

    public void confereCombustivel(){
        System.out.println("CONFERINDO COMBUSTÍVEL");
    }

    public void confereCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }

}