package Exercice_Inter;

import java.util.Scanner;

public class LePendu {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String mot="";
        while (mot.length()<= 5) {
            System.out.println("Entrer un mot de plus de 5 caractère");
            mot=clavier.nextLine();

            if (mot.length()<=5) {
             System.out.println("Mot trop court ! recommencer \n ");   
            }
        }
        mot=mot.toUpperCase();
        System.out.println(mot);
        

        clavier.close();
    }
}
