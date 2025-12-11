import java.util.Scanner;
public class exo06_bis {
    public static void main(String[] args) {
        
        String prenom;
        String capital;
        String initial;
        int age;

        Scanner clavier = new Scanner(System.in);

        System.out.print("Prenom : ");prenom=clavier.next().substring(0, 1).toLowerCase();prenom.substring(1);

        System.out.print("Age : ");age=clavier.nextInt();
        System.out.println("Je m'appel "+prenom+", et j'ai "+age+" ans");
        clavier.close();
    }
    
}
