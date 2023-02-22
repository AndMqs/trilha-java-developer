package device;

import programas.navegadorInternet.NavegadorInternet;
import programas.reprodutorMusical.ReprodutorMusical;
import programas.telefone.AparelhoTelefonico;

public class Smartphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
        
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
        
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
        
    }

    @Override
    public void ligar() {
        System.out.println("REALIZANDO LIGAÇÃO");
        
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA WEB");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA WEB");
        
    }
    
}
