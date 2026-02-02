package cours_Franck\corrections\objets\Compte_Bancaire_Correction;

public class Banque {
    private int nbComptes;
    private Compte[] lesComptes=new Compte[20];
    
    public Banque(){
    this.nbComptes=0;
    }

    private void ajouteCompte(Compte _unCompte){
        if (nbComptes < lesComptes.length) {
            lesComptes[nbComptes] = _unCompte;
            nbComptes++;
        }
    }

    public void init(){
        Compte c1=new Compte("toto", 1000, -500);
        Compte c2=new Compte("titi", 20000, -1000);
        Compte c3=new Compte("dupond", 1500,-1500);
        Compte c4=new Compte("durand", 1200, -500);
        Compte c5=new Compte("dubois", -200, -500);
        Compte c6=new Compte("duval", 750, -2000);
        this.ajouteCompte(c1);
        this.ajouteCompte(c2);
        this.ajouteCompte(c3);
        this.ajouteCompte(c4);
        this.ajouteCompte(c5);
        this.ajouteCompte(c6);
    }

    public String toString(){
        String resultat="Liste des comptes :\n";
        for(int i=0;i<nbComptes;i++){
            resultat+= lesComptes[i].toString()+"\n"
        }
        return resultat;
    }



}
