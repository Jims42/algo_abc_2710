package libVoiture;


public class Moteur {

	private String marqueMoteur;
	private double vitesseTheorique;

	public Moteur(){

	}
	public Moteur(String _marqueMoteur, double _vitesseMaxTheorique){
this.marqueMoteur=_marqueMoteur;
this.vitesseTheorique=_vitesseMaxTheorique;
	}

	public String getMarqueMoteur(){
		return this.marqueMoteur;
	}
	public double getVitesseTheorique(){
		return this.vitesseTheorique;
	}

	
	public void setVitesseTheorique(double _newVal){
this.vitesseTheorique=_newVal;
	}

	public void setMarqueMoteur(String _newVal){
this.marqueMoteur=_newVal;
	}
	/**
	 * Affiche le moteur et ses spécification
	 * @return chaine de caractere 
	 */
@Override
	public String toString(){
		return "Moteur ==> "+this.marqueMoteur+"\nVitese Max ==> "+this.vitesseTheorique+" Km/h";
	}

	

}