package intro.cours_Franck;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Recherche_nombre {
    public static void main(String[] args) {
        int nombrecase=10;
        int saisieU;

        int [] monTab =new int[nombrecase];
        Random monAlea=new Random();
        Scanner clavier = new Scanner(System.in);

        for (int i = 0 ; i<monTab.length ; i++)
        {
            monTab[i]= monAlea.nextInt(101);
        }
        Arrays.sort(monTab);

        System.out.print("[ ");
        for (int el : monTab) {
            
            System.out.print(el+" ");
        }

        System.out.println(" ]");
        System.out.println("Veuillez saisir un nombre entre 0 et 100 : ");
        saisieU=clavier.nextInt();

        boolean trouve=false;
        int position=0;
        for (int i = 0; i < monTab.length; i++) {
            if (monTab[i]==saisieU) {
                trouve=true;
                position=i;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Le nombre saisie n'est pas dans le tableau !");
        }else{

            System.out.println("Le nombre se trouve dans le tableau à la position : "+ (position+1));
        }



    }
}
