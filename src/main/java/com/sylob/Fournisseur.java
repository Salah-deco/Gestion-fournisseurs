package com.sylob;

public class Fournisseur {
    private static int count = 1;
    private int id;
    private String code;
    private String designation;
    private String ville;

    public Fournisseur(String code, String designation, String ville) {
        this.id = count++;
        this.code = code;
        this.designation = designation;
        this.ville = ville;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesignation() {
        return this.designation;
    }

    public String getVille() {
        return this.ville;
    }

    // Setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    // toString
    public String toString() {
        return "Fournisseur " + this.id + " : " + this.code + " " + this.designation + " " + this.ville;
    }
}
