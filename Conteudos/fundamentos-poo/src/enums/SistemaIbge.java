package enums;

public class SistemaIbge {
    public static void main(String[] args) {
        
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.MINAS_GERAIS;

        System.out.print("O estado selecionado foi: ");

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}

// O enum é criado para valores que não sofrem alterações com constância