package br.com.chitv.sportfap.dao;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by c019 on 06/12/2016.
 */

public class CategoriasDao {

    private int idIcon;
    private String nome;

    public CategoriasDao(int id, String nome){
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
