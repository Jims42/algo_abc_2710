package Exercice_Inter;

import java.util.Random;
import java.util.Scanner;

public class Tri_Tableau_Manuel {
    public static void main(String[] args) {
        Random alea = new Random();
        Scanner clavier = new Scanner(System.in);
        int[] tableau1 = new int[10];
        for (int i = 0; i < tableau1.length; i++) {
            // System.out.print("entrez la valeur " + (i + 1) + " : ");
            // tableau1[i] = clavier.nextInt();
            tableau1[i] = alea.nextInt(100);
        }
        System.out.println("\t\t-----------");
        System.out.print("Avant le tri :");
        AfficherTableau(tableau1);

        int n = tableau1.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (tableau1[j] < tableau1[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = tableau1[i];
                tableau1[i] = tableau1[min];
                tableau1[min] = temp;
            }
        }
        System.out.println("\t\t-----------");
        System.out.print("Après le tri :");
        AfficherTableau(tableau1);
        clavier.close();
    }

    public static void AfficherTableau(int[] tab) {
        System.out.print("[ ");
        for (int val : tab)
            System.out.print(val + " ");
        {
            System.out.println("]");

        }

    }
}
