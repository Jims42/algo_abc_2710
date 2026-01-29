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
        String resultat="";
    
        for (Compte compte : mesComptes) {
            resultat+=compte.toString();
          }
        return resultat;
    }

}
