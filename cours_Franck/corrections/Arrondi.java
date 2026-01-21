package cours_Franck.corrections;

import java.util.*;
public class Arrondi {
    public static void main(String[] args) throws Exception {
            Scanner sc= new Scanner(System.in);
        double rayon;
        double aire;
        double volume;

        double volumeArr;
        double aireArr;

        
        System.out.println(" Veuillez saisir le rayon de la SPHERE");

        rayon= sc.nextDouble();

        aire= 4*Math.PI*Math.pow(rayon,2);

      aireArr= arrondi(aire,2);

        volume= (4.0/3.0)*Math.PI*Math.pow(rayon,3);

        volumeArr= arrondi(volume,2);
        

        System.out.printf( "la surface de la sphere est : %f km 2 et son volume est de : %f km3",aireArr,volumeArr);

        sc.close();
        
    }

    public static double arrondi(double nb, int nv )
    {

        return (double) ((long)(nb*Math.pow(10,nv) +0.5))/Math.pow(10,nv); 

    }
}

 
