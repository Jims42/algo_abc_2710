package exo;

import java.util.Scanner;

public class exo05_cor {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double equation;
  
        Scanner clavier = new Scanner(System.in);

System.out.println("valeur de a = ");
clavier.nextDouble();

System.out.println("valeur de b = ");
clavier.nextDouble();

System.out.println("valeur de c = ");
clavier.nextDouble();

equation = a*b/c;

System.out.println(" a x b / c = "+equation);

if (equation>10) {
    System.out.println("la valeur est superieur a 10 ");
    
    
}if (equation==10) {
    
    System.out.println(" la valeur est egal a 10");

} else {

    System.out.println("la valeur est inferieur a 10");

    
}
    

    clavier.close();
}
}

    

