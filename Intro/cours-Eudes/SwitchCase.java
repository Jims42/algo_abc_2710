import java.util.Scanner;

/*  Voici comment marche le switch */

public class SwitchCase {

    public static void main(String[] args) {


         Scanner clavier = new Scanner(System.in); //* Initialsiation du scanner */

        int age;

        System.out.println("Donnez votre âge :");

        age = clavier.nextInt();

        switch(age){ /* On initialise le switch avec la variable age , on va tester si age à les valeurs suivantes */
            /* En fonction des valeurs le message change */
            case 2:
                System.out.println("Vous êtes un bébé");
                break;

            case 5:
                System.out.println("Vous êtes un enfant");
                break;
            case 8:
                 System.out.println("Vous êtes un pré-ados");
                break;
            case 13:
                 System.out.println("Vous êtes un Adolescents");
                break;
            case 21 :
                 System.out.println("Vous êtes un jeune Adulte");
                break;
            case 25 :
                 System.out.println("Vous êtes un adulte");
                break;
            case 40 :
                 System.out.println("Vous êtes un adulte mure");
                break;
            case 60 :
                 System.out.println("Vous êtes un senior");
                break;
            default:
                System.out.println("Age inconnu");

        }


        clavier.close();
        

    }
    
}
