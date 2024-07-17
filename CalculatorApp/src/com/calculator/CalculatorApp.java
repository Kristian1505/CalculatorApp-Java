package com.calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("***** CALCULATOR *****");

			// Show Menu
			System.out.println("""
					 __________________
					|1. Addition       |
					|2. Subtraction    |
					|3. Multiplication |
					|4. Division       |
					|5. Exit           |
					*------------------*
					""");

			System.out.print("Select an option: ");
			try {
				int option = Integer.parseInt(sc.nextLine());
				if (option >= 1 && option <= 4) {
					double firstOperand = 0;
					double secondOperand = 0;
					boolean validOperand = false;
					while (!validOperand) {
						try {
							System.out.print("Enter the first operand: ");
							firstOperand = Double.parseDouble(sc.nextLine());

							System.out.print("Enter the second operand: ");
							secondOperand = Double.parseDouble(sc.nextLine());

							validOperand = true;
						} catch (Exception e) {
							System.out	.println("Invalid input. Only numbers are valid.");
						} // End of try catch
					} // End of while loop
					double result;

					switch (option) {
					case 1:
						result = firstOperand + secondOperand;
						System.out.println("Result: " + firstOperand + " + " + secondOperand + " = " + result);
						break;
					case 2:
						result = firstOperand - secondOperand;
						System.out.println("Result: " + firstOperand + " - " + secondOperand + " = " + result);
						break;
					case 3:
						result = firstOperand * secondOperand;
						System.out.println("Result: " + firstOperand + " * " + secondOperand + " = " + result);
						break;
					case 4:
						result = firstOperand / secondOperand;
						if (secondOperand != 0) {
						System.out.println("Result: " + firstOperand + " / " + secondOperand + " = " + result);
						} else {System.out.println("Error: Division by zero is not allowed.");}
						break;
					default:
						System.out.println("Error: " + option);

					}
				} else if (option == 5) {
					System.out.println("See you soon...");
					break;
				} else {
					System.out.println("Invalid option: " + option);
				}
				;
				System.out.println();
			} catch (Exception e) {
				System.out.println("Select a number from 1 to 5 ");
			} // End of try catch
		} // End of while loop
		sc.close();
	} // End of main method
} // End of CalculatorApp class