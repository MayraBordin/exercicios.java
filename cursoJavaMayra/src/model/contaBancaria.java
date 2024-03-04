 package model;

import java.util.Date;
import java.util.InputMismatchException;

public  abstract class contaBancaria {
    // classe abstract não pode ser instanciada, serve apenas como um modelo para outras classes que vão herdar informaçoes dela.
//#region Atributos
    private String conta;

    private int digito;

    private String agencia;

    private Double saldo;

    private Date dataAbertura;

    private Double VALOR_MINIMO_DEPOSITO = 10.0;
//#endregion
//#region Construtor
    public contaBancaria(String conta, int digito, String agencia, Double saldoInicial) {
        this.conta = conta;
        this.digito = digito;
        this.agencia = agencia;
        this.saldo = saldoInicial;
        this.dataAbertura= new Date();
    }
//#endregion
//#region Getters and Setters
public String getConta() {  
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public Date getDataAbertura() {
        return dataAbertura;
    }
    
//#endregion
 
//#region Metodos
public void Depositar( Double valor ){
    // verifica se o valor de deposito é menor que o valor minimo ;
    // se for, não pode ocorrer o deposito;
if(valor< VALOR_MINIMO_DEPOSITO){
    throw new InputMismatchException("O valor minimo de deposito é R$"+ VALOR_MINIMO_DEPOSITO);
    //#region explicação (throw new InputMismatchException)
//throw:  é utilizada  para explicitamente lançar uma exceção.
//Está indicando que ocorreu um problema no seu código e que você deseja interromper a execução normal do programa;
//new InputMismatchException: Aqui, você está criando uma nova instância da classe 
//InputMismatchException. Esta é uma exceção lançada quando há um problema com o tipo de dado
//de entrada. Por exemplo, se você estiver tentando ler um número inteiro, mas o usuário insere uma 
//string, uma InputMismatchException pode ser lançada.
//#endregion
}
this.saldo += valor;
//efetua o deposito, pegando o saldo e adicionando o valor;
}
public Double Sacar (Double valor){

//verifica se o saldo é menor que o valor que o usuario quer sacar
// se for, vai aparecer a excessao para o usuario; 
    if(this.saldo < valor){
        throw new InputMismatchException("O valor que você deseja sacar é maior que o seu saldo! Seu saldo é de R$"+saldo);
    }
//efetua o saque, retirando o valor desejado do saldo atual; 
    this.saldo= saldo - valor;
// retorna o valor que foi sacado da conta;
    return valor; 
}
public  void transferir (Double valor, contaBancaria contaDestino ){
  // efetua um saque na conta atual;
    this.Sacar(valor);
// deposita o valor sacado na conta de destina;
    contaDestino.Depositar(valor);
}
//#endregion
}






    




    






















