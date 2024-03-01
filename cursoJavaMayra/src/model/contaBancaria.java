 package model;

class contaBancaria {

    private String conta;

    private String digito;

    private String agencia;

    private Double saldo;

    

    public contaBancaria(String conta, String digito, String agencia, Double saldoInicial) {
        this.conta = conta;
        this.digito = digito;
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
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

    }
    




    






















