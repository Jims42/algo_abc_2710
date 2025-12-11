import java.util.Scanner;
public class exo04_bis {

    public static void main(String[] args) {
        
        int a=0;

        Scanner clavier = new Scanner(System.in);
        while (a%2==0) {
            
        System.out.print("A = ");a=clavier.nextInt();

        if (a%2==0) {System.out.println("a est divisible par 2");System.out.println("Continuez ");}
        
        else{System.out.println("A n'est pas divisible par 2");System.out.println("Au revoir !!!");;break;}
        }
            clavier.close();
    }
    
}
