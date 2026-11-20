package com.SAFEBITE.models;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;

    // Constructeur
    public Utilisateur(String nom, String prenom, String email, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    // Getters
    public String getNom()        { return nom; }
    public String getPrenom()     { return prenom; }
    public String getEmail()      { return email; }
    public String getMotDePasse() { return motDePasse; }

    @Override
    public String toString() {
        return "Utilisateur{nom='" + nom + "', prenom='" + prenom + 
               "', email='" + email + "'}";
    }
}