public class VoitureDeCourse extends Voiture {

    public VoitureDeCourse() {
        this.marqueVoiture = "";
        this.poids = 0;

    }

    public VoitureDeCourse(String _marque, int _poids, Moteur _moteur) {
        this.marqueVoiture = _marque;
        this.poids = _poids;

        try {
            this.moteur = _moteur;
            if (!this.moteur.getMarqueMoteur().equals(this.marqueVoiture)) {
                throw new Exception("Le moteur et la marque de la voiture de course ne sont pas compatible");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public double vitesseMaxF1() {
        double vitesseMaxF1 = this.moteur.getVitesseTheorique() - (this.poids * 0.05);
        return vitesseMaxF1;
    }

    public String toString() {
        return "------------------------VOITURE DE COURSE---------------------------------------------\nMarque ==> "
                + marqueVoiture + "\nPoids ==> " + poids + " kg\nVitesse Max ==>  " + vitesseMaxF1() + " km/h";
    }
}
