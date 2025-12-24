import java.util.Scanner;

public class Exo_03_4_correction {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean trouvePoint = false;
        boolean trouveLettre = false;

        int[] occurence;

        char lettre;

        String chaineString;

        do {
            System.out.println(" Veuillez saisir une phrase terminée par un point !");
            chaineString = sc.nextLine().toLowerCase();
            chaineString=chaineString.trim();
            int depart = chaineString.length() - 1;
            String souString = chaineString.substring(depart);
            if (souString.equals(".")) {
                trouvePoint = true;
            }

        } while (trouvePoint == false);
        
        if (chaineString.length()==1) {
            System.out.println("La chaine est vide");
        }else{

        chaineString = chaineString.replace(" ", "");
        // String newchaineString = chaineString.replace( "à", "a");

        System.out.println(chaineString);
        occurence = new int[chaineString.length()];

        System.out.println(" Veuillez saisir une lettre qui sera peut-être dans la phrase :");
        lettre = sc.nextLine().charAt(0);

        // String chainetab="";

        char[] tabphrase = new char[chaineString.length()];

        for (int i = 0; i < chaineString.length(); i++) {

            tabphrase[i] = chaineString.charAt(i);
        }

        System.out.print("[ ");
        for (char c : tabphrase) {
            System.out.print(c + " ");
        }

        System.out.print("] \n");
        int position = 0;

        for (int i = 0; i < tabphrase.length; i++) {
            if (tabphrase[i] == lettre) {
                occurence[position] = i + 1;

                trouveLettre = true;

                position++;

            }

        }

        if (trouveLettre == false) {
            System.out.println("la lettre n'est pas présente  dans la phrase");
        } else {

            System.out.println(" la lettre est présente dans le tableau de char aux positions suivantes :");
            for (int value : occurence) {
                if (value != 0) {
                    System.out.print(value + " ");

                }

            }

        }
        sc.close();
    }
    }
}
 