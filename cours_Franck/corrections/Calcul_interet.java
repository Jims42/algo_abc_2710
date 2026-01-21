package cours_Franck.corrections;

import java.util.Scanner;

public class Calcul_interet {
    public static void main(String[] args) throws Exception {
        double capital, taux;
        int nbAnne;
        double renteISimple;
        double renteIcompose;

        double renteISimpleArr;
        double renteIcomposeArr;

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le capital que vous souhaitez placer :");
        capital = sc.nextDouble();
        System.out.println("Veuillez saisir le taux d'intérêt de rémuneration en %:");
        taux = (sc.nextDouble()) / 100;
        System.out.println("Veuillez saisir le nombre d'années pleines du placement :");
        nbAnne = sc.nextInt();

        renteISimple = capital * (1 + nbAnne * taux);
        renteIcompose = capital * Math.pow((1 + taux), nbAnne);
       
        renteISimpleArr=arrondi(renteISimple,2);
        renteIcomposeArr=arrondi(renteIcompose, 2);
        System.out.println("Votre Capital placé à intérêt simple au bout de "+ nbAnne+" sera de  "+ renteISimpleArr+ " Euros");
        System.out.println("Votre Capital placé à intérêt composé au bout de "+ nbAnne+" sera de  "+ renteIcomposeArr+ " Euros");
        sc.close();

    }

    public static double arrondi(double nb, int nv) {

        return (double) ((long) (nb * Math.pow(10, nv) + 0.5)) / Math.pow(10, nv);

    }

}
 