import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Intégration du jeu de données (100 salaires)
        List<Double> salaires = new ArrayList<>(Arrays.asList(
            // Tranche 2000-3000
            2100.0, 2150.0, 2200.0, 2250.0, 2300.0, 2350.0, 2400.0, 2450.0, 2500.0, 2550.0, 2600.0, 2650.0, 2700.0, 2750.0, 2800.0, 2900.0, 2950.0, 2950.0, 3000.0, 3000.0, 3000.0, 3000.0,
            // Tranche 3000-4000
            3100.0, 3100.0, 3150.0, 3150.0, 3200.0, 3200.0, 3250.0, 3250.0, 3300.0, 3300.0, 3350.0, 3350.0, 3400.0, 3400.0, 3450.0, 3500.0, 3550.0, 3600.0, 3650.0, 3700.0, 3750.0, 3800.0, 3850.0, 3900.0, 3900.0, 3950.0, 3950.0, 4000.0,
            // Tranche 4000-5500
            4100.0, 4150.0, 4200.0, 4250.0, 4300.0, 4350.0, 4400.0, 4450.0, 4500.0, 4550.0, 4600.0, 4650.0, 4700.0, 4750.0, 4800.0, 4850.0, 4900.0, 4950.0, 5000.0, 5050.0, 5100.0, 5150.0, 5200.0, 5250.0, 5300.0, 5350.0, 5400.0, 5450.0, 5500.0, 5500.0,
            // Tranche 5500-9500
            5600.0, 5700.0, 5800.0, 5900.0, 6000.0, 6100.0, 6200.0, 6300.0, 6400.0, 6500.0, 6700.0, 6900.0, 7100.0, 7400.0, 7700.0, 8000.0, 8300.0, 8700.0, 9100.0, 9500.0
        ));

        Statistique stats = new Statistique(salaires);

        double moy = stats.calculerMoyenne();
        double med = stats.calculerMediane();
        double sigma = stats.calculerEcartType();
        double q1 = stats.calculerQ1();
        double q3 = stats.calculerQ3();

        System.out.println("--- Résultats Statitiques ---");
        System.out.printf("Moyenne (μ) : %.2f €\n", moy);
        System.out.printf("Médiane     : %.2f €\n", med);
        System.out.printf("Écart-type (σ): %.2f €\n", sigma);
        System.out.printf("Q1 (Réel)   : %.2f € | Q3 (Réel) : %.2f €\n", q1, q3);

        System.out.println("\n--- Vérification Loi Normale ---");
        // Selon la loi normale : Q1 théorique = μ - 0.674 * σ
        double q1Theorique = moy - (0.674 * sigma);
        double q3Theorique = moy + (0.674 * sigma);
        
        System.out.printf("Q1 Théorique : %.2f €\n", q1Theorique);
        System.out.printf("Q3 Théorique : %.2f €\n", q3Theorique);
    }
}