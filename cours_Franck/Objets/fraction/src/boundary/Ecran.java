package boundary;
import java.util.LinkedList;

import models.Fraction;

/**
 * @author JCoco
 * @version 1.0
 * @created 09-févr.-2026 08:31:31
 */
public class Ecran {

	public Ecran(){

	}
	public Ecran(Fraction _Fraction){
		
	}

	
	
	public static void affiche(Fraction _fraction){
		if (_fraction.getDenominateur()==1) {
			System.out.println("Fraction entiere: "+_fraction.getNumerateur());
		}else{
			System.out.println("Fraction : "+_fraction);
		}
		
		
	}
	public static void affiche(LinkedList<Fraction> _uneliste){
		int compteur=1;
		for (Fraction fraction : _uneliste) {
			System.out.print("Fraction numero "+compteur+ ": ");
			affiche(fraction);
			compteur++;
		}
	}

}