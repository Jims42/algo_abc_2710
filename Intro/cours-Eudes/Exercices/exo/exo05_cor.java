package exo;

import java.util.Scanner;

public class exo05_cor {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int equation;
  
        Scanner clavier = new Scanner(System.in);

System.out.println("valeur de a");
a = clavier.nextInt();

System.out.println("valeur de b");
b = clavier.nextInt();

System.out.println("valeur de c");
c = clavier.nextInt();

equation = a*b/c;


System.out.println(" a x b / c = "+equation);

if (equation>10) {
    System.out.println("la valeur est superieur a 10 ");
    
    
}else if (equation==10) {
    
    System.out.println(" la valeur est egal a 10");

} 
else {

    System.out.println("la valeur est inferieur a 10");

    
}
    

    clavier.close();
}
}

    

