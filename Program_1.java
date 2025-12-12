
import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a");
		double a = sc.nextDouble();
		
		System.out.println("Enter b");
		double b = sc.nextDouble();
		
		System.out.println("Enter operations (+,-,*,/)");
		String top = sc.next();
		double result = 0;
		
		switch(top) {
		
		case "+":
			result = a+b;
			break;
		
		case "-":
			result = a-b;
			break;
			
		case "*":
			result = a*b;
			break;
			
		case "/":
			if(b!=0) {
			result = a/b;
			}
			else {
				System.out.println("Error: Division by zero");
				return;
			}
			break;
			
		default:
			System.out.println("Invalid operation!");
			return;
			
		}
		
		System.out.println("Result: "+ result);

	}

}
