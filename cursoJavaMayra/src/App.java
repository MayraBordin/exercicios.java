import model.contaPoupança;
import model.movimentacao;
import model.contaCorrente;
import utils.DataUtil;

public class App {

    public static void main(String [] args ){

        System.out.println("Criando um banco digitral .");
        System.out.println();

    contaCorrente conta = new contaCorrente("2304", 7, "0001", 100.00);

        System.out.println("Saldo atual da conta R$ "+conta.getSaldo());
        System.out.println();

        conta.Depositar(200.0);
        System.out.println("Saldo atual da conta R$ "+conta.getSaldo());
        System.out.println();

        conta.Sacar(100.0);
        System.out.println("Saldo atual da conta R$ "+conta.getSaldo());
        System.out.println();
    
    contaPoupança conta2 = new contaPoupança("2305", 8, "0001", 200.00);

        conta2.transferir(100.00, conta);
        System.out.println("Saldo atual conta  destino de R$ "+conta2.getSaldo());
        System.out.println();

         System.out.println("Saldo atual da conta R$ "+conta.getSaldo());
        System.out.println();

    System.out.println(conta.getDataAbertura());
    System.out.println();


      var f1=  DataUtil.converterDateParadataEHora(conta.getDataAbertura());
      var f2 = DataUtil.converterDateParadata(conta.getDataAbertura());
      var f3 = DataUtil.converterDateParaHora(conta.getDataAbertura());

    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);

    //EXTRATO BANCARIO É COMPOSTO POR MOVIMENTAÇOES BANCARIAS; 
    //TER ALGO QUE POSSA SER A MOVIMENTAÇÃO(VALOR, DATA, DESCRIÇÃO SOBRE A MOVIMENTAÇÃO);
    //TER UMA LISTA DE MOVIMENTAÇOES;

 movimentacao movimentacao = new movimentacao("saque" , 100.00);

 System.out.println(movimentacao.toString());

    }
}