package demo;

import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
    	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        scanner.close();
        double output;
        
        switch(operator)
        {
        case '+':
        	output = 1;
            break;

        case '-':
        	output = 2;
            break;

        case '*':
        	output = 3;
            break;

        case '/':
        	output = 4;
            break;

        default:
            System.out.printf("You have entered wrong operator");
            return;
        }
        
        scanner.close();
	}
}
