package cours_Franck.corrections;

import java.util.Scanner;

public class Exemple_Factorielle_AAA {
     public static void main(String[] args) {

        long nbchevaux, res;
        int choix;
        boolean ordre = false;
        boolean question = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de chevaux partant ?");
        nbchevaux = sc.nextLong();
        System.out.println("souhaitez-vous jouer :// un tiercé  1 // un quarté  2 // un quinté: 3?");
        choix = sc.nextInt();
        sc.nextLine();
       // 1. Boucle de validation
while (!question) {
    System.out.println("Arrivée dans l'ordre ou désordre ? (o/n)");
    String reponse = sc.nextLine().trim().toLowerCase();

    if (reponse.equals("true") || reponse.equals("ordre") || reponse.equals("o") || reponse.equals("oui")) {
        ordre = true;
        question = true;
    } else if (reponse.equals("false") || reponse.equals("desordre") || reponse.equals("n") || reponse.equals("non")) {
        ordre = false;
        question = true;
    } else {
        System.out.println("Entrée invalide, réessayez.");
    }
}

// 2. Logique de calcul
int n = 0; // Nombre de chevaux à choisir (3, 4 ou 5)
String nomJeu = "";

switch (choix) {
    case 1: n = 3; nomJeu = "tiercé"; break;
    case 2: n = 4; nomJeu = "quarté"; break;
    case 3: n = 5; nomJeu = "quinté"; break;
    default:
        System.out.println("Erreur : veuillez taper un nombre entier entre 1 et 3.");
        return; // Quitte si le choix est mauvais
}

// 3. Calcul unique et affichage
if (ordre) {
    res = Exemple_Factorielle.nbArrangement(n, nbchevaux);
    System.out.println("Vous avez 1 chance de gagner le " + nomJeu + " dans l'ordre sur : " + res);
} else {
    res = Exemple_Factorielle.nbCombinaison(n, nbchevaux);
    System.out.println("Vous avez 1 chance de gagner le " + nomJeu + " dans le désordre sur : " + res);
} 
sc.close();
     }
     public static long factorielleRecursive(long _nb) {
        if (_nb > 1) {

            return _nb * factorielleRecursive(_nb - 1);

        } else {
            return 1;
        }

    }

    public static long nbArrangement(int _nbchevauxJouer, long _nbchevauxPartant) {
        // X = n ! / (n - p) !
        return factorielleRecursive(_nbchevauxPartant)
                / factorielleRecursive(_nbchevauxPartant - (long) _nbchevauxJouer);

    }

    public static long nbCombinaison(int _nbchevauxJouer, long _nbchevauxPartant) { // Y = n ! / (p ! * (n – p) !)
        long resultat = factorielleRecursive(_nbchevauxPartant)
                / (factorielleRecursive(_nbchevauxJouer) * factorielleRecursive(_nbchevauxPartant - _nbchevauxJouer));

        return resultat;

    }
    }
