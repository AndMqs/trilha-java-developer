package programas.reprodutorMusical;

public class IPod implements ReprodutorMusical {
    
    public void tocar(){
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar(){
        System.out.println("PAUSANDO MUSICA");
    }

    public void selecionarMusica(){
        System.out.println("SELECIONANDO MUSICA");
    }

}
