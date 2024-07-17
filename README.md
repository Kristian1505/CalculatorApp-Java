# CalculatorApp 📱🧮

Welcome to the **CalculatorApp**! This is a simple command-line calculator application written in Java. It allows you to perform basic arithmetic operations like addition, subtraction, multiplication, and division.

## Features 🌟

- Addition ➕
- Subtraction ➖
- Multiplication ✖️
- Division ➗
- Exit option to terminate the application 🚪

## How to Use 🚀

1. **Clone the repository**:
   ```sh
   git clone git@github.com/Kristian1505/CalculatorApp-Java.git
   ```
2. **Navigate to the project directory**:
   ```sh
   cd CalculatorApp
   ```
3. **Compile the Java file**:
   ```sh
   javac src/com/calculator/CalculatorApp.java
   ```
4. **Run the application**:
   ```sh
   java -cp src com.calculator.CalculatorApp
   ```

## Code Overview 📝

The application starts by displaying a menu with options for different arithmetic operations and an exit option. Users can input their choice and provide the necessary operands to perform the calculation.

### Main Method

The `main` method initializes the Scanner object and runs a loop to keep the calculator running until the user decides to exit.

### showMenu Method

The `showMenu` method displays the available options for arithmetic operations.

### calculate Method

The `calculate` method performs the chosen arithmetic operation based on user input and handles potential errors like invalid input or division by zero.

## Example Usage 💻

```sh
***** CALCULATOR *****
 __________________
|1. Addition       |
|2. Subtraction    |
|3. Multiplication |
|4. Division       |
|5. Exit           |
*------------------*

Select an option: 1
Enter the first operand: 10
Enter the second operand: 5
Result: 10.0 + 5.0 = 15.0
```

## Error Handling ⚠️

- **Invalid Option**: Prompts the user to select a valid option from 1 to 5.
- **Invalid Operand**: Ensures that only numeric values are entered.
- **Division by Zero**: Handles the error gracefully and notifies the user.

## Contributing 🤝

Contributions are welcome! Feel free to open issues or submit pull requests for improvements or bug fixes.

Made with ❤️ by Kristian
