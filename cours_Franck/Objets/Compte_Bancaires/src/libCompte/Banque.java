package libCompte;

import java.util.ArrayList;

public class Banque {
    private ArrayList<Compte> mesComptes= new ArrayList<>();

    public void addCompte(Compte _Compte){
        mesComptes.add(_Compte);
    }
    public void addCompte(int _numeroUnique,String _nomProp, double _solde, double _decouvertAutorise){
        Compte resultat=new Compte(_numeroUnique, _solde, _decouvertAutorise, _nomProp);
        mesComptes.add(resultat);
    }
    public String toString(){
        String resultat="\u001B[30m---------------------------------------------------------------------------------------------------\u001B[0m\n\t\t\t\t\u001B[41mListe des comptes :\u001b[0m\n";
    
        for (Compte compte : mesComptes) {
            resultat+=compte.toString();
          }
          resultat += "\u001B[30m---------------------------------------------------------------------------------------------------\u001B[0m\n";
        return resultat;
    }

}
