import java.util.Arrays;

public class Banque {
    private int nbComptes;
    private Compte[] lesComptes;
    private String nomBanque;

    public Banque(String _nomBanque) {
        this.lesComptes = new Compte[20];
        this.nbComptes = 0;
        this.nomBanque = _nomBanque;
    }

    public void ajouteCompte(Compte _unCompte) {
        if (nbComptes < lesComptes.length) {
            lesComptes[nbComptes] = _unCompte;
            nbComptes++;
        }
    }

    public void init() {
        Compte c1 = new Compte("toto", 1000, -500);
        Compte c2 = new Compte("titi", 20000, -1000);
        Compte c3 = new Compte("dupond", 1500, -1500);
        Compte c4 = new Compte("durand", 1200, -500);
        Compte c5 = new Compte("dubois", -200, -500);
        Compte c6 = new Compte("duval", 750, -2000);
        this.ajouteCompte(c1);
        this.ajouteCompte(c2);
        this.ajouteCompte(c3);
        this.ajouteCompte(c4);
        this.ajouteCompte(c5);
        this.ajouteCompte(c6);
    }

    public String toString() {
        String resultat = "Liste des comptes :\n";
        for (int i = 0; i < nbComptes; i++) {
            resultat += lesComptes[i].toString() + "\n";
        }
        return resultat;
    }

    public void ajouterNouveauCompte(String _nom, double _solde, double _decouvert) {
Compte monCompte=new Compte(_nom, _solde, _decouvert);
        this.ajouteCompte(monCompte);
    }

    public Compte compteSup() {
        Compte max = lesComptes[0];
        for (int i = 1; i < nbComptes; i++) {
            if (lesComptes[i].getsolde() > max.getsolde()) {
                max = lesComptes[i];
            }
        }
        return max;
    }

    public void triComptes() {

        boolean permut;
        do {
            permut = false;
            for (int i = 0; i < nbComptes - 1; i++) {

                if (lesComptes[i].getsolde() < lesComptes[i + 1].getsolde()) {
                    Compte temp = lesComptes[i];
                    lesComptes[i] = lesComptes[i + 1];
                    lesComptes[i + 1] = temp;

                    permut = true;
                }
            }
        } while (permut);
    }

    public Compte rendCompte(int _numero) {
        for (int i = 0; i < nbComptes; i++) {
            if (lesComptes[i].getnumero() == _numero) {
                return lesComptes[i];
            }
        }
        return null;
    }
    public boolean transferCompte(int _numero,int _autrenNum, double _montant){
       Compte source=this.rendCompte(_numero);
        Compte desti=this.rendCompte(_autrenNum);
        if (source!=null&&desti!=null) {
            if(source.transferer(_montant, desti)){
                return true;
            }
        }
        return false;
        

}
}