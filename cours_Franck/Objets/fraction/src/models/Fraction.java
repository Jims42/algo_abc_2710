package models;


/**
 * @version 1.0
 * @created 09-févr.-2026 08:31:09
 */
public class Fraction {
	// attibuts

	public int numerateur;
	public int denominateur;

	// propriétées
	public int getNumerateur(){
		return numerateur;
	}

	public int getDenominateur(){
		return denominateur;
	}

	public void setNumerateur(int _newVal){
		this.numerateur=_newVal;

	}
	
	public void setDenominateur(int _newval){
		this.denominateur=_newval;

	}

	// Constructeurs

	public Fraction(){
		this.numerateur=0;
		this.denominateur=1;

	}
	public Fraction(int _numerareur){
		this.numerateur=_numerareur;
		this.denominateur=1;
	}

	public Fraction(int _numerateur, int _denominateur){
		this.numerateur=_numerateur;
		
		try {
			double res=this.numerateur/_denominateur;
				this.denominateur=_denominateur;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()+" division par zero impossible");
		}
		this.reduire();

	}
	@Override
	public String toString(){
		return this.numerateur+"/ "+this.denominateur;
	}
	

	public void oppose(){
	
		this.numerateur*=-1;
		

	}

	public void inverse(){
		int temp=this.numerateur;
		this.numerateur=this.denominateur;
		this.denominateur=temp;

	}

	
	// public boolean superieur(Fraction _fracSup){
	// 	Fraction fraction;
	// 	if ( fraction > _fracSup) {
	// 		return true;
			
	// 	}
	// 	return false;
	// }

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
	private int getPgcd(){
		int a = this.numerateur;

int b = this.denominateur;

int pgcd=-1;

if ( a!=0 && b!=0)

{

if ( a<0 ) a =-a;

if ( b<0 ) b =-b;

while ( a!=b )

if ( a<b )

b -= a;

else

a -=b;

pgcd = a;

}

return pgcd;

	}

	private void reduire(){
		int pgcd=this.getPgcd();
		this.numerateur/=pgcd;
		this.denominateur/=pgcd;
		if (this.denominateur<0) {
			this.numerateur*=-1;
			this.denominateur*=-1;

		}

	}
	public Fraction sommeFraction(Fraction _uneFraction){
		int term1=this.numerateur*_uneFraction.getDenominateur()+this.denominateur*_uneFraction.getNumerateur();
		int term2=this.denominateur*_uneFraction.getDenominateur();

		Fraction resultat=new Fraction(term1, term2);
		return resultat;
	}
	public Fraction difference(Fraction _uneFraction){
		// int term1=this.numerateur*_uneFraction.getDenominateur()-this.denominateur*_uneFraction.getNumerateur();
		// int term2=this.denominateur*_uneFraction.getDenominateur();

		// Fraction resultat=new Fraction(term1, term2);
		// return resultat;
		Fraction nouvFraction;
		_uneFraction.oppose();
		nouvFraction=this.sommeFraction(_uneFraction);
	}
	public Fraction quotient(Fraction _uneFraction){
		int term1=this.numerateur/this.denominateur;
		int term2=;
	}
}