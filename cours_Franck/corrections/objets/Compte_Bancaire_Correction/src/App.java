import java.util.*;

public class App {
    public static void main(String[] args)  {
     Banque mescomptes=new Banque("paris");
     mescomptes.init();
        Scanner clavier=new Scanner(System.in);
    Compte monCompte=new Compte("totor",5000,-200);
    Compte monCompte1=new Compte("tutu", 50000, -500);
    mescomptes.ajouteCompte(monCompte);
    mescomptes.ajouteCompte(monCompte1);
    
 mescomptes.ajouterNouveauCompte("grominet", 26000, -300);
        System.out.println(mescomptes);
        mescomptes.triComptes();
         System.out.println(mescomptes);

       Compte soldeEleve=mescomptes.compteSup();
       
       System.out.println(soldeEleve);
      
System.out.println("Enter le numéro de compte :");
int numRech=clavier.nextInt();

System.out.println(mescomptes.rendCompte(numRech));

System.out.println("Indiquer le compte source à débiter  pour transfert :");
int source=clavier.nextInt();
System.out.println("Indiquer le compte destinataire pour transfert : ");
int dsetination=clavier.nextInt();
System.out.println("Indiquer le montant du transfert en euros : ");
double montantTransf=clavier.nextDouble();
mescomptes.transferCompte(source, dsetination, montantTransf);
System.out.println(mescomptes.rendCompte(source)+ "\n "+mescomptes.rendCompte(dsetination));

mescomptes.triComptes();
System.out.println(mescomptes);


        clavier.close();
    }
}
