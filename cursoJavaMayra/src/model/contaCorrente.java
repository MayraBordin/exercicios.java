package model;
// A palavra reservada "EXTENDS" é utilizada para criarmos uma herança
// nesse caso, contaCorrente esta herdando tudo de contaBancaria;
public class contaCorrente extends contaBancaria {

    public contaCorrente(String conta, int digito, String agencia, Double saldoInicial) {
       //A palavra "SUPER" é um metodo quepassa seus valores para o pai dele que é a contaBancaria;
       // entao quando a gente cria  uma contaCorrente a gente acaba criando uma contaBancaria, por que contaCorrente é uma extensao de contaBancaria;
        super(conta, digito, agencia, saldoInicial);
    }
    
}
