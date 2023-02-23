package main;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dominio.Conta;
import negocio.TransacaoHelper;
import negocio.ValidacaoHelper;

public class StartBank {
    
    public static void main(String[] args) throws ParseException {
        
        TransacaoHelper transacaoHelper = new TransacaoHelper();
    
        List<Conta> contas = new ArrayList<Conta>();
            
        String opcao = "";
        
        boolean sair = false;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("*------------------------------------------------------------*");
        System.out.println("|Bem-vindo ao StartBank!                                     |");
        System.out.println("|Aqui é possível: criar conta, depositar, sacar e transferir.|");
        System.out.println("*------------------------------------------------------------*");
    
        try{
            do {

                System.out.println("*------------------------------------------------------------*");
                System.out.println("|0 - Sair                                                    |");
                System.out.println("|1 - Criar Conta                                             |");
                System.out.println("|2 - Listar Todas as Contas                                  |");
                System.out.println("|3 - Exibir Dados Bancários pelo CPF                         |");
                System.out.println("|4 - Visualizar Saldo Pelo CPF                               |");
                System.out.println("|5 - Sacar                                                   |");
                System.out.println("|6 - Depositar                                               |");
                System.out.println("|7 - Transferir                                              |");
                System.out.println("*------------------------------------------------------------*");
                
                System.out.print("Informe a opção: ");
                opcao = teclado.nextLine();
                
                switch (opcao) {
                    case "0":
                        System.out.println("*------------------------------------------------------------*");
                        System.out.println("|ENCERRADANDO APLICAÇÃO...                                   |");
                        System.out.println("|OBRIGADO!                                                   |");
                        System.out.println("*------------------------------------------------------------*");
                        sair = true;
                        
                        break;

                    case "1":
                        System.out.println("-> CRIAR CONTA");
                        
                        Conta c1 = new Conta();
                        System.out.print("Informe o nome da pessoa: ");
                        c1.getCliente().setNome(teclado.nextLine());
                        
                        System.out.print("Informe o CPF da pessoa: ");
                        c1.getCliente().setCpf(teclado.nextLine());
                        
                        
                        if(ValidacaoHelper.isPossivelCadastrarConta(c1)) {
                            contas.add(c1);
                            
                            System.out.println("Conta criada com sucesso!");
                        }
                        
                        break;

                    case "2":

                        System.out.println("-> LISTAR CONTAS");
                        
                        if(!contas.isEmpty()) {
                            for (Conta conta : contas) {
                                System.out.println("Número:" + conta.getNumero() + " \nAgência: " + conta.getCodigo());
                            }
                        }
                        
                        break;

                    case "3":

                        System.out.println("-> DADOS BANCÁRIOS");
                        
                        System.out.print("Informe o CPF da pessoa: ");
                        String cpfDados = teclado.nextLine();
                        
                        if(ValidacaoHelper.isContaExistente(contas, cpfDados)) {
                            for (Conta conta : contas) {
                                if(conta.getCliente().getCpf().equals(cpfDados)) {
                                    transacaoHelper.exibirDadosBancarios(conta);
                                }
                            }
                        }
                        
                        break;

                    case "4":

                        System.out.println("-> SALDO");
                        
                        System.out.print("Informe o CPF da pessoa: ");
                        String cpfSaldo = teclado.nextLine();
                        
                        if(ValidacaoHelper.isContaExistente(contas, cpfSaldo)) {
                            for (Conta conta : contas) {
                                if(conta.getCliente().getCpf().equals(cpfSaldo)) {
                                    System.out.println("O saldo é de: " + conta.getSaldo());
                                }
                            }	
                        }
                        
                        break;

                    case "5":

                        System.out.println("-> SAQUE");
                        
                        System.out.print("Informe o CPF da pessoa: ");
                        String cpfSacar = teclado.nextLine();
                        
                        if(ValidacaoHelper.isContaExistente(contas, cpfSacar)) {
                            String valor;
                            
                            System.out.print("Informe o valor do saque: ");
                            valor = teclado.nextLine();
                            
                            for (Conta conta : contas) {
                                if(conta.getCliente().getCpf().equals(cpfSacar)) {
                                    transacaoHelper.sacar(conta, Double.parseDouble(valor));
                                }
                            }
                        }
                        
                        break;

                    case "6":

                        System.out.println("-> DEPÓSITO");
                        
                        System.out.print("Informe o CPF da pessoa: ");
                        String cpfDeposito = teclado.nextLine();
                        
                        if(ValidacaoHelper.isContaExistente(contas, cpfDeposito)) {
                            String valor;
                            
                            System.out.print("Informe o valor do depósito: ");
                            valor = teclado.nextLine();
                            
                            for (Conta conta : contas) {
                                if(conta.getCliente().getCpf().equals(cpfDeposito)) {
                                    transacaoHelper.depositar(conta, Double.parseDouble(valor));
                                }
                            }
                        }
                        
                        break;

                    case "7":

                            System.out.println("-> TRANSFERÊNCIA");
                            
                            System.out.print("Informe o CPF do depositante: ");
                            String cpfDepositante = teclado.nextLine();
                            
                            System.out.print("Informe o CPF do recebedor: ");
                            String cpfRecebedor = teclado.nextLine();
                            
                            if(ValidacaoHelper.isContaExistente(contas, cpfDepositante) 
                                    && ValidacaoHelper.isContaExistente(contas, cpfRecebedor)) {
                                Conta contaDepositante = null, contaRecebedor = null;
                                String valor;
                                
                                System.out.print("Informe o valor do depósito: ");
                                valor = teclado.nextLine();
                                
                                for (Conta conta : contas) {
                                    if(conta.getCliente().getCpf().equals(cpfDepositante)) {
                                        contaDepositante = conta;
                                    }else if (conta.getCliente().getCpf().equals(cpfRecebedor)){
                                        contaRecebedor = conta;
                                    }
                                }
                                
                                transacaoHelper.transferir(contaDepositante, contaRecebedor, Double.parseDouble(valor));
                            }
                            
                            break;	

                        default:
                            break;   
                } 

            } while(!sair);

        } finally {
            teclado.close();
        }
    }
}
