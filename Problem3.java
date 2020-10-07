import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class Problem3 {

  public static void main(String[] args) {
    Random rand = new Random();
    int num1 = rand.nextInt(13)+1;

    Random rand2 = new Random();
    int num2 = rand2.nextInt(3)+1;
  // int num2 = scanner.nextInt();

  String card ="";

  // System.out.println(num1);
  // System.out.println(num2);

  switch(num2){
    case 1 :
     card = "Clubs";
  break;
    case 2 :
     card = "Diamonds";
  break;
    case 3 :
     card = "Hearts";
  break;
    case 4:
     card = "Spades";
  break;
  }


switch(num1){
  case 1 :
  System.out.println(card +" Ace");
break;
  case 2 :
  System.out.println(card + " " + num1);
break;
  case 3 :
  System.out.println(card +" " + num1);
break;
  case 4:
  System.out.println(card +" " + num1);
break;
  case 5 :
  System.out.println(card +" " + num1);
break;
  case 6 :
  System.out.println(card +" " + num1);
break;
  case 7 :
  System.out.println(card +" " + num1);
break;
  case 8 :
  System.out.println(card +" " + num1);
break;
  case 9 :
  System.out.println(card +" " + num1);
break;
  case 10 :
  System.out.println(card +" " + num1);
break;
  case 11 :
  System.out.println(card +" Jack");
break;
  case 12 :
  System.out.println(card +" Queen");
break;
  case 13 :
  System.out.println(card +" King");
break;
  default :
  System.out.println("not valid");
break;
}

  }
}