package exo;

import java.util.Scanner;

public class exo09_cor {

    public static void main(String[] args) {
        
         String prenom,nom,email,mdp,rmdp;
         String emailc,mdpc;

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

System.out.println("Pour vous connecter, renseignez votre email");
clavier.nextLine();
emailc = clavier.nextLine();
if (emailc.equals(email)) {
    System.out.println("Entrez votre mots de passe ");
    
}
else{
    System.out.println("Retapez votre email");
}
mdpc = clavier.next();

if (mdpc.equals(mdp)) {
    System.out.println("Félicitation, vous etes connecté");
    
}
else{
    System.out.println("Mot de passe Incorrect");
}
clavier.close();


    }

} 

}
