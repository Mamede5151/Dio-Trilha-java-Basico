package provadio.me;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);

		    // Usuário entrar com o primeiro comando de número
		    System.out.print("Insira o seu primeiro número: ");
		    double number1 = input.nextDouble();

		    // Prompt the user to enter the second number
		    System.out.print("Insira o segundo número: ");
		    double number2 = input.nextDouble();

		    // Prompt the user to enter the operation
		    System.out.print("Escolha o tipo de operação (+, -, *, /): ");
		    char operation = input.next().charAt(0);

		    double result = 0;

		    // Compute the result based on the operation
		    if (operation == '+') {
		      result = number1 + number2;
		    } else if (operation == '-') {
		      result = number1 - number2;
		    } else if (operation == '*') {
		      result = number1 * number2;
		    } else if (operation == '/') {
		      result = number1 / number2;
		    } else {
		      System.out.println("Operação inválida, tente novamente!");
		    }

		    // Display the result
		    System.out.println("O resultado é: " + result);
		  }
	}


