package cours_Franck.Objets;

import java.util.Scanner;

class AppPoint {

    public double x; //abscisse
    public double y; //ordonnees
   

    AppPoint(double x,double y){
        this.x= x;
        this.y= y;

    }
    public class TP_Point {
    
    public static void main(String[] args) {
        Scanner clavier= new Scanner(System.in);
        AppPoint point= new AppPoint(clavier.nextDouble(),clavier.nextDouble());

        clavier.close();
    }
}
}