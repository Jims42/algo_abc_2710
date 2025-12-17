import java.util.Scanner;

public class Jalon_blanc_02 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int bouteille=100;
        int bu;
        int reste=0;

        System.out.println("Vous avez \u001B[31m"+reste+"\u001B[0m cl dans votre bouteille,\n Combien de centilitre voulez vous boire ? ");
        bu=clavier.nextInt();

        reste=bouteille-bu;


    }
}
