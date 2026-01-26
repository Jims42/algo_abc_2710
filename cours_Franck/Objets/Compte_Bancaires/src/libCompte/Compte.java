package libCompte;

/**
 * @author JCoco
 * @version 1.0
 * @created 26-janv.-2026 16:06:50
 */
public class Compte {

	private int numeroUnique;
	private String nomProprietaire;
	private double solde;
	private double decouvertAutorise;

	public void finalize() throws Throwable {

	}

	public final void Compte() {
		this.numeroUnique = 0;
		this.nomProprietaire = "";
		this.solde = 0;
		this.decouvertAutorise = 0;
	}

	/**
	 * 
	 * @param _num
	 * @param _nom
	 * @param _solde
	 * @param _decouvertAutorise
	 */
	public void Compte(int _num, String _nom, double _solde, double _decouvertAutorise) {
		this.numeroUnique = _num;
		this.nomProprietaire = _nom;
		this.solde = _solde;
		this.decouvertAutorise = _decouvertAutorise;
	}

	public double getnumeroUnique() {
		return numeroUnique;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnumeroUnique(int newVal) {
		numeroUnique = newVal;
	}

	public String getnomProprietaire() {
		return nomProprietaire;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnomProprietaire(String newVal) {
		nomProprietaire = newVal;
	}

	public double getsolde() {
		return solde;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsolde(double newVal) {
		solde = newVal;
	}

	public String toString() {
		return "";
	}

	/**
	 * 
	 * @param _montant
	 */
	public void crediter(double _montant) {

	}

	/**
	 * 
	 * @param _montant
	 */
	public boolean debiter(double _montant) {
		return false;
	}

	public double getdecouvertAutorise() {
		return decouvertAutorise;
	}

	/**
	 * 
	 * @param _autrecompte
	 * @param _montantTransfert
	 */
	public boolean transfert(Compte _autrecompte, double _montantTransfert) {
		return false;
	}

	/**
	 * 
	 * @param _autreCompte
	 */
	public boolean compare(Compte _autreCompte) {
		return false;
	}

}