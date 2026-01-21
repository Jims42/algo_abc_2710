import java.util.Scanner;

public class Exo02_3 {
public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    float a;
    float b;
    float c;
    int resultat=0;
    
    System.out.print("Indiquez la valeur de A : ");a=clavier.nextFloat();
    System.out.print("Indiquez la valeur de B : ");b=clavier.nextFloat();
    System.out.print("Indiquez la valeur de C : ");c=clavier.nextFloat();

  if (a==b && b==c){resultat=1;}    
  if (a<b && b<c) {resultat=2;}
  if (a<c && c<b) {resultat=3;}
  if (b<a && a<c) {resultat=4;}
  if (b<c && c<a) {resultat=5;}
  if (c<a && a<b) {resultat=6;}
  if (c<b && b<a) {resultat=7;}

  switch (resultat) {
    case 1:
        System.out.println("toutes les valeur sont egal à : "+a);
        break;
        case 2:
            System.out.println("la valeur "+a+" < "+b+" < "+c);
            break;
            case 3:
                System.out.println("la valeur "+a+" < "+c+" < "+b);
                break;
                case 4:
                    System.out.println("la valeur "+b+" < "+a+" < "+c);
                    break;
                    case 5:
                        System.out.println("la valeur "+b+" < "+c+" < "+a);
                        break;
                        case 6:
                            System.out.println("la valeur "+c+" < "+a+" < "+b);
                            break;
                            case 7:
                            System.out.println("la valeur "+c+" < "+b+" < "+a);
                            break;
  
    default:
        break;
  }
  clavier.close();
    }
        
    }


