import java.util.Scanner;

public class exo15_cor {

    public static void main(String[] args) {
        
        String EUR;String USD;String GPD;
        String  resultat1;String resultat2;String resultat3;
        String reponse;String defaut; 
        
        


        Scanner clavier = new Scanner(System.in);
       defaut=clavier.next();
        while (defaut) {
            
        
        System.out.println("Quel est votre monaie ? ");
        reponse=clavier.next();
        if (reponse.equalsIgnoreCase("EUR")) { resultat1="Quel est votre montant ?";}
        if (reponse.equalsIgnoreCase("USD")) {resultat2="Quel est votre montant ?";}
        if (reponse.equalsIgnoreCase("GPD")) {resultat3="Quel est votre montant ?";}
        else{.equals(defaut);
            System.out.println("Veillez choisir entre: EUR ou USD ou GPD");
        }

        }




    }
    

}