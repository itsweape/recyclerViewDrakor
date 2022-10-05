package com.example.drakorlist;

public class Drakor {
    String name;
    String genre;
    String sinopsis;

    public Drakor(String name, String genre, String sinopsis) {
        this.name = name;
        this.genre = genre;
        this.sinopsis = sinopsis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }


}
