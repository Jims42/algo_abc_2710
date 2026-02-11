

/**
 * @author JCoco
 * @version 1.0
 * @created 11-févr.-2026 11:59:15
 */
public class Voiture {

	protected String marqueVoiture;
	protected String modele;
	protected int poids;
	private Moteur moteur;

	public Voiture() {
		this.marqueVoiture = "";
		this.modele = "";
		this.poids = 0;

	}

	public Voiture(String _marqueVoiture, String _modele, int _poids, Moteur _moteur) {
		this.marqueVoiture = _marqueVoiture;
		this.modele = _modele;
		this.poids = _poids;
		this.moteur = _moteur;
	}

	public Voiture(String _marqueVoiture, String _modele, Moteur _moteur) {
		this.marqueVoiture = _marqueVoiture;
		this.modele = _modele;
		this.moteur = _moteur;
		this.poids = 1000;
	}

	public String getMarqueVoiture() {
		return marqueVoiture;
	}

	public String getModele() {
		return modele;
	}

	public int getPoids() {
		return poids;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMarqueVoiture(String _newVal) {
		this.marqueVoiture = _newVal;
	}

	public void setModele(String _newVal) {
		this.modele = _newVal;
	}

	public void setPoids(int _newVal) {
		this.poids = _newVal;
	}

	public void setMoteur(Moteur _newVal) {
		this.moteur = _newVal;
	}

	public String toString() {
		return "Marque du vehicule ==> "+marqueVoiture + "\nModele ==> " + modele +"\nPoids ==> "+ poids + " kg\n"+moteur.toString();

	}

	public double vitesseMax() {
		double vitesseMax=this.moteur.getVitesseTheorique()-(this.poids*0.1);
		
		
		return vitesseMax;
	}

}