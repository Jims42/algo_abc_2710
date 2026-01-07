package Exercice_Inter;

import java.util.Arrays;
import java.util.Scanner;

public class Tri_Tableau {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int[] tableau1 = new int[10];
        for (int i = 0; i < tableau1.length; i++) {
            System.out.print("entrez la valeur " + (i + 1) + " : ");
            tableau1[i] = clavier.nextInt();
        }
        System.out.println("\t\t-------------\n");
        Arrays.sort(tableau1);
        System.out.println("<<< LE PREMIER TABLEAU >>>");
        System.out.print("[ ");
        for (int tab1 : tableau1) {
            System.out.print(tab1 + " ");
        }
        System.out.println("]");
        int[] tableau2 = new int[10];

        for (int i = 0; i < tableau2.length; i++) {
            int temp= tableau1[i];
            tableau2[i]=tableau1[i];
                      
        }
        System.out.println("<<< LE DEUXIEME TABLEAU >>>");
        System.out.print("[ ");
        for (int tab2 : tableau2) {
            System.out.print(tab2+" ");
        }
        System.out.print("]");
    }
}
