package cours_Franck.corrections;
import java.util.Scanner;

public class Annee_bisextile {

 public static void main(String[] args) {

  int a;
  boolean continuer = true;
  String rep="test";
  
  Scanner sc = new Scanner(System.in);
  
  do {
   
  
  

  System.out.println("Veuillez entrer une année formt aaaa!");

  a = sc.nextInt();

 
  if (a % 4 == 0) {
   

   if (a % 100 == 0) {


   
    
    if (a% 400 == 0) {

     System.out.println("Année Bissextile !");

     

    }
    else 
    {
     System.out.println("Année non bissextile !");

     
    }
    


   } else 
   
   {

    System.out.println("Année Bissextile !");

    
   }

  } else {
   System.out.println("année non bissextile !");

   
  }
  
    sc.nextLine();
   System.out.println("Voulez-vous rentrer une autre année ?");
      
    rep=sc.nextLine();
   
  
    if (!rep.equalsIgnoreCase("oui")) {
    
     continuer=false;
    
   }
    
    
   
   
 
   
  } while(continuer);
  
  
   
   
  System.out.println("programme terminé");
  

 
  
 }

}
