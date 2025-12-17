import java.util.Scanner;
public class Exo01_3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        double a;
        double r;
        double pi=Math.PI;

                
        System.out.println("Lire le rayon R d'un cercle et un angle A(en degré(s)).");
        System.out.print("rayon = ");r=clavier.nextDouble();
        System.out.print("Angle = ");a=clavier.nextDouble();
        double resultat=((pi*(r*r)*a)/360);
        System.out.printf("L'aire du secteur circulaire = \u001B[4;32m%.2f\u001B[4;0m ",resultat);
        clavier.close();


        
    }
    
}
