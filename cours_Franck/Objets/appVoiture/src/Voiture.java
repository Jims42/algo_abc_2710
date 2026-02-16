

/**
 * @author JCoco
 * @version 1.0
 * @created 11-févr.-2026 11:59:15
 */
public class Voiture {

	protected String marqueVoiture;
	protected String modele;
	protected int poids;
	protected Moteur moteur;
	protected Moteur _lemoteur;
	public Moteur m_Moteur;

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

	/**
	 * 
	 * @param _newPoids
	 */
	public void setPoids(int _newPoids) {
		this.poids = _newVal;
	}

	public void setMoteur(Moteur _newVal) {
		this.moteur = _newVal;
	}

	public String toString() {
		return "-----------------------------VOITURE--------------------------------------------------\nMarque du vehicule ==> "+marqueVoiture + "\nModele ==> " + modele +"\nPoids ==> "+ poids + " kg\n"+moteur.toString();
    
	}

	public Voiture vitesseMax() {
		double vitesseMax=this.moteur.getVitesseTheorique()-(this.poids*0.3);
		
		
		return vitesseMax;
	}

	/**
	 * 
	 * @param _marque
	 * @param _modele
	 * @param _poids
	 * @param _marqueMoteur
	 * @param _vitesseMoteur
	 */
	public Voiture(String _marque, String _modele, double _poids, String _marqueMoteur, double _vitesseMoteur){

	}

	public Moteur get_lemoteur(){
		return _lemoteur;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void set_lemoteur(Moteur newVal){
		_lemoteur = newVal;
	}
	

}