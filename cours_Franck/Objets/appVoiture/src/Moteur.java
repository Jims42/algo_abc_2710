

/**
 * @author JCoco
 * @version 1.0
 * @created 11-févr.-2026 11:59:19
 */
public class Moteur {

	private String marqueMoteur;
	private int vitesseTheorique;
	
	public Moteur(){
		this.marqueMoteur="";
		this.vitesseTheorique=0;

	}
	public Moteur(String _moteur){
		this.marqueMoteur=_moteur;
	}
	public Moteur(String _marqueMoteur,int _vitesseMaxTheorique){
		this.marqueMoteur=_marqueMoteur;
		this.vitesseTheorique=_vitesseMaxTheorique;
	}
	public int getVitesseTheorique(){
		return vitesseTheorique;
	}

	public String getMarqueMoteur(){
		return marqueMoteur;
	}
	public void setVitesseTheorique(int _newVal){
		this.vitesseTheorique=_newVal;
	}

	public void setMarqueMoteur(String _newVal){
		this.marqueMoteur = _newVal;
	}
	public String toString(){
		return "Moteur ==> "+marqueMoteur+"\nVitesse theorique ==> "+vitesseTheorique+" km/h\n";
	}


}