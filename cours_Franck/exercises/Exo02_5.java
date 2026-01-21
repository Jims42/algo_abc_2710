import java.util.Scanner;

public class Exo02_5 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
       int a;
        boolean diviseur=true;

        System.out.println("Indiquez une valeur: ");
        a=clavier.nextInt();
        double aa=Math.pow(a, 1);
        double bb=Math.pow(a, a);
        System.out.println("resultat "+aa+" et "+bb);

        if (%aa== 1 || %bb== 1) {diviseur=false;
            System.out.println("c'est faux !!!");
        }
        else {diviseur=true;System.out.println("c'est ok !!!");}


    }
}
