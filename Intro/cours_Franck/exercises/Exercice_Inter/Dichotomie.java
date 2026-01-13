package Exercice_Inter;

import java.util.Arrays;
import java.util.Scanner;

public class Dichotomie {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        // String[] tabNoms = new String[7];
        // for (int i = 0; i < tabNoms.length; i++) {
        // System.out.print("Entrer le Nom dans la case "+(i+1)+" : ");
        // String prenoms=clavier.nextLine().toUpperCase();
        // }

        String[] tabNoms = new String[] { "agathe", "berthe", "chloé", "cunégonde", "olga", "raymonde", "sidonie" };
        
        for (int i = 0; i < tabNoms.length; i++) {
            tabNoms[i]=(String) tabNoms[i].toUpperCase();
            System.out.println(i + 1 + " - || " + tabNoms[i] + " ||");
        }
        System.out.println("Entrer le prénom recherché : ");
        String nomRecherche=clavier.nextLine();
        
        int resultat=chercheprenom(tabNoms, nomRecherche);
        if (resultat !=-1) {
            System.out.println("Prénom trouvé à l'indice : "+resultat);
        }else{
            System.out.println("Prénom nom trouvé");
        }
        

        clavier.close();
    }
    public static int chercheprenom(String[] tabNoms, String nomRecherche){
        int gauche =0;
        int droite =tabNoms.length -1;

        while (gauche<=droite) {
            int milieu = gauche +(droite - gauche)/2;

            int comparaison = nomRecherche.compareTo(tabNoms[milieu]);
            if (comparaison==0) {
                return milieu;
            }else if (comparaison<0) {
                droite=milieu-1;
            }else {
                gauche=milieu+1;
            }
        }
        return -1;
    }
    
        
    }

