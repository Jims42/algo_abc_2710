import java.util.Scanner;

public class Exo_03_4_correction {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        boolean trouvepoint= false;
        boolean trouvelettre=false;

        int nbchar=0;
        int [] occurrence= new int[nbchar];
        String mot;
        char lettre;

        String chaineString;

        do{
            System.out.println("Veuillez saisir unr phrase terminée par un point ! ");
            chaineString=clavier.nextLine();
            int depart=chaineString.length()-1;
            String souString=chaineString.substring(depart);
            if(souString.equals(".")){
                trouvepoint=true;
            }


        }while(trouvepoint==false);
        chaineString=chaineString.replace("", "");
        //chaineString=chaineString.replace("é", "e");
        System.out.println("veuillez saisir une lettre qui sera peut-être dans la phrase : ");
        lettre=clavier.next().charAt(0);

        
        // String chainetab="";
        char[ ]tabphrase=new char[chaineString.length()];

        for (int i=0 ; i<chaineString.length();i++) {
             
            tabphrase[i]=chaineString.charAt(i);
        }
        System.out.println("[ ");
        for (char c : tabphrase) {
            System.out.println(c+" ");
        }
        System.out.println("] ");
        int position=0;

        for (int i = 0; i < tabphrase.length; i++) {
            if (tabphrase[i]==lettre) {
                occurrence[position]=i+1;
                trouvelettre=true;
                position++;
            }
            if (trouvelettre==false) {
                System.out.println("La lettre n'est pas présente dans la phrase");
            }else{
                System.out.println("La lettre est présente dans le tableau de char aux positions suivante : ");
                for (int value  : occurrence) {
                    
                }
            }
        }
    }
    
}
