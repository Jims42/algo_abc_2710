import java.util.Scanner;

public class exo13_cor {

    public static void main(String[] args) {
        
        int cm ;
        double m ;

        Scanner clavier = new Scanner(System.in);
        
        

        System.out.println("Donner une taille en centimètre ? ");
        cm = clavier.nextInt();
        m = cm / 100.0;

        System.out.println(cm+" cm vaut "+m+" mètres");

clavier.close();

    }

    
}
