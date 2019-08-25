package com.tbp.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transacao implements Serializable {

    String numeroConta;
    Date date;
    String operacao;

    public Transacao(String numeroConta, Date date, String operacao) {
        this.numeroConta = numeroConta;
        this.date = date;
        this.operacao = operacao;
    }


    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return "Transacao{" +
                "numeroConta='" + numeroConta + '\'' +
                ", date=" + sdf.format(date) +
                ", operacao='" + operacao + '\'' +
                '}';
    }
}
