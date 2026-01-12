package cours_Franck.corrections;

import java.util.Random;
import java.util.Scanner;

public class Tri_Tableau {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien de nombre voulez-vous generer ?");
        int n = clavier.nextInt();
        int[] monTab = new int[n];
        remplirTableau(monTab);
        AfficherMonTableau(monTab);
        // trierTableau(monTab);
        trierTableauBulle(monTab);
        AfficherMonTableau(monTab);

        clavier.close();
    }

    public static void trierTableau(int[] _Tableau) {
        int encours, pluspetit, j, temp;
        for (encours = 0; encours < _Tableau.length; encours++) {
            pluspetit = encours;
            for (j = encours + 1; j < _Tableau.length; j++) {
                if (_Tableau[j] < _Tableau[pluspetit]) {
                    pluspetit = j;
                }
            }
            temp = _Tableau[encours];
            _Tableau[encours] = _Tableau[pluspetit];
            _Tableau[pluspetit] = temp;
        }
        System.out.println("\t===== TABLEAU TRIER =====");

    }

    // On dit quele tableau est passé en paramêtre par référence
    public static void remplirTableau(int[] _Tableau) {
        Random alea = new Random();
        for (int i = 0; i < _Tableau.length; i++) {
            _Tableau[i] = alea.nextInt(101);
        }

    }

    public static void AfficherMonTableau(int[] _Tableau) {
        System.out.println("-----------------------------------");
        System.out.print("[\u001B[44m ");
        for (int element : _Tableau) {
            System.out.print(element + " ");
        }
        System.out.print("\u001B[0m]\n-----------------------------------\n");
    }

    public static void trierTableauBulle(int[] _Tableau) {
        boolean echange;

        for (int i = 0; i < _Tableau.length; i++) {
            echange = false;

            for (int j = 0; j < _Tableau.length - 1 - i; j++) {
                if (_Tableau[j] > _Tableau[j + 1]) {
                    int temp = _Tableau[j];
                    _Tableau[j] = _Tableau[j + 1];
                    _Tableau[j + 1] = temp;

                    echange = true;
                }
            }
            if (!echange)
                break;

        }
        System.out.println("\t===== TABLEAU TRIER BULLE =====");
    }
}
