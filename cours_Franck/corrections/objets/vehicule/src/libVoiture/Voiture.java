package libVoiture;

public class Voiture {

	protected String marqueVoiture;
	protected String modele;
	protected double poids;
	protected Moteur moteur;

	public Voiture() {

	}

	public Voiture(String _marque, String _modele, double _poids, String _marqueMoteur, double _vitesseMoteur) {
this.moteur=new Moteur(_marqueMoteur, _vitesseMoteur);
this.marqueVoiture=_marque;
this.modele=_modele;
this.poids=_poids;

	}

	public String getMarqueVoiture() {
		return this.marqueVoiture;
	}

	public String getModele() {
		return this.modele;
	}

	public double getPoids() {
		return this.poids;
	}

	public Moteur getMoteur() {
		return this.moteur;
	}

	public void setMarqueVoiture(String _newVal) {
this.marqueVoiture=_newVal;
	}

	public void setModele(String _newVal) {
this.modele=_newVal;
	}

	public void setPoids(int _newPoids) {
		this.poids = _newPoids;
	}

	public void setMoteur(Moteur _newVal) {
		this.moteur = _newVal;
	}
	@Override
/**
 * Affiche la voiture et du moteur
 * @return chaine de caractere
 */
	public String toString() {
		return "Vehicule :\nMarque "+this.marqueVoiture+"\nModele : "+this.modele+"\nPoids : "+this.poids+"\n"+moteur.toString();
	}

	public int vitesseMax() {
		int vitesseVoiture=(int)(this.moteur.getVitesseTheorique()-(this.poids*0.3));
		return vitesseVoiture;
	}

}