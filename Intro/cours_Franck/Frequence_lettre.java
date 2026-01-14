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
        phrase=clavier.nextLine();

        do {
            System.out.println("Veuillez saisir une phrase d'au moins 120 caractères !");

        } while (phrase.length() < 120);

        char lettre = 'a';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = lettre;
            lettre++;
        }
        Tri_Tableau.AfficherMonTableau(alphabet);
        for (int i = 0; i < tabFrequence.length; i++) {
            tabFrequence[i] = 0;
        }
        Tri_Tableau.AfficherMonTableau(tabFrequence);
        clavier.close();
    }
}
