package Exercice_Inter;

import java.util.Arrays;
import java.util.Scanner;

public class Dichotomie {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien de noms voulez-vous entrer ?");
        int n = clavier.nextInt();
        clavier.nextLine();
        String[] tabNoms = new String[n];
        for (int i = 0; i < tabNoms.length; i++) {
            System.out.print("Entrer le Nom dans la case " + (i + 1) + " : ");
            tabNoms[i] = clavier.nextLine().toUpperCase();
        }
        Arrays.sort(tabNoms);
        for (int i = 0; i < tabNoms.length; i++) {
            tabNoms[i] = (String) tabNoms[i].toUpperCase();
            System.out.println(i + 1 + " - || " + tabNoms[i] + " ||");
        }

        // String[] tabNoms = new String[] { "agathe", "berthe", "chloé", "cunégonde",
        // "olga", "raymonde", "sidonie" };

        // for (int i = 0; i < tabNoms.length; i++) {
        // tabNoms[i]=(String) tabNoms[i].toUpperCase();
        // System.out.println(i + 1 + " - || " + tabNoms[i] + " ||");
        // }
        System.out.println("Entrer le prénom recherché : ");
        String nomRecherche = clavier.nextLine().toUpperCase();

        int resultat = chercheprenom(tabNoms, nomRecherche);
        if (resultat != -1) {
            System.out.println("Prénom trouvé à l'indice : " + resultat);
        } else {
            System.out.println("Prénom nom trouvé");
        }

        clavier.close();
    }

    public static int chercheprenom(String[] tabNoms, String nomRecherche) {
        int gauche = 0;
        int droite = tabNoms.length - 1;

        while (gauche <= droite) {
            int milieu = gauche + (droite - gauche) / 2;

            int comparaison = nomRecherche.compareTo(tabNoms[milieu]);
            if (comparaison == 0) {
                return milieu;
            } else if (comparaison < 0) {
                droite = milieu - 1;
            } else {
                gauche = milieu + 1;
            }
        }
        return -1;
    }

}
