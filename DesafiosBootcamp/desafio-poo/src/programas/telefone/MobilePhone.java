package programas.telefone;

public class MobilePhone implements AparelhoTelefonico {
    
    public void ligar(){
        System.out.println("REALIZANDO LIGAÇÃO");
    }

    public void atender(){
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
