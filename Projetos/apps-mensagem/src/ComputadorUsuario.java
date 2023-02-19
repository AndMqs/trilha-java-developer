import java.util.Scanner;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoDeMensagemInstantanea;
import apps.Telegram;

public class ComputadorUsuario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ServicoDeMensagemInstantanea smi = null;
        System.out.println("Qual app de mensagem quer utilizar? Digite 'msn' para Messenger, 'fcb' para Facebook, e 'tlg' para Telegram: ");
        String appEscolhido = entrada.next();

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();

        }else{
            if(appEscolhido.equals("fcb")){
                smi = new FacebookMessenger();

            }else if(appEscolhido.equals("tlg")){
                smi = new Telegram();
            }
        }
        smi.enviarMensagem();
        smi.receberMensagem();
    }
  
}