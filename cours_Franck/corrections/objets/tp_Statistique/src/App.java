import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(System.in);
        String data = "2100, 2150, 2200, 2250, 2300, 2350, 2400, 2450, 2500, 2550, 2600, 2650, 2700, 2750, 2800, 2900, 2950, 2950, 3000, 3000, 3000, 3000, 3100, 3100, 3150, 3150, 3200, 3200, 3250, 3250, 3300, 3300, 3350, 3350, 3400, 3400, 3450, 3500, 3550, 3600, 3650, 3700, 3750, 3800, 3850, 3900, 3900, 3950, 3950, 4000, 4100, 4150, 4200, 4250, 4300, 4350, 4400, 4450, 4500, 4550, 4600, 4650, 4700, 4750, 4800, 4850, 4900, 4950, 5000, 5050, 5100, 5150, 5200, 5250, 5300, 5350, 5400, 5450, 5500, 5500, 5600, 5700, 5800, 5900, 6000, 6100, 6200, 6300, 6400, 6500, 6700, 6900, 7100, 7400, 7700, 8000, 8300, 8700, 9100, 9500";
        String[] tabData = data.split(", ");
        ArrayList<Double> dataSalaire = new ArrayList<Double>();
        // Collections.addAll(dataSalaire, tabData);
        for (String valeur : tabData) {
            dataSalaire.add(Double.parseDouble(valeur));
        }
        for (double element : dataSalaire) {
            System.out.print(element + ", ");
        }
        System.out.println();
        Statistique objetStatistique = new Statistique(dataSalaire);
        System.out.println("Affichage de la moyenne de l'echantillon de salaire des metiers de l'informatique");
        double moyenne=objetStatistique.calculMoyenne();
        System.out.println("Salaire moyen de l'echantillon : "+moyenne+" euros");
        System.out.println("Affichage de l'ecart type l'echantillons de salaire des metiers de l'informatique : ");
        double ecart=objetStatistique.calculEquartType();
        System.out.println( "Ecart type moyenne + ou - :"+ecart+" euros");
         System.out.println("Affichage de la valeure medianne l'echantillons de salaire des metiers de l'informatique : ");
         System.out.println("Salaire median : "+objetStatistique.calculMedianne()+" euros");
         System.out.println("Affichage des quartil  de salaire des metiers de l'informatique : ");
        //  objetStatistique.calculQuartile();
    double [] tabQuartil=new double[3];
        tabQuartil=objetStatistique.calculQuartile();
        for (int i = 1; i < tabQuartil.length+1; i++) {
            
        
        for (double resultat : tabQuartil) {
    
           
        }
    }



        clavier.close();

    }
}
