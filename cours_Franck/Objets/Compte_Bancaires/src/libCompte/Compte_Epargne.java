package libCompte;

 public class Compte_Epargne extends Compte{
    private double tauxInteret;
    private int quinzaine;

    public Compte_Epargne(int _num,String _nom, double _solde,double _taux, int _quinzaine ){
        super(_num,_nom,_solde);
        this.tauxInteret=_taux;
        this.quinzaine=_quinzaine;
        
    }
    public double getTauxInteret(){
        return tauxInteret;
    }
    public void setTauxInteret(double _newVal){
        this.tauxInteret=_newVal;
    }
    public int getQuinzaine(){
        return quinzaine;
    }
    public void setQuinzaine(int _newVal){
        this.quinzaine=_newVal;
    }


        
    
    public double livretA(int _nbQuinzaine){
		double interet=(getsolde()*0.015*_nbQuinzaine)/24;
		System.out.println(getnomProprietaire()+" : Linteret sur l'année est de : "+interet+" Euros");
		return interet;
	}
public String toString(){
 
    return "Compte de "+nomProprietaire+ " : votre solde est de "+solde+" euros et votre taux d'intéret est : "+ this.tauxInteret;
}
    


// if(Compte_Epargne instanceof Compte_Epargne);
// if(Compte_Epargne instanceof Compte);
//  if(Compte_Epargne instanceof Object);   
}