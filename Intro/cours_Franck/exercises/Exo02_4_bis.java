import java.util.Scanner;

public class Exo02_4_bis {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);

        int a;
        int bis=0;

        System.out.print("Indiquez l'année :");a=clavier.nextInt();

        if (a%4==0) {bis=1;System.out.println("année bissextile");}
        else if (a%4!=0){System.out.println("l'année est non bissextile");}
        switch (bis) {
            case 1:
                if (a%100==0 && a%400!=0) {System.out.println("année est non bissextile");}
                else if (a%100!=0 && a%400==0) {System.out.println("année bissextile");}
                break;
        
            default:
                break;
        }

       
       
        clavier.close();


    }
}
