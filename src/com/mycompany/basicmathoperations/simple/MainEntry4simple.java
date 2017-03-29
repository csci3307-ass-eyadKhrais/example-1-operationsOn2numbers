/**
 * 
 */
package com.mycompany.basicmathoperations.simple;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ilker
 *
 */
public class MainEntry4simple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF main of MainEntry4simple with args:" + args);
		System.out.println("still main of MainEntry4simple with args:" + Arrays.toString(args));
		
		// get inputs
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		float resultMultiply, resultDivide, resultAdd, resultSubtract;
		// read number 1 and number 2 inputs
		System.out.println("Enter number 1");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2");
		number2 = scanner.nextInt();
		
		// Multiply block
		Multiply multiplier = new Multiply();
		resultMultiply = multiplier.multiply(number1, number2);
		
		Divide divide = new Divide();
		resultDivide = divide.divide(number1, number2);
		
		Addition addition = new Addition();
		resultAdd = addition.addition(number1, number2);
		
		Subtraction subtraction = new Subtraction();
		resultSubtract = subtraction.subtraction(number1, number2);
		
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("Multiplication result is %.2f%n", resultMultiply);
		System.out.printf("Division result is %.2f%n", resultDivide);
		System.out.printf("Addition result is %.2f%n", resultAdd);
		System.out.printf("Subtraction result is %.2f%n", resultSubtract);

		scanner.close();
	}

}
