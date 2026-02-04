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
    

        System.out.println(mescomptes);
        mescomptes.triComptes();
         System.out.println(mescomptes);

       Compte soldeEleve=mescomptes.compteSup();
       
       System.out.println(soldeEleve);



        clavier.close();
    }
}
