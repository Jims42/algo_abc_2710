package Exercice_Inter;

import java.util.*;
import java.util.Locale;
public class Tierce {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Indiquer le nombre de chevaux au départ de la course : ");
        int nbParticipant = clavier.nextInt();
        System.out.println("------------------------------");
        System.out.println("Indiquer le nombre de chevaux que vous avez joués :");
        int nbJouer = clavier.nextInt();
        long resultatX = calculerFactorielle(nbParticipant) / calculerFactorielle(nbParticipant - nbJouer);
        long resultatY = calculerFactorielle(nbParticipant)
                / (calculerFactorielle(nbJouer) * calculerFactorielle(nbParticipant - nbJouer));

        System.out.println("------- <<< RESULTAT >>> -------\n");
        System.out.printf(Locale.US,"Dans l'ordre : 1 Chance sur %,d%n ",resultatX);
        System.out.println("\t--------");
        System.out.printf(Locale.US,"Dans le désordre : 1 chance sur %,d%n : ", resultatY);

        System.out.println(
                "Les jeux d'argent et de hasard peuvent être dangereux : pertes d'argent, conflits familiaux, addiction…\n Retrouvez nos conseils sur joueurs-info-service.fr (09 74 75 13 13 - appel non surtaxé)");

        clavier.close();
    }

    public static long calculerFactorielle(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
