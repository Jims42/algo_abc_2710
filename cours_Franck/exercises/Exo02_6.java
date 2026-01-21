import java.util.Scanner;

public class Exo02_6 {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
         System.out.println("Indiquez une valeur : ");
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
            System.out.println("\u001B[4;32m"+nombre+"\u001B[4;0m est un nombre premier.");
                    }else{System.out.println("\u001B[4;31m"+nombre+"\u001B[4;0m n'est pas un nombre premier.");}
                    clavier.close();
                       
                   
        }

        
    }

