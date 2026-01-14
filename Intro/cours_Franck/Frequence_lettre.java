package cours_Franck;

import java.util.*;
import java.util.Scanner;

import cours_Franck.corrections.Tri_Tableau;

public class Frequence_lettre {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        char[] alphabet = new char[26];
        int[] tabFrequence = new int[26];
        String phrase = "";
        System.out.println("Entrer une phrase ");
        phrase = clavier.nextLine();

        do {
            System.out.println("Veuillez saisir une phrase d'au moins 120 caractères !");

        } while (phrase.length() < 120);

        phrase = phrase.toLowerCase();
        phrase = phrase.replace('à', 'a');
        phrase = phrase.replace('é', 'e');
        phrase = phrase.replace('ê', 'e');
        phrase = phrase.replace('è', 'e');
        phrase = phrase.replace('ù', 'u');
        phrase = phrase.replace('ç', 'a');
        phrase = phrase.replace('î', 'i');
        phrase = phrase.replace('â', 'a');
        phrase = phrase.replace('ë', 'e');
        phrase = phrase.replace('ô', 'o');

        char lettre = 'a';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = lettre;
            lettre++;
        }

        // Tri_Tableau.AfficherMonTableau(alphabet);
        for (int i = 0; i < tabFrequence.length; i++) {
            tabFrequence[i] = 0;
        }
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < phrase.length(); j++) {
                if (alphabet[i] == phrase.charAt(j)) {
                    tabFrequence[i]++;
                }
            }
        }
        // for (int i = 0; i < tabFrequence.length; i++) {

        // }
        String[][] alphaFreaquence = new String[26][2];

        for (int i = 0; i < alphabet.length; i++) {
            alphaFreaquence[i][0] = "" + alphabet[i];
        }
        for (int i = 0; i < alphabet.length; i++) {
            alphaFreaquence[i][1] = "" + tabFrequence[i];
        }
        for (String[] sousTableau : alphaFreaquence) {

            System.out.println("lettre alphabet : " + sousTableau[0] + " || Fréquence d'apparition : " + sousTableau[1]);
        }

        // Tri_Tableau.AfficherMonTableau(tabFrequence);
        clavier.close();
    }
}
