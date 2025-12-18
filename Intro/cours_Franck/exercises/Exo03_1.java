import java.util.Random;
import java.util.Scanner;

public class Exo03_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int nmystere = random.nextInt(101);
        int essai;
        int nessai = 0;
        boolean trouve = false;

        Scanner clavier = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu de la fourchette,\nDevinez le nombre mystère entre 0 et 100. ");

        while (!trouve) {
            System.out.println("Entrez votre essai : ");
            essai = clavier.nextInt();
            nessai++;

            if (essai < nmystere) {
                System.out.println("Le nombre mystère est plus \u001B[34mgrand\u001B[0m].");
            } else if (essai > nmystere) {
                System.out.println("Le nombre mystère est plus \u001B[35mpetit\u001B[0m");
            } else {
                trouve = true;
                System.out.println("\u001B[32m!!! BRAVO !!!\u001B[0m\nVous avez trouvéle nombre mystère en \u001B[4;33m"
                        + nessai + "\u001B[4;0m essai");
            }
        }
        clavier.close();

    }
}
