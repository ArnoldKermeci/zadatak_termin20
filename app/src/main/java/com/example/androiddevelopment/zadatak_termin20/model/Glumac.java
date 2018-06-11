package com.example.androiddevelopment.zadatak_termin20.model;

import java.util.Date;
import java.util.List;

public class Glumac {
    private int id;
    private String name;
    private String biography;
    private String image;
    private float rating;
    private Date datum_rodjenja;
    private Date datum_smrti;
    private List<String> filmovi;

    public Glumac() {

    }

    public Glumac(int id, String name, String biography, String image, float rating, Date datum_rodjenja, Date datum_smrti, List<String> filmovi) {
        this.id = id;
        this.name = name;
        this.biography = biography;
        this.image = image;
        this.rating = rating;
        this.datum_rodjenja = datum_rodjenja;
        this.datum_smrti = datum_smrti;
        this.filmovi = filmovi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Date getDatum_rodjenja() {
        return datum_rodjenja;
    }

    public void setDatum_rodjenja(Date datum_rodjenja) {
        this.datum_rodjenja = datum_rodjenja;
    }

    public Date getDatum_smrti() {
        return datum_smrti;
    }

    public void setDatum_smrti(Date datum_smrti) {
        this.datum_smrti = datum_smrti;
    }

    public List<String> getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(List<String> filmovi) {
        this.filmovi = filmovi;
    }

    @Override
    public String toString() {
        return name;
    }
}
