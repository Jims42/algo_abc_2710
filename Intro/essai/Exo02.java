package Intro.essai;

import java.util.Scanner;

public class Exo02 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int mystère = (int) (Math.random() * 100);
        System.out.println("Bienvenu dans le jeu du chiffre mystère,\n=== TENTEZ VOTRE CHANCE ===");
        boolean trouve = false;
        int tentative = 0;
        while (!trouve) {

            System.out.println("Entrez votre essai : ");
            int essai = clavier.nextInt();

            if (essai < 0 || essai > 100) {
                System.out.println("!!! Veuillez choisir un chiffre \u001B[31mentre 0 et 100\u001B[0m !!!");
                continue;
            }
            tentative++;
            if (essai > mystère) {
                System.out.println("Le chiffre mystère est plus petit !");
            } else if (essai < mystère) {
                System.out.println("Le chiffre mystère est plus grand !");
            } else {
                trouve = true;
                System.out.println("\u001B[35m=== FELICITATION ===\u001B[0m\nVous avez trouvez le chiffre mystère \u001B[4;32m" + mystère + "\u001B[4;0m en \u001B[33m"
                        + tentative + "\u001B[0m essais");
            }
        }

        clavier.close();
    }
}
