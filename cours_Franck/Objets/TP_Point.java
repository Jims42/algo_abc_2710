package cours_Franck.Objets;

import java.util.Scanner;

class Point {

    private double x; // abscisse
    private double y; // ordonnees
    private String lettre;

    public Point(String _lettre, double _x, double _y) {
        this.x = _x;
        this.y = _y;
        this.lettre = _lettre;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
        this.lettre = "";
    }

    public String toString() {
        return this.lettre + "(" + this.x + ", " + this.y + ")";
    }

    public void seDeeplacer(double _newX, double _newY) {
        this.x += _newX;
        this.y += _newY;
    }

    public void afficher() {
        System.out.println(this);
    }

    public Point symAbscisse() {
        return new Point(this.lettre, this.x, -this.y);
    }

    public Point symOrdonnees() {
        return new Point(this.lettre, -this.x, this.y);
    }

    public Point symOrigine() {
        return new Point(this.lettre, -this.x, -this.y);
    }

    public void permuter() {
        double temp = this.x;
        this.x = this.y;
        this.y = temp;

    }

    public double distancePoint(Point _autrePoint) {
        double distPoint = Math
                .sqrt((Math.pow(this.x - _autrePoint.getx(), 2)) + (Math.pow(this.y - _autrePoint.gety(), 2)));
        return distPoint;
    }

    // Point A(5, 2);
    // Point B(8, 9);
    // A.distancePoint(B)
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

    public static String triResultat(Point _let1, Point _let2, Point _coord1, Point _coord2, Point _absc1, Point _absc2,
            Point _ord1, Point _ord2, Point _orig1, Point _orig2, double _dist) {
        String chaineresult = "------------------------------------------------------------------------------------------\n|\t\t\t |\t référence point \t |\t référence point \t |\n------------------------------------------------------------------------------------------\n";
        chaineresult += "| Defaut\t\t |\t" + _let1 + " \t\t |\t " + _let2 + " \t\t |\n";
        chaineresult += "| Nouvelle position \t | \t " + _coord1 + " \t\t | \t " + _coord2 + " \t\t |\n";
        chaineresult += "| abscisse \t\t | \t" + _absc1 + " \t\t | \t " + _absc2 + " \t\t |\n";
        chaineresult += "| ordonnées \t\t | \t" + _ord1 + " \t\t | \t " + _ord2 + " \t\t |\n";
        chaineresult += "| origine \t\t | \t" + _orig1 + " \t\t | \t " + _orig2 + " \t\t |\n";
        chaineresult += "------------------------------------------------------------------------------------------\n| distance entre point \t |\t\t "
                + _dist + " \t\t\t\t |\n" + //
                "------------------------------------------------------------------------------------------";
        return chaineresult;
    }

}
// class lettre{
// private char lettre;

// public lettre(char _lettre){
// this.lettre=_lettre;
// }
// public char getLettre(char _nLet){
// this.lettre=_nLet;
// return _nLet;
// }
// }

public class TP_Point {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        Point defautA = new Point();
        System.out.println("Point de coordonnées par default : " + defautA.toString());
        defautA.seDeeplacer(6, 2);
        System.out.println("Position après déplacement ==> " + defautA);

        Point defautB = new Point();
        System.out.println("Point de coordonnées par default : " + defautB.toString());
        defautB.seDeeplacer(3, 10);
        System.out.println("Position après déplacement ==> " + defautB);

        System.out.println("Entrer l'abscisse et l'ordonnées de A : ");
        Point coord1 = new Point(clavier.nextLine(), clavier.nextDouble(), clavier.nextDouble());
        System.out.println("Point de coordonnées : " + coord1);
        clavier.nextLine();

        System.out.println("Entrer l'abscisse et l'ordonnées de B : ");
        Point coord2 = new Point(clavier.nextLine(), clavier.nextDouble(), clavier.nextDouble());
        System.out.println("Point de coordonnées : " + coord2);
        clavier.nextLine();

        Point symAbscisse1 = coord1.symAbscisse();
        System.out.println("Symétrique par rapport à l'axe des abscisses est ==> " + symAbscisse1.toString());
        Point symAbscisse2 = coord2.symAbscisse();
        System.out.println("Symétrique par rapport à l'axe des abscisses est ==> " + symAbscisse2.toString());

        Point symOrdonnees1 = coord1.symOrdonnees();
        System.out.println("Symétrique par rapport à l'axe des ordonnées est ==> " + symOrdonnees1.toString());
        Point symOrdonnees2 = coord2.symOrdonnees();
        System.out.println("Symétrique par rapport à l'axe des ordonnées est ==> " + symOrdonnees2.toString());

        Point symOrigine1 = coord1.symOrigine();
        System.out.println("Symétrique par rapport à l'origine est ==> " + symOrigine1.toString());
        Point symOrigine2 = coord2.symOrigine();
        System.out.println("Symétrique par rapport à l'origine est ==> " + symOrigine2.toString());

        // coord1.permuter();
        // System.out.println("Après permutation des coordonnées, les nouvelles
        // coordonnées sont ==> " + coord1.toString());

        // coord2.permuter();
        // System.out.println("Après permutation des coordonnées, les nouvelles
        // coordonnées sont ==> " + coord2P.toString());

        defautA.afficher();
        defautB.afficher();
        double resultat = coord1.distancePoint(coord2);
        System.out.println(
                "La distance entre la point : " + coord1 + " et le point : " + coord2 + " est ==> " + resultat);

        System.out.println("le resultat avec tableau :\n" + Point.triResultat(defautA, defautB, coord1, coord2,
                symAbscisse1, symAbscisse2, symOrdonnees1, symOrdonnees2, symOrigine1, symOrigine2, resultat));

        clavier.close();
    }
}
