package com.example.albert.listviewwithspinner;

import android.widget.Spinner;

/**
 * Created by Albert on 15/11/2017.
 */

public class Producto {

    private int imgFoto;
    private String titulo;
    private String stock;

    public Producto(int imgFoto, String titulo, String stock){
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.stock = stock;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getStock() {
        return stock;
    }

}
