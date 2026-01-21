

import java.util.Scanner;

public class Exo01_1 {
    public static void main(String[] args) {
        
        double a;
        double b;
        double resultat;

        Scanner clavier = new Scanner(System.in);

        System.out.print("Veuillez saisir un premier nombre : ");
        a=clavier.nextDouble();
        System.out.print("Veuillez saisir un second nombre : ");
        b=clavier.nextDouble();
        resultat=(a+b)/2;
        System.out.println("La moyenne de "+a+" et "+b+" est :"+resultat );
        clavier.close();

    }
    
}
