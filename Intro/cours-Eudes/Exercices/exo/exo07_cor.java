
import java.util.Scanner;

public class exo07_cor {

    public static void main(String[] args) {
        
        String choix;
       boolean reponse;

        Scanner clavier = new Scanner(System.in);

        System.out.println("Do you speak English ?");
            System.out.println("Repondre par Y ou N " );
choix=clavier.next().toUpperCase(); 
if (choix.equals("Y")) {reponse=true;
System.out.println("nice to meet you");
}else if (choix.equals("N")) {reponse=false;
System.out.println("go learn english !");

}else{System.out.println("Mauvais choix");}
   clavier.close(); 
    }
 }
    

