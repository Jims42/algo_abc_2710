package libCompte;

import java.util.ArrayList;

/**
 * @author JCoco
 * @version 1.0
 * @created 26-janv.-2026 16:06:50
 */
public class Compte {
	
	private int numeroUnique;
	protected String nomProprietaire;
	protected double solde;
	private double decouvertAutorise;

	public Compte() {
		this.numeroUnique = 0;
		this.nomProprietaire = "sans nom";
		this.solde = 0;
		this.decouvertAutorise = 0;
	}
	public Compte(int _num, double _solde, String _nom) {
        this.numeroUnique = _num;
        this.nomProprietaire = _nom;
        this.solde = _solde;
        this.decouvertAutorise = 0;
	}

	public Compte(int _num, double _solde, double _decouvertAutorise, String _nom) {
		this.numeroUnique = _num;
		this.nomProprietaire = _nom;
		this.solde = _solde;
		this.decouvertAutorise = _decouvertAutorise;
		
	}

	public int getnumeroUnique() {
		return numeroUnique;
	}

	public void setnumeroUnique(int newVal) {
		this.numeroUnique = newVal;
	}

	public String getnomProprietaire() {
		return nomProprietaire;
	}

	public boolean setnomProprietaire(String newVal) {
		if (this.nomProprietaire.equals("sans nom")) {
				this.nomProprietaire = newVal;
				return true;
		}else{
		return false;
		}
	}

	public double getsolde() {
		return solde;
	}

	public void setsolde(double newVal) {
		this.solde = newVal;
	}

	public double getdecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertautorise(double newVal) {
		this.decouvertAutorise = newVal;
	}

	public String toString() {
	 return "\u001B[43mCompte courant\u001B[0m \u001B[33m||\u001B[0m ID: \u001B[36m" + numeroUnique + "\u001B[0m \u001B[33m||\u001B[0m Nom: \u001B[34m" + nomProprietaire + "\u001B[0m \u001B[33m||\u001B[0m Solde: \u001B[32m" + solde + "\u001B[0m euros (Découvert: \u001B[31m" + decouvertAutorise + "\u001B[0m euros)\n";

		// return "Compte de " + nomProprietaire + " : votre solde est de " + solde
		// 		+ " Euros, avec votre découvert autorisé de " + decouvertAutorise
		// 		+ " Euros\n";
	}

	public void crediter(double _montant) {
		this.solde += _montant;

	}

	public boolean debiter(double _montant) {

		if (solde - _montant > -decouvertAutorise) {
			this.solde -= _montant;
			return true;
		} else if (solde - _montant == -decouvertAutorise) {
			System.out.println("vous avez atteint votre découvert maximum autorisé, vous ne pourrez plus retirer");
			this.solde -= _montant;
			return true;
		} else {
			System.out.println("Découvert autorisé dépassé !!!\nrtrait annulé ");
			return false;
		}

	}

	public boolean transfert(Compte _autrecompte, double _montantTransfert) {
		if (solde - _montantTransfert > -decouvertAutorise) {
			this.solde -= _montantTransfert;
			_autrecompte.crediter(_montantTransfert);
			;
			return true;
		}
		if (solde - _montantTransfert == -decouvertAutorise) {
			System.out.println(
					"vous avez atteint votre découvert maximum autorisé, vous ne pourrez plus retirer ou trandferer");
			this.solde -= _montantTransfert;
			_autrecompte.crediter(_montantTransfert);
			return true;
		} else {
			System.out.println("Découvert autorisé dépassé !!!\transfert annulé ");
			return false;
		}

	}

	public boolean compare(Compte _autreCompte) {
		if (this.solde >= _autreCompte.getsolde()) {
			return true;

		} else {

			return false;
		}
	} 

			
		}

	

