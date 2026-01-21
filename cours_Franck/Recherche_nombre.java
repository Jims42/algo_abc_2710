package cours_Franck;
//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class Recherche_nombre {

    public static void main(String[] args) throws Exception {

        int nbcase;
        Scanner sc = new Scanner(System.in);

        int saisieU;
        System.out.println("Combien de valeur voulez saisir dans un tableau :? ");
        nbcase = sc.nextInt();

        int[] monTab = new int[nbcase];
        int[] occurence = new int[nbcase];
        String chaineVal = "";
        Random monAlea = new Random();
        String chaineVal2 = "";
        for (int i = 0; i < monTab.length; i++) {
            monTab[i] = monAlea.nextInt(101);
        }

        Arrays.sort(monTab);

        System.out.print("[");
        for (int el : monTab) {

            System.out.print(el + " ");

        }

        System.out.println("]");
        System.out.println("Veuillez saisir un nombre entre 0 et 100 : ");
        saisieU = sc.nextInt();

        boolean trouve = false;
        // int position = 0;
        int numOcurrence = 0;

        for (int i = 0; i < monTab.length; i++) {
            if (monTab[i] == saisieU) {

                trouve = true;

                occurence[numOcurrence] = i + 1;
                numOcurrence++;

            }

        }

        if (!trouve) {
            System.out.println(" Le nombre saisie n'est pas dans la tableau !");
        } else {

            for (int position : occurence) {

                if (position != 0) {
                    chaineVal += position + ", ";
                }

            }

            for (int position : occurence) {

                if (position == 0) {
                    continue;
                } else {
                    chaineVal2 += position + ", ";
                }

            }

            String souString = chaineVal.substring(0, chaineVal.length() - 2);
            String souString2 = chaineVal2.substring(0, chaineVal2.length() - 2);
            System.out.println("version avec Continue : " + souString2);
            System.out.print("Le nombre se trouve dans le tableau à la (aux) position(s)  : " + souString);

        }

        sc.close();
    }

}
 