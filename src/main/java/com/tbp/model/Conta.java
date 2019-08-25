package com.tbp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Conta implements Serializable {

    String numero;
    double valor;
    ArrayList<Transacao> transacaoList;

    public Conta(String numero) {
        this.numero = numero;
        valor = 0;
        transacaoList = new ArrayList<Transacao>();
    }

    public void depositar(double valor) {
        this.valor = this.valor + valor;
        Transacao transacao = new Transacao(numero, new Date(), "deposito");
        transacaoList.add(transacao);
    }

    public void sacar(double valor) {
        this.valor = this.valor - valor;
        Transacao transacao = new Transacao(numero, new Date(), "saque");
        transacaoList.add(transacao);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", valor=" + valor +
                ", transacaoList=" + transacaoList +
                '}';
    }
}

