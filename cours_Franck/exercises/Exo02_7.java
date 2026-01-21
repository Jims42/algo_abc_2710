import java.util.Scanner;

public class Exo02_7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        final double MILES = 1.609;
        double km = 0;

        String reponse;
        boolean resultat = true;

        do {
            System.out.print("Indiquez la valeur en Kilomètre : ");

            reponse = clavier.nextLine();
            try {
                km = Double.parseDouble(reponse);
            } catch (Exception e) {

                System.out.println("valeur non numérique");
            }

            if (km > 0.01 && km < 1000000) {resultat=true;

            } else {
                resultat = false;
                System.out.println("La valeur saisie est incorrect, recommencez");
            }
            // }

            if (resultat) {
                double conv = km / MILES;
                System.out.printf(
                        "La conversion de \u001B[4;32m%.2f\u001B[4;0m kilomètres est egals à \u001B[4;33m%.2f\u001B[4;0m miles\n",
                        km, conv);

            }
        } while (!reponse.equals("q"));

        System.out.println("programme terminé.");
        clavier.close();

    }
}
