package exo;

import java.util.Scanner;


public class exo08_cor {

    public static void main(String[] args) {
        
        String prenom,nom,email,mdp,rmdp;

        Scanner clavier = new Scanner(System.in);

        System.out.println("Indiquez votre prenom");
        prenom = clavier.next();
        System.out.println("Indiquez votre Nom");
        nom = clavier.next();
        System.out.println("indiquez votre email");
        email = clavier.next();
        System.out.println("Nouveau Mot de passe");
        mdp = clavier.next();
        System.out.println("Confirmez Mot de passe");
      rmdp = clavier.next();

        if (!mdp.equals(rmdp)) {
            

            System.out.println("Inscription annulé !!!");
                }
                else{
                    System.out.println("Merci "+nom+prenom+", votre inscription a été effectuee, vous allez recevoir un email de confirmation à l'adresse email: "+email);

                    clavier.close();
                }
                

    }
    
}
