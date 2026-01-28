import java.util.Scanner;

import libCompte.Compte;
import libCompte.Compte_Epargne;

public class App {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
 double taux=1.5;
        double monSolde  ;
        double monDecouvert ;
        String monNom ;
        int monID ;
         double monSolde1 ;
        double monDecouvert1;
        String monNom1 ;
        int monID1 ;
        
System.out.println("Création de compte\nEnter ID du client, sont solde et sont découvert autorisé, son nom : ");
        Compte monCompte = new Compte(monID=clavier.nextInt(), monSolde=clavier.nextDouble(), monDecouvert=clavier.nextDouble(), monNom=clavier.next());
        clavier.hasNextLine();
        System.out.println(monCompte);

        System.out.println("Creation du compte épargne livret A\nIndiquer son ID, son solde et son nom :");
        Compte_Epargne monCompte1=new Compte_Epargne(monID1=clavier.nextInt(), monSolde1=clavier.nextDouble(),taux, monNom1=clavier.next());
        clavier.nextLine();
        System.out.println(monCompte1);

        System.out.println("Pour le compte de "+monNom+" indiquer la somme que vous voulez créditer : ");
        double remplirCompte = clavier.nextDouble();
        monCompte.crediter(remplirCompte);
        System.out.println(monCompte);

        System.out.println("Pour le compte de "+monNom1+" indiquer la somme que vous voulez créditer : ");
        double remplirCompte1 = clavier.nextDouble();
        monCompte1.crediter(remplirCompte1);
        System.out.println(monCompte1);

        System.out.println("pour le compte de "+monNom+" Indiquer le montant à retirer :");
        double retrait=clavier.nextDouble();
        monCompte.debiter(retrait);
        System.out.println(monCompte);

         System.out.println("pour le compte de "+monNom1+" Indiquer le montant à retirer :");
        double retrait1=clavier.nextDouble();
        monCompte1.debiter(retrait1);
        System.out.println(monCompte1);

        System.out.println("Indiquer le montant que vous voulez transferer :");
        double montantTransfert=clavier.nextDouble();

        monCompte.transfert(monCompte1, montantTransfert);
        System.out.println(monCompte+"\n"+monCompte1);

         monCompte.compare(monCompte1);
          monCompte=new Compte_Epargne(monID, monSolde,taux, monNom);

        //  monCompte.livretA(6);
         monCompte1.livretA(18);
        clavier.close();
    }
}
