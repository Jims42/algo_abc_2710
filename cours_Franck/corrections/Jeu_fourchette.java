package cours_Franck.corrections;

import java.util.Random;
import java.util.Scanner;

public class Jeu_fourchette {
    public static void main(String[] args) throws Exception {
        Random alea = new Random();
        Scanner clavier = new Scanner(System.in);
        int numU, numO;
        int max = 100;
        int min = 0;
        int compteur = 0;
        boolean trouve = false;
        numO = alea.nextInt(101);

        do {
            System.out.printf("Veuillez choisir un nombre entre %d rt %d \n", min, max);
            numU = clavier.nextInt();
            compteur++;
            if (numU >= min && numU <= max) {

                if (numU > numO) {
                    max = numU;
                    System.out.println("votre nombre est superieur au nombre recherché !");
                } else if (numU < numO) {
                    min = numU;
                    System.out.println("Votre nombre est inferieur au nombre recherché !");
                } else {
                    trouve = true;
                }

            } else {

                System.out.println("Votre nombre n'est pas dans la fouchette, vous perdez un essai !");
            }

        } while (!trouve);
        System.out.println("!!! BRAVO !!! \n Le nombre recherche est " + numU + " en " + compteur + " essais !");

        clavier.close();
    }
}
