package br.com.chitv.sportfap.model;

/**
 * Created by c019 on 06/12/2016.
 */

public class CategoriaModel {

    private int idIcon;
    private String nome;

    public CategoriaModel(int id, String nome){
        this.idIcon = id;
        this.nome = nome;
    }

    public int getIdIcon() {
        return idIcon;
    }

    public String getNome() {
        return nome;
    }

}
