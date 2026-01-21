package cours_Franck.corrections;

import java.util.Scanner;

public class Inversion {
    public static void main(String[] args) throws Exception {
 Scanner sc= new Scanner(System.in);
        int a,b,temp;

        System.out.println("Veuillez saisir un nombre entier pour la valeur de a :");
        a= sc.nextInt();
        System.out.println("Veuillez saisir un nombre entier pour la valeur de b :");
        b=sc.nextInt();

        System.out.println("La valeur de a est : " +a + "\nLa valeur de b est : " +b);

        //inversion des valeurs

        temp= a;
        a=b;
        b=temp;

        System.out.println("Après inversion la nouvelle valeur de a est :"+ a + "\nLa nouvelle valeur  de b est :" +b);
        sc.close();

    }
}
