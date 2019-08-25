package com.tbp.repository;

import com.tbp.model.Banco;

import java.io.*;

public class BancoRepository {

    String caminhoArquivos;

    public BancoRepository() {
        this.caminhoArquivos = getClass().getResource("/").getFile();
        // descomente a linha abaixo e defina qual eh o caminho dos arquivos
        // this.caminhoArquivos = "/home/thiago/workspace/read-write-file/";
        System.out.println(caminhoArquivos);
    }

    public void save(Banco banco) {
        try {
            String nomeArquivo =  caminhoArquivos + banco.getNome() + ".ser";
            File file = new File(nomeArquivo);
            file.setWritable(true);
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(banco);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Banco findByNome(String nome) {
        try {
            String nomeArquivo = caminhoArquivos + nome + ".ser";
            FileInputStream fileIn = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Banco banco = (Banco) in.readObject();
            in.close();
            fileIn.close();
            return banco;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
