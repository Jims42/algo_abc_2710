package exo;

import java.util.Scanner;


public class exo04_cor {

    
    public static void main(String[] args) {

         Scanner clavier = new Scanner(System.in);
        
        int a;
        int b;
        int addition;

        System.out.println("valeur de a");

        a = clavier.nextInt();

        System.out.println("valeur de b");

        b = clavier.nextInt();

        addition = a + b ;

        System.out.println("resultat a+b="+addition);

        if (addition%2==0) {

            System.out.println(addition +" la valeur est divible par 2");

            }else{

                System.out.println(addition+" la valeur n'est pas divisible par 2");

                clavier.close();

            }



    }
}
