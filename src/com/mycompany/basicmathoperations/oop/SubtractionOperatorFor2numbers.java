/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author eyad
 *
 */
public class SubtractionOperatorFor2numbers extends OperatorFor2numbers implements Subtraction {

	SubtractionOperatorFor2numbers(){};
	
	public SubtractionOperatorFor2numbers(float number1, float number2)
	{
		super(number1, number2);
		System.out.println("parent number1 is" + super.number1);
		System.out.println("class number2 is" + number1);

	};
	
	public SubtractionOperatorFor2numbers(float number1, float number2, String junk)
	{
		super(number1, number2);
		System.out.println("parent number1 is" + super.number1);
		System.out.println("class number2 is" + number1);	
		Float somejunk = this.subtract2numbers();
	};
	
	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public float subtract(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public float subtract2numbers() {
		// TODO Auto-generated method stub
		return number1 - number2;
	}

}
