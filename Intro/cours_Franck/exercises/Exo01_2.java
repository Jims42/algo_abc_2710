import java.util.Scanner;
public class Exo01_2 {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);

        double R;
        double pi= Math.PI;

        System.out.println("Lire le rayon R d'une sphère puis calculer et afficher: ");

        System.out.print("indiquez le rayon : ");R=clavier.nextDouble();

        System.out.println("Son aire = "+ 4*pi*(R*R));
        System.out.println("son volume = "+(4/3)*pi*(R*R*R));
        clavier.close();



    }
}
