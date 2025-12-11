import java.util.Scanner;

public class exo05_bis {
    public static void main(String[] args) {

               
        int a;int b;int c;    

        Scanner clavier = new Scanner(System.in);

        System.out.println("EQUATION = A x B / C ");
        System.out.print("A = ");a=clavier.nextInt();
        System.out.print("B = ");b=clavier.nextInt();
        System.out.print("C = ");c=clavier.nextInt();
        
        System.out.println("Resultat de l'equation AxB/C = "+a*b/c);
        if ((a*b/c)>10) {System.out.println("L'équation est superieure à 10");
        }else{System.out.println("L'équation est inferieure à 10");}
        clavier.close();
    }
    
}
