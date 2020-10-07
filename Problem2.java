import java.util.Scanner;
import java.lang.Math;

public class Problem2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   int num1,num2;
   System.out.println("Please enter month and year ");

  num1 = scanner.nextInt();
  num2 = scanner.nextInt();


switch(num1){
  case 1 :
  System.out.println("January " + num2 +" has 31 days.");
break;
  case 2 :
  System.out.println("February " + num2 + " has 29 days.");
break;
  case 3 :
  System.out.println("March " + num2 +" has 31 days.");
break;
  case 4:
  System.out.println("April " + num2 +" has 30 days.");
break;
  case 5 :
  System.out.println("May " + num2 +" has 31 days.");
break;
  case 6 :
  System.out.println("June " + num2 +" has 30 days.");
break;
  case 7 :
  System.out.println("July " + num2 +" has 31 days.");
break;
  case 8 :
  System.out.println("August " + num2 +" has 31 days.");
break;
  case 9 :
  System.out.println("September " + num2 +" has 30 days.");
break;
  case 10 :
  System.out.println("October " + num2 +" has 31 days.");
break;
  case 11 :
  System.out.println("November " + num2 +" has 30 days.");
break;
  case 12 :
  System.out.println("December " + num2 +" has 31 days.");
break;
  default :
  System.out.println("not valid");
break;
}

  }
}