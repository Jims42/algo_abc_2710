package libVoiture;

public class Voiture {

	protected String marqueVoiture;
	protected String modele;
	protected int poids;
	protected Moteur moteur;

	public Voiture() {

	}

	public Voiture(String _marqueVoiture, String _modele, int _poids, Moteur _moteur) {

	}

	public Voiture(String _marqueVoiture, String _modele, Moteur _moteur) {

	}

	public Voiture(String _marque, String _modele, double _poids, String _marqueMoteur, double _vitesseMoteur) {

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

	}

	public void setModele(String _newVal) {

	}

	public void setPoids(int _newPoids) {
		this.poids = _newPoids;
	}

	public void setMoteur(Moteur _newVal) {
		this.moteur = _newVal;
	}

	public String toString() {
		return "";
	}

	public Voiture vitesseMax() {
		return null;
	}

}