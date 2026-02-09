import java.util.*;

public class App {
    public static void main(String[] args)  {
    //  Banque monCompte=new Banque("paris");
     BanqueList mesCompte=new BanqueList("LCL");
     mesCompte.init();
     mesCompte.afficherComptes();
     System.out.println("-----------------------------------------------------------------------------------");
        Scanner clavier=new Scanner(System.in);
    Compte monCompte=new Compte("totor",55000,-200);
    Compte monCompte1=new Compte("tutu", 50000, -500);
    mesCompte.ajouterNouveauCompte(monCompte1);
    mesCompte.ajouterNouveauCompte(monCompte);
    
    
 mesCompte.ajouterNouveauCompte("grominet", 26000, -300);
        System.out.println(monCompte);
        mesCompte.afficherComptes();
        System.out.println("-----------------------------------------------------------------------------------");

        mesCompte.rechercheCompteMax();
        System.out.println("\tCompte avec le solde le plus eleve\n"+mesCompte.rechercheCompteMax());

//         mesCompte.triComptes();
//          System.out.println(monCompte);

//        Compte soldeEleve=monCompte.compteSup();
       
//        System.out.println(soldeEleve);
      
// System.out.println("Enter le numéro de compte :");
// int numRech=clavier.nextInt();

// System.out.println(monCompte.rendCompte(numRech));

// System.out.println("Indiquer le compte source à débiter  pour transfert :");
// int source=clavier.nextInt();
// System.out.println("Indiquer le compte destinataire pour transfert : ");
// int dsetination=clavier.nextInt();
// System.out.println("Indiquer le montant du transfert en euros : ");
// double montantTransf=clavier.nextDouble();
// monCompte.transferCompte(source, dsetination, montantTransf);
// System.out.println(monCompte.rendCompte(source)+ "\n "+monCompte.rendCompte(dsetination));

// monCompte.triComptes();
// System.out.println(monCompte);


        clavier.close();
    }
}
