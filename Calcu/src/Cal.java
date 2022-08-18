//Program to create a calculator
import java.util.Scanner;
public class Cal {
   public static void main(String[] args) {
      double num1;
      double num2;
      double result;
      char operation;
      //using Scanner for user input
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = sc.nextDouble();
      num2 = sc.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      operation= sc.next().charAt(0);
      switch(operation) {
         case '+': result = num1 + num2;
            break;
         case '-': result = num1 - num2;
            break;
         case '*': result = num1 * num2;
            break;
         case '/': result = num1 / num2;
            break;
      default: System.out.printf("please enter correct input");
        return;
      }
      System.out.println("The result is:");
      System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
   }
}