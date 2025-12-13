import java.util.Scanner;

public class exo15_cor {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        
        // Taux de change (exemple, à mettre à jour selon les valeurs actuelles)
        final double EUR_TO_USD = 1.1382;
        final double EUR_TO_GBP = 0.85;
        final double USD_TO_EUR = 0.8786;
        final double USD_TO_GBP = 0.7466;
        final double GBP_TO_EUR = 1.1765;
        final double GBP_TO_USD = 1.3393;
        boolean continuer=true;
        
        while (continuer) {
            
        
        System.out.println("Quel est votre monnaie ? (EUR, USD, GBP)");

        String monnaieDepart = clavier.nextLine().toUpperCase();

        System.out.println("Quel est votre montant ?");
        double montant = clavier.nextDouble();

        System.out.println("Vous voulez la convertir en quelle devise ? (EUR, USD, GBP)");
        clavier.nextLine(); // Pour consommer la nouvelle ligne
        String monnaieArrivee = clavier.nextLine().toUpperCase();

        double resultat = 0;

        if (monnaieDepart.equals(monnaieArrivee)) {
            System.out.println("Erreur : Vous ne pouvez pas convertir la même devise.");
            continue;
        }

        switch (monnaieDepart) {
            case "EUR":
                if (monnaieArrivee.equals("USD")) {
                    resultat = montant * EUR_TO_USD;
                } else if (monnaieArrivee.equals("GBP")) {
                    resultat = montant * EUR_TO_GBP;
                }
                break;
            case "USD":
                if (monnaieArrivee.equals("EUR")) {
                    resultat = montant * USD_TO_EUR;
                } else if (monnaieArrivee.equals("GBP")) {
                    resultat = montant * USD_TO_GBP;
                }
                break;
            case "GBP":
                if (monnaieArrivee.equals("EUR")) {
                    resultat = montant * GBP_TO_EUR;
                } else if (monnaieArrivee.equals("USD")) {
                    resultat = montant * GBP_TO_USD;
                }
                break;
            default:
                System.out.println("Devise non reconnue.");
                continue;
        }

        System.out.printf("Résultat : %.2f %s%n", resultat, monnaieArrivee);
        

        

            System.out.println("Voulez-vous faire une autre conversion ? (Oui/Non)");
            String reponse = clavier.nextLine().toLowerCase();
            if (!reponse.equals("oui")) {
                continuer = false;
            }
        }

        System.out.println("Merci d'avoir utilisé le convertisseur de devises !");
}
}


    
    

