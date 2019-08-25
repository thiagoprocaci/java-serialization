package com.tbp;

import com.tbp.model.Banco;
import com.tbp.model.Conta;
import com.tbp.repository.BancoRepository;

public class Application {

    public static void main(String[] args) {
        BancoRepository bancoRepository = new BancoRepository();
        Conta conta = new Conta("1");
        conta.depositar(10);
        conta.sacar(2);

        Banco banco = new Banco("banco");
        banco.addConta(conta);

        System.out.println(banco);


        bancoRepository.save(banco);


        Banco banco2 = bancoRepository.findByNome("banco");
        System.out.println(banco2);
    }

}
