import java.util.ArrayList;

public class Statistique {
    private ArrayList<Double> myData = new ArrayList<Double>();
    private int nbElement;

    public Statistique(ArrayList<Double> _monTab) {
        this.myData.addAll(_monTab);
        this.nbElement = myData.size();
    }
    public ArrayList<Double> getMyData(){return myData;}
    public void setMyData(ArrayList<Double> _newVal){
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
        return (double)(Math.pow(10, _decimal)*_nombre+0.5)/Math.pow(10, _decimal);
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

}
