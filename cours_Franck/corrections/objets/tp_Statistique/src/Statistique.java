import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Statistique {
    private ArrayList<Double> myData = new ArrayList<Double>();
    private int nbElement;

    public Statistique(ArrayList<Double> _monTab) {
        this.myData.addAll(_monTab);
         // tri croissant
        Collections.sort(this.myData);
        // methode >= java 8
        // myData.sort(Comparator.naturalOrder()); tri croissant
        // myData.sort(Comparator.reverseOrder()); tri decroissant
        this.nbElement = myData.size();
    }
    public ArrayList<Double> getmyData(){return myData;}
    public void setmyData(ArrayList<Double> _newVal){
        this.myData=_newVal;
    }
    public double calculMoyenne(){
        double resultat=0;
        for (Double valeur : myData) {
            resultat+=valeur;
        }
        resultat/=this.nbElement;
        return calculArrondi(resultat, 2);
    }
    private double calculArrondi(double _nombre,int _decimal){
        return (double)((long)(Math.pow(10, _decimal)*_nombre+0.5))/Math.pow(10, _decimal);
    }
    public double calculEquartType(){
        double temp=0;
        final double MOY=this.calculMoyenne();
        double res=0;
        for (Double val : myData) {
            temp+=Math.pow(val-MOY,2);
        }
        temp/=this.nbElement;
        res=Math.sqrt(temp);
        return calculArrondi(res, 2);
    }
    public double calculMedianne(){
               if(this.nbElement%2==0){
                double medianne=(myData.get(this.nbElement/2)+myData.get((this.nbElement/2)-1))/2;
                return medianne;
        }
        return myData.get(this.nbElement/2);
    }
    public double [] calculquartil(){
        double[] quartil=new double[3];
         if (nbElement % 4 == 0) {
   quartil[0] = myData.get((nbElement / 4));
  } else {
   double moyenneSal = (myData.get((int) (Math.floor(this.nbElement / 4)))
     + myData.get((int) Math.ceil(this.nbElement / 4))) / 2;
   quartil[0] = moyenneSal;
  }
  quartil[1] = this.calculMedianne();
  if (this.nbElement * 3 % 4 == 0) {

   quartil[2] = myData.get((nbElement * 3 / 4));

  } else {
   double moyenneSal2 = (myData.get((int) (Math.floor(this.nbElement * 3 / 4)))
     + myData.get((int) Math.ceil(this.nbElement * 3 / 4))) / 2;

   quartil[2] = moyenneSal2;

  }
         return quartil;

    }
     
		
	}  


