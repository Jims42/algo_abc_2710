package cours_Franck.Objets;

import java.util.Scanner;

class Point {

    private double x; // abscisse
    private double y; // ordonnees

    public Point(double _x, double _y) {
        this.x = _x;
        this.y = _y;

    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public void seDeeplacer(double _newX, double _newY) {
        this.x = _newX;
        this.y = _newY;
    }

    public void afficher() {
        System.out.println(this);
    }

    public Point symAbscisse() {
        return new Point(this.x, -this.y);
    }

    public Point symOrdonnees() {
        return new Point(-this.x, this.y);
    }

    public Point symOrigine() {
        return new Point(-this.x, -this.y);
    }

    public void permuter() {
        double temp = this.x;
        this.x = this.y;
        this.y = temp;

    }

    public double getx() {
        return x;
    }

    public double gety() {
        return y;
    }

    public void setX(double _newVal) {
        this.x = _newVal;
    }

    public void setY(double _newVal) {
        this.y = _newVal;
    }

}

public class TP_Point {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        Point defaut = new Point();
        System.out.println("Point de coordonnées par default : " + defaut.toString());
        defaut.seDeeplacer(45, 21);
        System.out.println("Position après déplacement ==> " + defaut);

        System.out.println("Entrer l'abscisse et l'ordonnées : ");

        Point coord1 = new Point(clavier.nextDouble(), clavier.nextDouble());

        System.out.println("Point de coordonnées : " + coord1);

        Point symAbscisse = coord1.symAbscisse();
        System.out.println("Symétrique par rapport à l'axe des abscisses est ==> " + symAbscisse.toString());

        Point symOrdonnees = coord1.symOrdonnees();
        System.out.println("Symétrique par rapport à l'axe des ordonnées est ==> " + symOrdonnees.toString());

        Point symOrigine = coord1.symOrigine();
        System.out.println("Symétrique par rapport à l'origine est ==> " + symOrigine.toString());

        coord1.permuter();
        System.out
                .println("Après permutation des coordonnées, les nouvelles coordonnées sont ==> " + coord1.toString());

        defaut.afficher();

        clavier.close();
    }
}
