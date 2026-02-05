package libCompte;

import java.util.ArrayList;

public class Compte_Epargne extends Compte{
    private double tauxInteret;
    
    // private ArrayList<Double> soldesQuinzaine;

    public Compte_Epargne(int _num, double _solde,double _taux,String _nom){
        super(_num,_solde,_nom);
        this.tauxInteret=_taux;
        // this.soldesQuinzaine=new ArrayList<>();
        // this.soldesQuinzaine.add(_solde);
       
        
    }
    // public void enregistreFinQuinzaine(){
    //     if (soldesQuinzaine.size()<24) {
    //         soldesQuinzaine.add(this.getsolde());
    //     }else{
    //         System.out.println("L'année est complète !");
    //     }
    // }
    //     public double calculInteretAnnuel(){
    //         double sommeInteret=0;
    //         for (Double soldeMoment : soldesQuinzaine) {
    //             sommeInteret+=(soldeMoment*(tauxInteret/100))/24;
    //         }
    //         return sommeInteret;
    //     }
    
    public double getTauxInteret(){
        return tauxInteret;
    }
    public void setTauxInteret(double _newVal){
        this.tauxInteret=_newVal;
    }
    


        
    
    public double livretA(int _nbQuinzaine){
		double interet=(getsolde()*0.015*_nbQuinzaine)/24;
		System.out.println(getnomProprietaire()+" : Linteret sur l'année est de : "+interet+" Euros");
		return interet;
	}
public String toString(){
 
    return "\u001B[45mCompte Epargne\u001B[0m \u001B[35m||\u001B[0m ID: \u001B[36m" + getnumeroUnique() + "\u001B[0m \u001B[35m||\u001B[0m Nom: \u001B[34m" + nomProprietaire + "\u001B[0m \u001B[35m||\u001B[0m Solde: \u001B[32m" + solde + "\u001B[0m euros (Découvert: \u001B[31m" + tauxInteret + "\u001B[0m %)\n";
}
    


// if(Compte_Epargne instanceof Compte_Epargne);
// if(Compte_Epargne instanceof Compte);
//  if(Compte_Epargne instanceof Object);   
}