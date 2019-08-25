package com.tbp.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Banco implements Serializable {

    String nome;
    ArrayList<Conta> contaList;

    public Banco(String nome) {
        this.nome = nome;
        contaList = new ArrayList<Conta>();
    }

    public void addConta(Conta conta) {
        contaList.add(conta);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contaList=" + contaList +
                '}';
    }

    public String getNome() {
        return nome;
    }
}
