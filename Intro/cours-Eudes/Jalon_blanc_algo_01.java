import java.util.Scanner;

public class Jalon_blanc_algo_01 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Entrez la valeur de A = ");
        a=clavier.nextInt();
        System.out.println("Entrez la valeur de B = ");
        b=clavier.nextInt();

        if (a!=b) {System.out.printf("Après comparaison \u001B[4;32m%d\u001B[4;0m et \u001B[4;32m%d\u001B[4;0m ne sont pas egaux",a,b);
                    
        }else{System.out.printf("Après comparaison \u001B[4;32m%d\u001B[4;0m et \u001B[4;32m%d\u001B[4;0m sont egaux",a,b);}
        clavier.close();
    }
}
