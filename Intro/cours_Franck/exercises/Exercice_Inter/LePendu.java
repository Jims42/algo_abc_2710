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
        String choixLettre = " ";
        int nbEssai = 6;
        boolean motTrouve = false;
        String tabLettreFausse = "";

        while (nbEssai > 0 && !motTrouve) {
            motCherche = "";
            for (char c : affichage) {
                motCherche += c + " ";
            }

            System.out.println("<<< TROUVER LE MOT SUIVANT >>>\n\t" + new String(motCherche) + "\n");

            System.out.print("<<< NOMBRE DE TENTATIVE(S) RESTANTE >>>\n\t\t \u001B[4;33m" + nbEssai + "\u001B[4;0m \n");
            System.out.print("<<< ENTRER UNE LETTRE >>> \n\t");
            choixLettre = clavier.nextLine().toUpperCase();

            if (choixLettre.length() != 1) {
                System.out.println("Entrer une seule lettre !");
            }
            char lettre = choixLettre.charAt(0);
            boolean lettreTrouve = false;

            for (int i = 0; i < mot.length(); i++) {
                if (mot.charAt(i) == lettre) {
                    affichage[i] = lettre;
                    lettreTrouve = true;

                }
            }
            if (!lettreTrouve) {
                System.out.println(
                        "La lettre \u001B[31m" + lettre + "\u001B[0m n'est pas dans le mot,\n vous perdez 1 essai");
                nbEssai--;
                char[] lettreFausse = new char[lettre];

                for (char n : lettreFausse) {
                    tabLettreFausse += n + " ";
                    
                }
            }

        }

        clavier.close();

    }

}