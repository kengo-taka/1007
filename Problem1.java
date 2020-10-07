import java.util.Scanner;
import java.lang.Math;

public class Problem1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   double num1,num2,num3;
   System.out.println("Please enter three edges for a triangle");

  num1 = scanner.nextDouble();
  num2 = scanner.nextDouble();
  num3 = scanner.nextDouble();

if ((num1+num2) > num3 && (num3 + num2) > num1 &&(num1+num3) > num2) 
System.out.println("Valid");
else 
System.out.println("Invalid");

  }
}