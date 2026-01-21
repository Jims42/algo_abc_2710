import java.util.Scanner;
public class Exo02_1 {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);

        int age;

        System.out.println("Indiquer votre age : ");age=clavier.nextInt();

        if (age<=0) {System.out.println("Vous n'etes pas encore né ");}
        else if (age<18) {System.out.println("Vous etes mineur ");         
        }else{System.out.println("Vous etes majeur ");}
        clavier.close();

    }
    
}
