package exo;

import java.util.Scanner;


public class exo06_cor {

    public static void main(String[] args) {
        
Scanner clavier = new Scanner(System.in);

String nom;
int age;
String dynamique;

System.out.println("Quel est votre nom ?");
nom = clavier.next();
System.out.println("Quel est votre age ?");
age = clavier.nextInt();

dynamique = "Bonjour je m'appel "+nom+" ,et j'ai  "+age+" ans";
System.out.println(dynamique);
clavier.close();
    }
    
}
