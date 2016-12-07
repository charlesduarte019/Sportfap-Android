package br.com.chitv.sportfap.dao;

/**
 * Created by c019 on 07/12/2016.
 */

public class JogadoresDao {

    private int idIcon;
    private String nome;
    private String numero;

    public JogadoresDao(int id, String nome, String numero){
        this.idIcon = id;
        this.nome = nome;
        this.numero = numero;
    }

    public int getIdIcon() {
        return idIcon;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
