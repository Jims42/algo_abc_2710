package Exercice_Inter;

import java.util.Scanner;

public class Denombrer_Lettre {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        String phrase = "";

        while (phrase.length() < 120) {
            System.out.println("Veuillez écrire une phrase d' au moins 120 caracrère");

            System.out.println("(longueur actuelle : " + phrase.length() + " )");
            phrase = clavier.nextLine();
            if (phrase.length() < 120) {
                System.out.println("phrase trop court ! Recommencez.\n");
            }
        }
        int[] occurence = new int[26];
        String phraseMaj = phrase.toUpperCase();
        System.out.println(phraseMaj + " ");
        for (int i = 0; i < phraseMaj.length(); i++) {
            char c = phraseMaj.charAt(i);
            System.out.print(c + " ");
            if (c >= 'A' && c <= 'Z') {
                int index = c - 'A';
                occurence[index]++;
            }
        }
        System.out.println("\n--- Résultat du dénombrement ---");
        for (int i = 0; i < occurence.length; i++) {
            char lettre = (char) (i + 'A');
            System.out.println("Lettre '" + lettre + "' : " + occurence[i] + " fois");
        }

        clavier.close();
    }
}
