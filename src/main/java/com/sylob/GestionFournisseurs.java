package com.sylob;

import java.util.ArrayList;
import java.util.List;

public class GestionFournisseurs {
    private List<Fournisseur> fournisseurs;

    public GestionFournisseurs() {
        this.fournisseurs = new ArrayList<>();
    }

    public void ajouterFournisseur(String code, String designation, String ville) {
        Fournisseur fournisseur = new Fournisseur(code, designation, ville);
        fournisseurs.add(fournisseur);
        System.out.println("Fournisseur ajouté avec succès. ID : " + fournisseur.getId());
    }

    public void afficherFournisseurs() {
        if (fournisseurs.size() == 0) {
            System.out.println("Aucun fournisseur n'a été ajouté.");
        } else {
            System.out.println("Liste des fournisseurs :");
            for (Fournisseur fournisseur : fournisseurs) {
                System.out.println("\t" + fournisseur);
            }
        }
    }

    public void supprimerFournisseur(int id) {
        for (Fournisseur fournisseur : fournisseurs) {
            if (fournisseur.getId() == id) {
                fournisseurs.remove(fournisseur);
                System.out.println("Fournisseur supprimé avec succès.");
                return;
            }
        }
        System.out.println("Aucun fournisseur n'a été trouvé avec cet ID.");
    }

    public void listerFournisseursVille(String ville) {
        boolean found = false;
        System.out.println("Liste des fournisseurs dans la ville de " + ville + " :");
        for (Fournisseur fournisseur : fournisseurs) {
            if (fournisseur.getVille().equalsIgnoreCase(ville)) {
                System.out.println(fournisseur);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Aucun fournisseur n'a été trouvé dans cette ville.");
        }
    }

}
