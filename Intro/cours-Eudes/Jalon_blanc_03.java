import java.util.Scanner;

public class Jalon_blanc_03 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

          // Demander à l'utilisateur s'il veut lancer le compte à rebours
        //System.out.println("Voulez-vous lancer le compte à rebours ? (true/false)");
        //boolean lancerCompteARebours = scanner.nextBoolean();

        //if (lancerCompteARebours) {
            // Compte à rebours de 10 à 0
         //   for (int i = 10; i >= 0; i--) {
          //      System.out.println(i);
           //     try {
                    // Pause d'une seconde entre chaque nombre
             //       Thread.sleep(1000);
               // } catch (InterruptedException e) {
                //    e.printStackTrace();
             //   }
           // }
           // System.out.println("Bonne année 2026 !!");
        //} else {
        //    System.out.println("Compte à rebours annulé !");
       // }

       // scanner.close();
    boolean question=true;

    System.out.println("Voulez-vous lancer le compte a rebours ?");
    question=clavier.nextBoolean();
    int debut=10;
    int decompte=10;
    
    
    
    while (question) {
                   
    
    if (question=true) {System.out.println("Le compte à rebours va commencer :"+debut);debut=decompte; 
    }if (question=false) {System.out.println("MERCI\n AU REVOIR!!!");}
    if (decompte==0) {System.out.println("\u001B[4;36m BONNE ANNEE 2026 !!! \u001B[4;0m");
    
    }if (decompte>=0) {System.out.println(+decompte);;-- decompte;}
    }
      
    }
  
   } 

