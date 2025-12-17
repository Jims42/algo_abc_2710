import java.util.Scanner;

public class Exo02_5_bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Indiquez un valeur : ");
        int nombre=clavier.nextInt();

        System.out.println("Les diviseurs de "+nombre+" (hors 1 et lui même) sont : ");

        for (int i=2; i<nombre; i++)
        {
            if (nombre % i ==0)
            {
                System.out.print(i+" ");
            }
        }
        clavier.close();
    }
}
