package br.com.chitv.sportfap.model;

/**
 * Created by c019 on 07/12/2016.
 */

public class JogadorModel {

    private int idIcon;
    private String nome;
    private String numero;

    public JogadorModel(int id, String nome, String numero){
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
