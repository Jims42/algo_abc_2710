
public class App {
    public static void main(String[] args) {
        Moteur eco = new Moteur("dci", 180);
        Moteur renaultF1 = new Moteur("renault", 317);

        Voiture berline = new Voiture("renault", "megane", 1000, eco);
        VoitureDeCourse f1 = new VoitureDeCourse("renault", 450, renaultF1);

        
        System.out.println(berline);
        
        double vitesse = berline.vitesseMax();
        System.out.println(berline.getMarqueVoiture() + ", " + berline.getModele() + ", " + eco.getMarqueMoteur()
                + " ==> " + vitesse + " km/h");
        

        System.out.println(f1);
        System.out.println("--------------------------------------------------------------------------------------");

    }
}
