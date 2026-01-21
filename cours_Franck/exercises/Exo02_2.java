import java.util.Scanner;

public class Exo02_2 {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Valeur de A : ");a=clavier.nextInt();
        System.out.print("Valeur de B : ");b=clavier.nextInt();

        if (a==b) {System.out.println("le resultat est "+a+" et "+b+" sont egaux");            
        }else if (a<b) {System.out.println("le resultat est "+a+" est inferieur a "+b);            
        }else{System.out.println("Le resultat est "+b+" est inferieur a "+a);}
        clavier.close();


    }
    
}
