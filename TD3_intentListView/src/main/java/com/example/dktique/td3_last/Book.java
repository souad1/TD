package com.example.dktique.td3_last;

import java.io.Serializable;

/**
 * Created by DKTIQUE on 22/02/2016.
 */
public class Book implements Serializable{

    private String title;
   private int cover;
    private String auteur;
    private String editeur;

    public String getAuteur() {
        return auteur;
    }

    public Book(int cover, String title,String auteur) {
        this.cover = cover;
        this.title = title;
        this.auteur = auteur;
    }

    public String getTitle() {
        return title;
    }

    public int getCover() {
        return cover;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }
}
