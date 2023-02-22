import device.Smartphone;

public class IPhone {
    public static void main(String[] args) {
        
        Smartphone smartphone = new Smartphone();

        System.out.println("IMPLEMENTANDO IPHONE");
        System.out.println("***********************************************");
        System.out.printf("Aparelho Telefonico%n");
        System.out.println("***********************************************");
        smartphone.ligar();
        smartphone.atender();
        smartphone.iniciarCorreioVoz();
        System.out.println("***********************************************");
        System.out.printf("Navegador de Internet%n");
        System.out.println("***********************************************");
        smartphone.exibirPagina();
        smartphone.adicionarNovaAba();
        smartphone.atualizarPagina();
        System.out.println("***********************************************");
        System.out.printf("Reprodutor Musical%n");
        System.out.println("***********************************************");
        smartphone.selecionarMusica();
        smartphone.tocar();
        smartphone.pausar();
           
    }
}

//https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo