

/**
 * @version 1.0
 * @created 09-févr.-2026 08:31:09
 */
public class Fraction {

	public int numerateur;
	public int denominateur;



	public void finalize() throws Throwable {

	}

	public Fraction(){
		this.numerateur=0;
		this.denominateur=0;

	}

	/**
	 * 
	 * @param _numerateur
	 * @param _denominateur
	 */
	public Fraction(int _numerateur, int _denominateur){
		this.numerateur=_numerateur;
		this.denominateur=_denominateur;

	}

	public int getNumerateur(){
		return numerateur;
	}

	public int getDenominateur(){
		return denominateur;
	}

	/**
	 * 
	 * @param _newVal
	 */
	public void setNumerateur(int _newVal){
		this.numerateur=_newVal;

	}

	/**
	 * 
	 * @param _newval
	 */
	public void setDenominateur(int _newval){
		this.denominateur=_newval;

	}

	public void oppose(){
	
		this.numerateur=-this.numerateur;
		

	}

	public void inverse(){

	}

	/**
	 * 
	 * @param _fracSup
	 */
	public boolean superieur(Fraction _fracSup){
		return false;
	}

	/**
	 * 
	 * @param _fracInf
	 */
	public boolean inferieur(Fraction _fracInf){
		return false;
	}

	/**
	 * 
	 * @param _fracEgal
	 */
	public boolean egal(Fraction _fracEgal){
		return false;
	}

	/**
	 * 
	 * @param -numerareur
	 * @param _denominateur
	 */
	private int getPgcd(int _numerareur, int _denominateur){
		return 0;
	}

	private void reduire(){

	}

}