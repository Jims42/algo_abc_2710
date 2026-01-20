package Exercice_Inter;

import java.math.BigInteger;
import java.util.*;

public class Tierce {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Indiquer le nombre de chevaux au départ de la course : ");
        int nbParticipant = clavier.nextInt();
        System.out.println("------------------------------");
        System.out.println("Indiquer le nombre de chevaux que vous avez joués :");
        int nbJouer = clavier.nextInt();
        // Utilisation de BigInteger pour les calculs
        BigInteger factN = bigcalculerFactorielle(nbParticipant);
        BigInteger factP = bigcalculerFactorielle(nbJouer);
        BigInteger factNMoisP = bigcalculerFactorielle(nbParticipant - nbJouer);

        BigInteger resultatX = factN.divide(factNMoisP);
        BigInteger resultatY = factN.divide(factP.multiply(factNMoisP));

         System.out.println("------- <<< RESULTAT >>> -------\n");
        System.out.printf(Locale.US, "Dans l'ordre : 1 Chance sur %,d%n ", resultatX);
      
        System.out.println("\t--------");
        System.out.printf(Locale.US, "Dans le désordre : 1 chance sur %,d%n : ", resultatY);

        System.out.println(
                "Les jeux d'argent et de hasard peuvent être dangereux : pertes d'argent, conflits familiaux, addiction…\n Retrouvez nos conseils sur joueurs-info-service.fr (09 74 75 13 13 - appel non surtaxé)");

        clavier.close();

        // utilisation avec maximum 20 participats(long max 64 bits)

    //     long resultatX = calculerFactorielle(nbParticipant) / calculerFactorielle(nbParticipant - nbJouer);
    //     long resultatY = calculerFactorielle(nbParticipant)
    //             / (calculerFactorielle(nbJouer) * calculerFactorielle(nbParticipant - nbJouer));

    //     System.out.println("------- <<< RESULTAT >>> -------\n");
    //     System.out.printf(Locale.US, "Dans l'ordre : 1 Chance sur %,d%n ", resultatX);
        
    //     System.out.println("\t--------");
    //     System.out.printf(Locale.US, "Dans le désordre : 1 chance sur %,d%n : ", resultatY);

    //     System.out.println(
    //             "Les jeux d'argent et de hasard peuvent être dangereux : pertes d'argent, conflits familiaux, addiction…\n Retrouvez nos conseils sur joueurs-info-service.fr (09 74 75 13 13 - appel non surtaxé)");

    //     clavier.close();
    // }
    // long resultatX = factorielleRecursive(nbParticipant) / factorielleRecursive(nbParticipant - nbJouer);
    //     long resultatY = factorielleRecursive(nbParticipant)
    //             / (factorielleRecursive(nbJouer) * factorielleRecursive(nbParticipant - nbJouer));

    //     System.out.println("------- <<< RESULTAT >>> -------\n");
    //     System.out.printf(Locale.US, "Dans l'ordre : 1 Chance sur %,d%n ", resultatX);
        
    //     System.out.println("\t--------");
    //     System.out.printf(Locale.US, "Dans le désordre : 1 chance sur %,d%n : ", resultatY);

    //     System.out.println(
    //             "Les jeux d'argent et de hasard peuvent être dangereux : pertes d'argent, conflits familiaux, addiction\n Retrouvez nos conseils sur joueurs-info-service.fr (09 74 75 13 13 - appel non surtaxé)");

    //     clavier.close();
}

    public static long calculerFactorielle(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static BigInteger bigcalculerFactorielle(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static long calculerFactorielleOO(long n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static long factorielleRecursive(long _nb){
        if (_nb>1) {

          return  _nb*factorielleRecursive(_nb-1);
        } else {
            return 1;
        }
    }
}
