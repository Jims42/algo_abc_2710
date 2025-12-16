import java.util.Scanner;

public class Exo02_4 {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);

        int a;
        

        System.out.print("Indiquez l'année :");a=clavier.nextInt();

        if (a%4==0) {System.out.println("année bissextile");}
        else if (a%4!=0){System.out.println("l'année est non bissextile");}
        else if (a%4==0 && a%100!=0 && a%400==0) {System.out.println("année bissextile");}
        else{System.out.println("l'année est non bissextile");}
        clavier.close();


    }
}
