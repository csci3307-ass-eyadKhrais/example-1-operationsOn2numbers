/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

import java.util.Scanner;
import com.mycompany.basicmathoperations.oop.Multiply;

/**
 * @author ilker
 *
 */
public class MainEntry4oop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF main of MainEntry4oop with args:" + args);
		
		// get inputs
		Scanner scanner = new Scanner(System.in);
		float number1, number2;
		float resultMultiply, resultDivide, resultAdd, resultSubtract;

		// read number 1 and number 2 inputs
		System.out.println("Enter number 1");
		number1 = scanner.nextFloat();
		System.out.println("Enter number 2");
		number2 = scanner.nextFloat();
		
		// Multiply block
		Multiply multiplier = new MultiplyOperatorFor2numbers(number1, number2);
		resultMultiply = multiplier.multiply(number1, number2);
		System.out.printf("result of multiply(float, float) is %.2f%n", resultMultiply);
		resultMultiply = multiplier.multiply2numbers();
		System.out.printf("result of multiply2numbers() is %.2f%n", resultMultiply);
		
		Divide divide = new DivideOperationFor2Numbers(number1, number2);
		resultDivide = divide.divide(number1, number2);
		System.out.printf("result of divide(float, float) is %.2f%n", resultDivide);
		resultDivide = divide.divide2numbers();
		System.out.printf("result of divide2numbers() is %.2f%n", resultDivide);

		Addition addition = new AdditionOperationFor2Numbers(number1, number2);
		resultAdd = addition.add(number1, number2);
		System.out.printf("result of add(float, float) is %.2f%n", resultAdd);
		resultAdd = addition.add2numbers();
		System.out.printf("result of add2numbers() is %.2f%n", resultAdd);
		
		Subtraction subtraction = new SubtractionOperatorFor2numbers(number1, number2);
		resultSubtract = subtraction.subtract(number1, number2);
		System.out.printf("result of subtract(float, float) is %.2f%n", resultSubtract);
		resultSubtract = subtraction.subtract2numbers();
		System.out.printf("result of subtact2numbers() is %.2f%n", resultSubtract);
		
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("Multiplication result is %.2f%n", resultMultiply);
		System.out.printf("Division result is %.2f%n", resultDivide);
		System.out.printf("Addition result is %.2f%n", resultAdd);
		System.out.printf("Subtraction result is %.2f%n", resultSubtract);

		scanner.close();
	}

}
