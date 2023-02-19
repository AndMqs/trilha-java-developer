import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.next();

        System.out.print("Por favor, digite seu nome: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        
    }

}