import java.util.Scanner;

public class exo14_cor {

    public static void main(String[] args) {
        
        boolean A;
        boolean B;
        boolean C;
        boolean resultat;

        Scanner clavier = new Scanner(System.in);

        System.out.println("Donner une valeur a A ou B  et non(C) ");

        System.out.print("A= "); A  =clavier.nextBoolean();
        System.out.print("B= ");B = clavier.nextBoolean();
        System.out.print("C= ");C = clavier.nextBoolean();

    resultat = A || B && !C;
    System.out.println("Le resultat est : "+resultat);
    
clavier.close();
}
    
}
