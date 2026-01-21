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

            char[] motSecret = console.readPassword("Entrer un mot de plus de 5 caractère");
            mot = new String(motSecret).toUpperCase();
            java.util.Arrays.fill(motSecret, ' ');

            if (mot.length() <= 5) {
                System.out.println("Mot trop court ! recommencer \n ");
            }

        }

        char[] affichage = new char[mot.length()];
        char[] affichageFinal = new char[mot.length()];

        for (int i = 0; i < mot.length(); i++) {
            affichageFinal[i] = mot.charAt(i);
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
        char[] tabLettreFausse = new char[6];
        int nbLettreFausse = 0;

        while (nbEssai > 0 && !motTrouve) {
            motCherche = "";
            for (char c : affichage) {
                motCherche += c + " ";
            }

            System.out.println("<<< TROUVER LE MOT SUIVANT >>>\n\t" + new String(motCherche) + "\n");

            System.out.print("<<< NOMBRE DE TENTATIVE(S) RESTANTE >>>\n\t\t \u001B[4;33m" + nbEssai + "\u001B[4;0m \n");
            if (nbLettreFausse > 0) {
                System.out.print("=== Lettre incorect déja utilisé >>>> : ");
                for (int i = 0; i < nbLettreFausse; i++) {
                    System.out.print("\u001B[31m" + tabLettreFausse[i] + "\u001B[0m  ");
                }
                System.out.println();
            }
            System.out.print("<<< ENTRER UNE LETTRE >>> \n\t");
            choixLettre = clavier.nextLine().toUpperCase();

            if (choixLettre.length() != 1) {
                System.out.println("Entrer une seule lettre !");
                continue;
            }
            char lettre = choixLettre.charAt(0);
            boolean lettreTrouve = false;
            boolean lettreDouble = false;

            for (int i = 0; i < nbLettreFausse; i++) {
                if (tabLettreFausse[i] == lettre) {
                    lettreDouble = true;
                    break;
                }
            }
            if (lettreDouble) {
                System.out.println("===> \u001B[31mVous avez déjà proposé cette lettre\u001B[0m <===] ");
                continue;
            }

            for (int i = 0; i < mot.length(); i++) {
                if (mot.charAt(i) == lettre) {
                    affichage[i] = lettre;
                    lettreTrouve = true;

                }
            }
            if (!lettreTrouve) {
                tabLettreFausse[nbLettreFausse] = lettre;
                nbLettreFausse++;
                System.out.println(
                        "La lettre \u001B[31m" + lettre + "\u001B[0m n'est pas dans le mot,\n vous perdez 1 essai");
                nbEssai--;

            }
            motTrouve = true;
            for (char c : affichage) {
                if (c == '_') {
                    motTrouve = false;
                    break;
                }
            }

        }
        String motFinal = "";

        for (char c : affichageFinal) {
            motFinal += c + " ";
        }
        if (motTrouve) {
            System.out.println(
                    "\t\t\u001B[4;32m<<< F E L I C I T A T I O N >>>\u001B[4;0m\nLe mot caché était bien >>> \u001B[32m"
                            + motFinal + "\u001b[0m");
        } else {
            System.out.println("\t\t\u001B[4;35m<<< D O M M A G E >>>\u001B[4;0m\nLe mot caché était >>> \u001B[35m"
                    + motFinal + "\u001B[0m");
        }
        if (nbLettreFausse > 0) {
            System.out.print("Les lettres incorrectes utilisées sont >>> ");
            for (int i = 0; i < nbLettreFausse; i++) {
                System.out.print("\u001B[31m" + tabLettreFausse[i] + "\u001B[0m  ");
            }
            System.out.println();
        }
        System.out.println("MERCI POUR VOTRE PARTICIPATION");

        clavier.close();

    }

}