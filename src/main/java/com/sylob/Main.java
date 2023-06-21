package com.sylob;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionFournisseurs gestionFournisseurs = new GestionFournisseurs();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // COLOR CODES YELLOW
            System.out.println(ConsoleColors.WHITE_BOLD);
            System.out.println("1. Lister les fournisseurs");
            System.out.println("2. Ajouter un fournisseur");
            System.out.println("3. Supprimer un fournisseur");
            System.out.println("4. Lister les fournisseurs d'une ville");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            // COLOR CODES RESET
            System.out.print(ConsoleColors.RESET);

            // Read user input
            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println(ConsoleColors.RED + "Veuillez entrer un nombre." + ConsoleColors.RESET);
                continue;
            }

            switch (option) {
                case 1:
                    gestionFournisseurs.afficherFournisseurs();
                    break;
                case 2:
                    System.out.print("Code du fournisseur : ");
                    String code = scanner.nextLine();
                    // TODO: Check if code already exists
                    if (code.length() == 0) {
                        System.out.println("Le code du fournisseur ne peut pas être vide.");
                        break;
                    }

                    System.out.print("Désignation du fournisseur : ");
                    String designation = scanner.nextLine();
                    System.out.print("Ville du fournisseur : ");
                    String ville = scanner.nextLine();
                    gestionFournisseurs.ajouterFournisseur(code, designation, ville);
                    break;
                case 3:
                    int id;
                    while (true) {
                        System.out.print("ID du fournisseur à supprimer : ");
                        try {
                            id = Integer.parseInt(scanner.nextLine());
                            if (id >= 0) {
                                break;
                            } else {
                                System.out.println(ConsoleColors.RED + "Veuillez saisir un nombre positif."+ ConsoleColors.RESET);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println(ConsoleColors.RED + "Veuillez saisir un nombre valide." + ConsoleColors.RESET);
                        }
                    }
                    gestionFournisseurs.supprimerFournisseur(id);
                    break;
                case 4:
                    System.out.print("Ville : ");
                    String ville2 = scanner.nextLine();
                    gestionFournisseurs.listerFournisseursVille(ville2);
                    break;
                case 5:
                    System.out.println("Merci d'avoir utilisé le programme.");
                    System.exit(0);
                    break;
                default:
                    System.out.println(ConsoleColors.RED + "Option invalide." + ConsoleColors.RESET);
                    break;
            }
        }
    }
}