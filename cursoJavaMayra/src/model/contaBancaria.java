 package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

 // classe abstract não pode ser instanciada, serve apenas como um modelo para outras classes que vão herdar informaçoes dela.
public  abstract class contaBancaria {
   
//#region Atributos

//Os atributos estão todos protected, por que esta classe é uma classe abstract;
//e para que esta classe e seus filhos(quem herdou esta classe) possam mexer ou modificar, os seus atributos tem que estar
    protected String conta;

    protected int digito;

    protected String agencia;

    protected Double saldo;

    protected Date dataAbertura;

    protected ArrayList <Movimentacao> movimentar;

    protected Double VALOR_MINIMO_DEPOSITO = 10.0;
//#endregion
//#region Construtor
    public contaBancaria(String conta, int digito, String agencia, Double saldoInicial) {
        this.conta = conta;
        this.digito = digito;
        this.agencia = agencia;
        this.saldo = saldoInicial;
        this.dataAbertura= new Date();
        // se não instanciar um ArrayList, vai dar um exception de nullPOinterException; ele vai estar nulo;
        this. movimentar = new ArrayList<Movimentacao>();
        Movimentacao movimentacao = new Movimentacao("Abretura de conta", saldoInicial);
        // metodo .add ele é usado para inserir algo no ArrayList();
        this.movimentar.add(movimentacao);
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
// criando uma nova movimentação e logo apos add no arrayList;
Movimentacao movimentar = new Movimentacao("Deposito", valor);
this.movimentar.add(movimentar);
}
public Double Sacar (Double valor){

//verifica se o saldo é menor que o valor que o usuario quer sacar
// se for, vai aparecer a excessao para o usuario; 
    if(this.saldo < valor){
        throw new InputMismatchException("O valor que você deseja sacar é maior que o seu saldo! Seu saldo é de R$"+saldo);
    }
//efetua o saque, retirando o valor desejado do saldo atual; 
    this.saldo-= valor;

    // criando uma nova movimentação e logo apos add no arrayList;
    Movimentacao movimentar = new Movimentacao("Deposito", valor);
    this.movimentar.add(movimentar);

// retorna o valor que foi sacado da conta;
    return valor; 
}
public  void transferir (Double valor, contaBancaria contaDestino ){
  // efetua um saque na conta atual;
    this.Sacar(valor);
// deposita o valor sacado na conta de destina;
    contaDestino.Depositar(valor);

}

//metodo abstract obriga as classes que estão herdando ele, a implementarem ele; 
public abstract void imprimirExtrato();
//#endregion
}







    




    






















