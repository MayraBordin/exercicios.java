package model;

import java.util.Date;

import utils.DataUtil;

public class Movimentacao{
    private String descricao;
    private Date data;
    private double valor;

    
    public Movimentacao(String descricao, double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }

    //#region getters and setters

    // o setData foi removido para que ninguem consiga alterar alguma data de uma movimentação;
    // o setValor foi removido por questao de segurança, para que o usuario não consiga modificar valores do extrato!
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
    
    //#endregion
//Override é uma Anotação que fala que estou sobre reescrevendo o metodo antigo,
//que o antigo não vale mais nada,e que o que esta valendo agora é o que eu estou escrevendo!
@Override
public String toString(){

    String dataFormatada= DataUtil.converterDateParaHora(this.getData());
    return this.getDescricao()+ " \n " + dataFormatada+ "- R$" + this.valor;
    //Descrição;
    //data e hora - valor;
}
}
