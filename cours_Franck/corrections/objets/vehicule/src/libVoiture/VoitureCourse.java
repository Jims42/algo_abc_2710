package libVoiture;

/**
 * @author JCoco
 * @version 1.0
 * @created 16-févr.-2026 14:32:01
 */
public class VoitureCourse extends Voiture {

	public VoitureCourse(){

	}

	public VoitureCourse(String _marque, String _modele, double _poids, String _marqueMoteur, double _vitesseMoteur){
		
		if (!_marque.equals(_marqueMoteur)) {
			throw new IllegalArgumentException("Le moteur et la marque doivent etre de la meme marque");
		}
		super(_marque,_modele,_poids,_marqueMoteur,_vitesseMoteur);

	}
@Override
	public int vitesseMax(){
		int resultat =(int)(this.moteur.getVitesseTheorique()-(this.poids*0.05));
		if(resultat<0){
			return 0;
		}
		return resultat;
	}
@Override
	public String toString(){
		return super.toString()+"\nVitesse max ==> "+this.vitesseMax()+" km/h";
	}

}