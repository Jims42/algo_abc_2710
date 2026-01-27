import java.util.Scanner;

import libCompte.Compte;

public class App {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        double monSolde = 2500;
        double monDecouvert = 500;
        String monNom = "Jean";
        int monID = 123456;
         double monSolde1 = 500;
        double monDecouvert1 = 100;
        String monNom1 = "Lucie";
        int monID1 = 123457;

        Compte monCompte = new Compte(monID, monNom, monSolde, monDecouvert);
        System.out.println(monCompte);
        Compte monCompte1=new Compte(monID1, monNom1, monSolde1, monDecouvert1);
        System.out.println(monCompte1);

        System.out.println("indiquer la somme que vous voulez créditer : ");
        double remplirCompte = clavier.nextDouble();

        monCompte.crediter(remplirCompte);
        System.out.println(monCompte);

        System.out.println("Indiquer le montant à retirer :");
        double retrait=clavier.nextDouble();

        monCompte.debiter(retrait);
        System.out.println(monCompte);

        System.out.println("Indiquer le montant que vous voulez transferer :");
        double montantTransfert=clavier.nextDouble();

        monCompte.transfert(monCompte1, montantTransfert);
        System.out.println(monCompte+"\n"+monCompte1);

         monCompte.compare(monCompte1);
         monCompte.livretA(6);
         monCompte1.livretA(18);
        clavier.close();
    }
}
