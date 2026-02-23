import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * @author JCoco
 * @version 1.0
 * @created 17-févr.-2026 16:00:23
 */
public class Statistique {

	private List<Double> maList;

	public Statistique(List<Double> _maList) {
		this.maList = new ArrayList<>(_maList);
		Collection.sort(this.maList);
	}

	public double calculMoyenne() {
		double somme = 0;
		for (Double list : maList) {
			somme += list;
		}
		return somme / maList.size();
	}

	public double calculMedianne() {
		int n = maList.size();
		if (n % 2 == 0) {
			return (maList.get(n / 2 - 1) + maList.get(n / 2)) / 2.0;
		} else {
			return maList.get(n / 2);
		}
	}

	public double ecartType() {
		double moyenne = calculMoyenne();
		double sommeCarre = 0;
		for (Double double1 : maList) {
			sommeCarre += Math.pow(double1 - moyenne, 2);
		}
		return Math.sqrt(sommeCarre / maList.size());
	}

	public double calculerQ1() {
		int index = (int) Math.ceil(0.25 * maList.size()) - 1;
		return maList.get(index);
	}

	// Calcul du Quartile 3 (Q3) : 75% des données
	public double calculerQ3() {
		int index = (int) Math.ceil(0.75 * maList.size()) - 1;
		return maList.get(index);
	}

}