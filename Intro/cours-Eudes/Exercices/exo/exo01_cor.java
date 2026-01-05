
 import java.util.Scanner;

public class exo01_cor {

    public static void main(String[] args) {
        


        int a;
        int b;
        int addition;

        Scanner clavier = new Scanner(System.in);

        System.out.println("la valeur de a");
        a = clavier.nextInt();
        System.out.println("la valeur de b");
        b = clavier.nextInt();

        addition = a+b;

        System.out.println("a+b= "+addition);

        clavier.close();



    }
    

}
