import java.util.Scanner;

public class TantQue {

    public static void main(String[] args) {

         int note;
         Scanner sc = new Scanner(System.in); //* Initialsiation du scanner */

         do { 

            System.out.println("Veuillez vous attribuer une note entre 0 et 20");
            note = sc.nextInt();
             
         } while(note>20 || note<0); // Do While répètera l'instruction tant que la condition est vrai


                     System.out.println("Vous avez :"+note+"/20");
        
    }
    
}
