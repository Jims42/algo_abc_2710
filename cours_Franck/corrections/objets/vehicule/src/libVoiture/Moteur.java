package libVoiture;


public class Moteur {

	private String marqueMoteur;
	private int vitesseTheorique;

	public Moteur(){

	}
	public Moteur(String _marqueMoteur, int _vitesseMaxTheorique){
this.marqueMoteur=_marqueMoteur;
this.vitesseTheorique=_vitesseMaxTheorique;
	}

	public String getMarqueMoteur(){
		return marqueMoteur;
	}

	
	public void setVitesseTheorique(int _newVal){
this.vitesseTheorique=_newVal;
	}

	public void setMarqueMoteur(String _newVal){
this.marqueMoteur=_newVal;
	}

	public String toString(){
		return "";
	}

	

}