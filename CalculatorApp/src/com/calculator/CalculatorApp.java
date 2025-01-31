package com.calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner sc = new Scanner(System.in);

		// Loop to keep the calculator running until the user decides to exit
		while (true) {
			System.out.println("***** CALCULATOR *****");

			// Show Menu
			showMenu();

			try {

				int option = Integer.parseInt(sc.nextLine());
				if (option >= 1 && option <= 4) {
					// Calculate
					calculate(option, sc);
				} else if (option == 5) {
					System.out.println("See you soon...");
					break;
				} else {
					System.out.println("Invalid option: " + option);
				}
				System.out.println();
			} catch (Exception e) {
				System.out.println("Select a number from 1 to 5 ");
			} // End of try catch
		} // End of while loop
		sc.close();
	} // End of main method

	// Method to display the menu
	private static void showMenu() {
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
	} // End of showMenu method

	// Method to perform calculations based on the selected option
	private static void calculate(int option, Scanner sc) {
		double firstOperand = 0;
		double secondOperand = 0;
		boolean validOperand = false;

		// Loop to ensure valid operands are entered
		while (!validOperand) {
			try {
				System.out.print("Enter the first operand: ");
				firstOperand = Double.parseDouble(sc.nextLine());

				System.out.print("Enter the second operand: ");
				secondOperand = Double.parseDouble(sc.nextLine());

				validOperand = true;
			} catch (Exception e) {
				System.out.println("Invalid input. Only numbers are valid.");
			} // End of try catch
		} // End of while loop
		double result;

		// Perform the selected calculation
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
			// Ensure division by zero is not performed
			if (secondOperand != 0) {
				result = firstOperand / secondOperand;
				System.out.println("Result: " + firstOperand + " / " + secondOperand + " = " + result);
			} else {
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;
		default:
			System.out.println("Error: " + option);

		} // End of calculate

	} // End of calculate method
} // End of CalculatorApp class