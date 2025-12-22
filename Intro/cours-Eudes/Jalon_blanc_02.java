import java.util.Scanner;

public class Jalon_blanc_02 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int bouteille=100;
        
       System.out.printf("Vous avez \u001B[33m %d \u001B[0m cl dans votre bouteille,\n ",bouteille);
        while (bouteille>0){
       
        System.out.println("Combien de centilitre voulez vous boire ? \n");
        int bu=clavier.nextInt();

        if (bu<=bouteille) { bouteille-=bu;
        }else{System.out.println("Vous ne pouvez pas boire plus de ce qu'il reste dans la bouteille");}

        if (bouteille>0) {
            System.out.printf("Il reste encore\u001B[32m %d \u001B[0m cl dans la bouteille.\n",bouteille);  
        }else{
            System.out.println("Vous avez tous bu,\n\u001B[31mLa bouteille est vide.\u001B[0m");
        }
        
         }
clavier.close();

    }
}