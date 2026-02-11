
public class App {
    public static void main(String[] args)  {
        Moteur eco=new Moteur("dci",180);
       
        Voiture berline=new Voiture("renault", "megane",1000, eco);

       System.out.println(berline);
       double vitesse=berline.vitesseMax();
       System.out.println(berline.getMarqueVoiture()+", "+berline.getModele()+", "+eco.getMarqueMoteur()+" ==> "+vitesse+" km/h");


    }
}
