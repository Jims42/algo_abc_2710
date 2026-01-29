import java.util.Scanner;

import libCompte.Compte;
import libCompte.Compte_Epargne;

public class App {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        double taux = 1.5;
        double monSolde, monSolde1;
        double monDecouvert, monDecouvert1;
        String monNom, monNom1;
        int monID, monID1;
        int chosirTransfert=0;

        System.out.println("Création de compte\nEnter ID du client, sont solde et sont découvert autorisé, son nom : ");
        Compte monCompte = new Compte(monID = clavier.nextInt(), monSolde = clavier.nextDouble(),
                monDecouvert = clavier.nextDouble(), monNom = clavier.next());
        clavier.hasNextLine();
        System.out.println(monCompte);

        System.out.println("Creation du compte épargne livret A\nIndiquer son ID, son solde et son nom :");
        Compte_Epargne monCompte1 = new Compte_Epargne(monID1 = clavier.nextInt(), monSolde1 = clavier.nextDouble(),
                taux, monNom1 = clavier.next());
        clavier.nextLine();
        System.out.println(monCompte1);

        System.out.println("Pour le compte de " + monNom + " indiquer la somme que vous voulez créditer : ");
        double remplirCompte = clavier.nextDouble();
        monCompte.crediter(remplirCompte);
        System.out.println(monCompte);

        System.out.println("Pour le compte de " + monNom1 + " indiquer la somme que vous voulez créditer : ");
        double remplirCompte1 = clavier.nextDouble();
        monCompte1.crediter(remplirCompte1);
        System.out.println(monCompte1);

        System.out.println("pour le compte de " + monNom + " Indiquer le montant à retirer :");
        double retrait = clavier.nextDouble();
        monCompte.debiter(retrait);
        System.out.println(monCompte);

        System.out.println("pour le compte de " + monNom1 + " Indiquer le montant à retirer :");
        double retrait1 = clavier.nextDouble();
        clavier.nextLine();
        monCompte1.debiter(retrait1);
        System.out.println(monCompte1);

        double montantTransfert;
        String reponse, reponse1;

        System.out.println("Veuiller saisir le nom du titulaire de compte que vous voulez débiter :");
        reponse = clavier.nextLine();
        System.out.println("veuiller saisir le nom du titulaire de compte que vous voulez créditer : ");
        reponse1 = clavier.nextLine();

        if (reponse.equals(monNom) && reponse1.equals(monNom1)) {
            chosirTransfert = 1;
        }
        if (reponse.equals(monNom1) && reponse1.equals(monNom)) {
            chosirTransfert = 2;
        }
        switch (chosirTransfert) {

            case 1:
                System.out.println("Indiquer le montant que vous voulez transferer :");
                montantTransfert = clavier.nextDouble();

                (monCompte).transfert(monCompte1, montantTransfert);
                System.out.println(monCompte + "\n" + monCompte1);
                break;
            case 2:
                System.out.println("Indiquer le montant que vous voulez transferer :");
                montantTransfert = clavier.nextDouble();

                (monCompte1).transfert(monCompte, montantTransfert);
                System.out.println(monCompte1 + "\n" + monCompte);
            default:
                System.out.println("Personne inconnu de nos registres");
                break;
        }

        monCompte.compare(monCompte1);
        monCompte = new Compte_Epargne(monID, monSolde, taux, monNom);

        // monCompte.livretA(6);
        monCompte1.livretA(18);
        clavier.close();
    }
}
