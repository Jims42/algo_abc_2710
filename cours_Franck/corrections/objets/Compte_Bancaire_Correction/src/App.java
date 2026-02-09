import java.util.*;

public class App {
    public static void main(String[] args)  {
    //  Banque monCompte=new Banque("paris");
     BanqueList mesCompte=new BanqueList("LCL");
     int numCompte;
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

        mesCompte.rechercheComptesMax();
        for (int i = 0; i < args.length; i++) {
            
        }
        System.out.println("\tCompte avec le solde le plus eleve\n"+mesCompte.rechercheComptesMax());

//         mesCompte.triComptes();
//          System.out.println(monCompte);
int[] monTab={0};
//        Compte soldeEleve=monCompte.compteSup();
       System.out.println(" Veuillez rechercher saisir un numero de Compte ");
             numCompte= clavier.nextInt();
             if (mesCompte.rechercheCompte(numCompte,monTab)!=null) {
                 System.out.println("\tle compte recherche par num: \n"+  mesCompte.rechercheCompte(numCompte, monTab)+ " \n à la position : "+monTab[0] + " dans ma liste lesComptes");

             }else{

                System.out.println("Le compte n'existe pas dans notre Banque !");
             }
             
//        System.out.println(soldeEleve);
      
// System.out.println("Enter le numéro de compte :");
// int numRech=clavier.nextInt();

// System.out.println(monCompte.rendCompte(numRech));
System.out.println("-----------------------------------------------------------------------------------");
System.out.println("Indiquer le compte source à débiter  pour transfert :");
int source=clavier.nextInt();
System.out.println("Indiquer le compte destinataire pour transfert : ");
int dsetination=clavier.nextInt();
System.out.println("Indiquer le montant du transfert en euros : ");
double montantTransf=clavier.nextDouble();
mesCompte.transferCompte(source, dsetination, montantTransf);
System.out.println(mesCompte.rechercheCompte(source)+ "\n"+mesCompte.rechercheCompte(dsetination));

// monCompte.triComptes();
// System.out.println(monCompte);


        clavier.close();
    }
}
