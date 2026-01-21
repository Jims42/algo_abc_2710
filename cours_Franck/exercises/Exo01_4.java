import java.util.Scanner;
public class Exo01_4 {
    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
        double S;  //somme
        double i=0.4;  //interet
                
        //System.out.println("Lire la somme S placée sur un compte, l'intérêt I offert par la banque et le nombre N d'années de placement de la somme s.");
        System.out.print("Indiquez la somme : ");S=clavier.nextDouble();
        System.out.print("indiquez le nombre d'années : ");int N = clavier.nextInt();
        double interet=S*(1+N*i);
        System.out.printf("avec interet simple : %.2f  \n",interet);
        double credit=S*Math.pow((1+i),N);
        System.out.printf("avec un interet composé : %.2f \n",credit );
        clavier.close();


    }
}
