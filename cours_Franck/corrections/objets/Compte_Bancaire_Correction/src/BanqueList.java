import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BanqueList {
    private String nomBanque;

    // collection d'objet(tableau dynamique);

    // "LinkedList"
    // meilleur pour accès en écriture sur un gros volume d'objet.
    // Inserez des données en milieu de liste. Accepte les cases null et les
    // doublons.
   //private List lesComptes2 = new LinkedList();

    // "ArrayList"
    // meillieure pour l'accès en lecture d'un grand nombre d'objet .get(int _index)
    ArrayList lesComptes = new ArrayList();

    public BanqueList(String _nomBanque) {

        this.nomBanque = _nomBanque;

    }

    public void init() {
        Compte c1 = new Compte("toto", 1000, -500);
        Compte c2 = new Compte("titi", 20000, -1000);
        Compte c3 = new Compte("dupond", 55000, -1500);
        Compte c4 = new Compte("durand", 1200, -500);
        Compte c5 = new Compte("dubois", -200, -500);
        Compte c6 = new Compte("duval", 750, -2000);
        CompteEpargne c7 = new CompteEpargne("Lucie", 25000, 0, 0.015);
        lesComptes.add(c1);
        lesComptes.add(c2);
        lesComptes.add(c3);
        lesComptes.add(c4);
        lesComptes.add(c5);
        lesComptes.add(c6);
        lesComptes.add(c7);
    }

    public void afficherComptes() {
        for (int i = 0; i < lesComptes.size(); i++) {
            System.out.println(lesComptes.get(i));
        }
    }

    public void ajouterNouveauCompte(String _nom, double _solde, double _decouvert) {
        Compte monCompte = new Compte(_nom, _solde, _decouvert);
        this.lesComptes.add(monCompte);
    }

    public void ajouterNouveauCompte(Compte _unCompte){
        this.lesComptes.add(_unCompte);
    }
    public Compte rechercheCompteMax() {
        Compte compteMax = (Compte) lesComptes.get(0);
        for (int i = 1; i < lesComptes.size(); i++) {
            if (((Compte) lesComptes.get(i)).getsolde() > ((compteMax).getsolde())) {
                compteMax = (Compte) (lesComptes.get(i));
            }
        }
        return compteMax;
    }
    public List<Compte> rechercheComptesMax() {
    List<Compte> comptesMax = new ArrayList<>();
    
    if (lesComptes.isEmpty()) {
        return comptesMax;
    }

    // On initialise avec le premier compte
    double soldeMax = ((Compte) lesComptes.get(0)).getsolde();
    comptesMax.add((Compte) lesComptes.get(0));

    for (int i = 1; i < lesComptes.size(); i++) {
        Compte c = (Compte) lesComptes.get(i);
        double soldeCourant = c.getsolde();

        if (soldeCourant > soldeMax) {
            // Nouveau record : on vide tout et on recommence la liste
            soldeMax = soldeCourant;
            comptesMax.clear();
            comptesMax.add(c);
        } else if (soldeCourant == soldeMax) {
            // Ex-æquo : on ajoute à la liste existante
            comptesMax.add(c);
        }
    }
    
    return comptesMax;
}

    public Compte rechercheCompte(int _numero, int _tabPosition[]) {
        for (Object object : lesComptes) {
            if (_numero == ((Compte) object).getnumero()) {
                _tabPosition[0] = lesComptes.indexOf(object) + 1;
                return (Compte) object;
            }
        }
        return null;
    }

    public Compte rechercheCompte(int _numero) {
        for (Object object : lesComptes) {
            if (_numero == ((Compte) object).getnumero()) {

                return (Compte) object;
            }
        }
        return null;
    }

    public boolean transferCompte(int _numero, int _autrenNum, double _montant) {
        Compte source = this.rechercheCompte(_numero);
        Compte desti = this.rechercheCompte(_autrenNum);
        if (source != null && desti != null) {
            return source.transferer(_montant, desti);

        }
        return false;

    }

}