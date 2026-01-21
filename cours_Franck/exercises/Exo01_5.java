import java.util.Scanner;
public class Exo01_5 {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
        int a;
        int b;

        System.out.print("valeur de a : ");a=clavier.nextInt();
        System.out.print("valeur de b : ");b=clavier.nextInt();
       
        int inv =a;
        a=b;
        b=inv;

        System.out.println("la nouvelle valeur de a est \u001B[4;32m"+a+"\u001B[4;0m et la nouvelle valeur de b est \u001B[4;32m"+b+"\u001B[4;0m");
        clavier.close();
    }
    
}
