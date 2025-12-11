import java.util.Scanner;

public class exo12_cor {

    public static void main(String[] args) {
        
        double prix ;
        double reduc;
        double ttc;

        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Quel est le prix ?");
        prix = clavier.nextDouble();

        System.out.println("Votre réduction est de (en %): ");
        reduc = clavier.nextDouble();

        System.out.println("Prix après la réduction : ");

                System.out.println(ttc = prix-(prix*(reduc/100)));          
clavier.close();
    }


    
}
