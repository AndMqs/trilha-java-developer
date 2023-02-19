package aula1;

public class Autodromo {
    //classe que vai usar o carro

    public static void main(String[] args) {

        Carro jeep = new Carro();
      /*jeep.confereCambio();
        jeep.confereCombustivel();
        jeep.ligar();

        //não pe uma boa prática que  o usuário tenha contato com todas essas etapas. E pra isso a gente faz o encapsulamento
        //escondendo ações que serão executadas somente dentro da propria classe.
        */
        
        jeep.setChassi("445321651");
        jeep.ligar(); //somente um método publico na operação

        Moto z400 = new Moto();
        z400.setChassi("3156546");
        z400.ligar();

    }
}
