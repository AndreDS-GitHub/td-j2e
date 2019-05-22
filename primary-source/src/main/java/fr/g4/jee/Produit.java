package fr.g4.jee;

public class Produit {
    private String nom;
    private String description;
    private double prix;
    private String photo;

    /* Constructeurs */

    public Produit(String nom, String description, double prix, String photo) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.photo = photo;
    }

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public Produit(String nom, String description, double prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    public Produit() {
    }

    /* Getters et Setters */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
