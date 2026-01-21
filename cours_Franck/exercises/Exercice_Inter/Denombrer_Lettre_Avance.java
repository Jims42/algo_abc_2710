package Exercice_Inter;

import java.util.Scanner;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class Denombrer_Lettre_Avance {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        String texte= "";

        while (texte.length()<120) {
            System.out.println("Entrer votre texte(min 120 caractère)");
            texte=clavier.nextLine();
            if (texte.length()<120) {
                System.out.println("Encore "+(120-texte.length())+" caractère à saisir...");
            }
        }
        String normalise = Normalizer.normalize(texte, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{IncombiningDiacriticalMarks}+");
        String textePropre= pattern.matcher(normalise).replaceAll("").toUpperCase();

        int[] compteur= new int[26];

        for (int i = 0; i < textePropre.length(); i++) {
            char c = textePropre.charAt(i);
            if (c>= 'A'&& c<='Z') {
                compteur[c-'A']++;
            }
        }
        System.out.println("\nANALYSE DES FREQUENCES :");
        for (int i = 0; i < 26; i++) {
            if (compteur[i]>0) {
                System.out.printf("'%c' : %d | ", (char)(i+'A'),compteur[i]);
                if (i % 5 == 0 && i != 0) {
                    System.out.println();
                }
            }
        }
        clavier.close();
    }
}
