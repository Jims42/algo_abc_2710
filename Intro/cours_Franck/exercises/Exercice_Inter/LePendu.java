package Exercice_Inter;

import java.util.Scanner;
import java.io.Console;

public class LePendu {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Console console = System.console();
        String mot = " ";
        String motCherche = "";
        while (mot.length() <= 5) {
            // System.out.println("Entrer un mot de plus de 5 caractère");
            // mot = clavier.nextLine().toUpperCase();

            char[] motSecret = console.readPassword("Entrer un mot de plus de 5 caractère");
            mot = new String(motSecret).toUpperCase();
            java.util.Arrays.fill(motSecret, ' ');

            // System.out.println("Vous avez entré : "+mot);

            if (mot.length() <= 5) {
                System.out.println("Mot trop court ! recommencer \n ");
            }

        }

        char[] affichage = new char[mot.length()];

        for (int i = 0; i < mot.length(); i++) {
            if (i == 0 || i == mot.length() - 1) {
                affichage[i] = mot.charAt(i);
            } else {
                affichage[i] = '_';
            }
        }
        // System.out.println(affichage);

        for (char c : affichage) {
            motCherche += c + " ";
        }


        System.out.println("<<< TROUVER LE MOT SUIVANT >>>\n\t"+motCherche);

        String choixLettre=" ";
        int nbEssai=6;

        choixLettre =  clavier.nextLine().toUpperCase();

        clavier.close();

    }

}