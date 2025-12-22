package essai;

import java.util.Scanner;

public class Exo01 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int nombre = clavier.nextInt();
        System.out.println("nombre : "+nombre);
        System.out.println("est positif ? " + (nombre > 0));
        System.out.println("est pair ? "+(nombre%2==0));
    String nombres = (nombre >= 18)?"est majeur" : "est mineur";
    System.out.println(nombres);

    int i=0;
    while (i<nombre) {
        i++;
        if (i%2==1) {
            continue;
        }
        //System.out.print(i+" ");
        System.out.println(i);
        
    }
  clavier.close();  
}
    
}
