



import java.util.Scanner;

/*  Voici comment marche le switch */

public class VotreAge {

    public static void main(String[] args) {


         Scanner clavier = new Scanner(System.in); //* Initialsiation du scanner */

        int age;
        int ageRank=0;

        System.out.println("Donnez votre âge :");

        age = clavier.nextInt();

            if(age>=0 && age<=2){ageRank=1;} //* Bébé */
            if(age>2 && age<=8){ageRank=2;} //* Enfant */
            if(age>8 && age<=13){ageRank=3;} //* Pré ados */
            if(age>14 && age<=17){ageRank=4;} //* Adolesecent */
            if(age>17 && age<=25){ageRank=5;} //* Jeune adulte */
          if(age>25 && age<=39){ageRank=6;} //* Aadulte */
          if(age>39 && age<=50){ageRank=7;} //* Adulte mure */
          if(age>50){ageRank=8;} //* Adulte mure */

        switch(ageRank){ /* On initialise le switch avec la variable age , on va tester si age à les valeurs suivantes */
            /* En fonction des valeurs le message change */
            case 1:
                System.out.println("Vous êtes un bébé");
                break;
            case 2:
                System.out.println("Vous êtes un enfant");
                break;
            case 3:
                 System.out.println("Vous êtes un pré-ados");
                break;
            case 4:
                 System.out.println("Vous êtes un Adolescents");
                break;
            case 5 :
                 System.out.println("Vous êtes un jeune Adulte");
                break;
            case 6 :
                 System.out.println("Vous êtes un adulte");
                break;
            case 7 :
                 System.out.println("Vous êtes un adulte mure");
                break;
            case 8 :
                 System.out.println("Vous êtes un senior");
                break;
            default:
                System.out.println("Age inconnu");

        

    }


        clavier.close();
        

    }
    
}
