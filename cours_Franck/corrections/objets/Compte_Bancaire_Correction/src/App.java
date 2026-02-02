import java.util.*;

public class App {
    public static void main(String[] args)  {
     
        Scanner clavier=new Scanner(System.in);
    Compte monCompte=new Compte("toto",5000,-200);
    System.out.println(monCompte);
        
        clavier.close();
    }
}
