package essai;

import java.util.Scanner;

public class Exo01 {
    public static void main(String[] args) {
        System.out.print("Entrz un nombre : ");
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
    String[] tableau=new String[7];
    tableau[0]="\u001B[30mGris\u001B[0m";
    tableau[1]="\u001B[31mRouge\u001B[0m";
    tableau[2]="\u001B[32mVert\u001B[0m";
    tableau[3]="\u001B[33mJaune\u001B[0m";
    tableau[4]="\u001B[34mBleu\u001B[0m";
    tableau[5]="\u001B[35mViolet\u001B[0m";
    tableau[6]="\u001B[36mBleu clair\u001B[0m";

    

    
    for (String couleur : tableau) {
        System.out.print(couleur+"\t");
    }System.out.println();

    String[] tableau1=new String[]{"\u001B[30mGris\u001B[0m","\u001B[31mRouge\u001B[0m","\u001B[32mVert\u001B[0m","\u001B[33mJaune\u001B[0m","\u001B[34mBleu\u001B[0m","\u001B[35mViolet\u001B[0m","\u001B[36mBleu clair\u001B[0m"};

    for (String couleur1 : tableau1) {
        System.out.println(couleur1);
    }

  clavier.close();  
}
    
}
