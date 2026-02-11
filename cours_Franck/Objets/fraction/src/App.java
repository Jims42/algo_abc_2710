import java.util.LinkedList;

import boundary.Ecran;
import models.Fraction;

public class App {
    public static void main(String[] args) throws Exception {
        Fraction f = new Fraction(12, 5);
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(9);

        LinkedList<Fraction> maList = new LinkedList<Fraction>();
        maList.add(f);
        maList.add(f1);
        maList.add(f2);
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\t\tAFFICHAGE\t\t");
        System.out.println("---------------------------------------------------------------------------------------------------");
        Ecran.affiche(maList);
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\t\tOPPOSE\t\t");
        System.out.println("---------------------------------------------------------------------------------------------------");
        f.oppose();
       
        Ecran.affiche(maList);
        f.oppose();
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\t\tINVERSION\t\t");
        System.out.println("---------------------------------------------------------------------------------------------------");
        f.inverse();
        Ecran.affiche(maList);
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\t\tSOMME\t\t");
        System.out.println("---------------------------------------------------------------------------------------------------");
        
        System.out.println("La somme des deux fraction est : "+f.sommeFraction(f2));
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\t\tQUOTIENT\t\t");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Le quotient des deux fraction est : "+f.quotient(f2));
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\t\tMULTIPLICATION");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("La multiplication des deux fraction est : "+f.multiFraction(f2));
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("\t\tPUISSANCE");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("La puissance des deux fraction : "+f.puissanceFraction(4));
        System.out.println("---------------------------------------------------------------------------------------------------");
        

    }
}
