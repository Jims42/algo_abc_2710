import boundary.Ecran;
import models.Fraction;

public class App {
    public static void main(String[] args) throws Exception {
        Fraction f=new Fraction(12, 5);
        Fraction f1=new Fraction();
        Fraction f2=new Fraction(9);

        Ecran.affiche(f);
        Ecran.affiche(f1);
        Ecran.affiche(f2);

        f.oppose();
        Ecran.affiche(f);
        f.inverse();
        Ecran.affiche(f);
    }
}
