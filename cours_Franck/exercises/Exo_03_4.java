import java.util.*;
public class Exo_03_4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez une chaine de caractères (terminée par un point)  : ");
        String chaine =clavier.nextLine();

        System.out.println("Entrez la lettre rechercher");
        char lettre = clavier.next().charAt(0);

        String resultat = compterOccurrences(chaine, lettre);

        System.out.println(resultat);
        
    }
    public static String compterOccurrences(String chaine, char lettre) {
        if (chaine.trim().equals(".")|| chaine.trim().isEmpty()) {
            return "LA CHAINE EST VIDE";
                        
        }
        int compteur = 0;

        for (int i=0;i<chaine.length();i++){
            char caractere = chaine.charAt(i);
            if (caractere==lettre) {
                
            
            compteur++;
            }
        }
        
    
    if (compteur==0){
        return "0";
    }else {
        return String.valueOf(compteur);
    
    }
    
        
    }
}
