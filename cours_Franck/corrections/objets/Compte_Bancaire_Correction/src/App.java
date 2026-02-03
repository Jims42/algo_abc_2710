import java.util.*;

public class App {
    public static void main(String[] args)  {
     Banque mescomptes=new Banque();
     mescomptes.init();
        Scanner clavier=new Scanner(System.in);
    Compte monCompte=new Compte("totor",5000,-200);
    mescomptes.ajouteCompte(monCompte);
    

        System.out.println(mescomptes);
        clavier.close();
    }
}
