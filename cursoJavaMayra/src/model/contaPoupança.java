package model;

import java.util.Date;

import utils.DataUtil;

public class contaPoupança extends contaBancaria {

    public contaPoupança(String conta, int digito, String agencia, Double saldoInicial) {
        super(conta, digito, agencia, saldoInicial);
    
    }

    @Override
    public void imprimirExtrato() {
     System.out.println("**************************************");
     System.out.println("********** EXTRATO POUPANÇA **********");
     System.out.println("**************************************");
     System.out.println();
     System.out.println("Extrato gerado em : "+ DataUtil.converterDateParadataEHora(new Date()));
     System.out.println();

        //esse FOR(foreat) é um laço de repetição, que vai ficar em lup ate percorrer todo o arrayList ou array;
        //ele é lido assim: para cada movimentação dentro de movimentar faça isso ...
        for (Movimentacao movimentacao :this.movimentar) {
                    //(tipo nome : ArrayLIst)(: significa dentro de)
          System.out.println(movimentacao);
          System.out.println();
    }
    System.out.println("**************************************");
    System.out.println("**************************************");
    System.out.println("**************************************");
    System.out.println();


    }
    

}
