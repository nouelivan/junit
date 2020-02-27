package calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
	
	double operand;
	double operand2;
	double total;
	String operator;

	public double Add(double operand, double operand2) {


			this.total = operand + operand2;

		
		return this.total;

	}

	public double Subtract(double operand, double operand2) {


			this.total = operand - operand2;

		
		return this.total;

	}

	public double Multiply(double operand, double operand2) {


			this.total = operand * operand2;

		
		return this.total;

	}

	public double Divide(double operand, double operand2) {

		if ((operand == 0) || (operand2 == 0)) {

			throw new ArithmeticException("You cannot divide by 0.");

		} else {

			this.total = operand / operand2;

		}
		return this.total;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator test = new Calculator();

		Scanner scanner = new Scanner(System.in);

		DecimalFormat df1 = new DecimalFormat("0.##");

		System.out.println("Welcome to the calculator app!");
		System.out.print("Please type in the first number: ");
		test.operand = scanner.nextDouble();
		System.out.print("Please print the second number: ");
		test.operand2 = scanner.nextDouble();
		System.out.print("Please print the operator (+, -, *, /): ");
		scanner.nextLine();
		test.operator = scanner.next();
		test.operator.replaceAll(" ", "");

		if (test.operator.equals("+")) {

			test.Add(test.operand, test.operand2);

		} else if (test.operator.equals("-")) {

			test.Subtract(test.operand, test.operand2);

		} else if (test.operator.equals("*")) {

			test.Multiply(test.operand, test.operand2);

		} else if (test.operator.equals("/")) {

			test.Divide(test.operand, test.operand2);

		}

		System.out.println(df1.format(test.total));

		scanner.close();

	}

}
