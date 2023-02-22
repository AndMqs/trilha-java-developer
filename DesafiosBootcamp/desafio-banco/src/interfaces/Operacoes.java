package interfaces;

import dominio.Conta;

//Representando um contrato com operações bancárias, como saque, depósito e tranferência.

public interface Operacoes {
    
    //Função responsável por realizar saque de valores de uma conta
    void sacar (Conta conta, double valor);

    //Função responsável por depositar valor em uma conta
    void depositar (Conta conta, double valor);

    //Função responsável por transferir valores entre contas
    void transferir(Conta suaConta, Conta contaDestino, double valor);

    //Função responsável por exibir os dados bancários de uma conta
    void exibirDadosBancarios(Conta conta);


}
