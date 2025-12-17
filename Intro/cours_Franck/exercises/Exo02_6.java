import java.util.Scanner;

public class Exo02_6 {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
         System.out.println("Indiquez un valeur : ");
        int nombre=clavier.nextInt();
        boolean resultat=true;
        
        if (nombre<=1) {resultat=false;}
        else{
             for (int i=2; i<=Math.sqrt(nombre); i++){
            if (nombre % i ==0) {
                resultat=false;
            break;}
             }
            }
        if (resultat) {
            System.out.println(nombre+" est un nombre premier.");
                    }else{System.out.println(nombre+" n'est pas un nombre premier.");}
                    clavier.close();
                       
                   
        }

        
    }

