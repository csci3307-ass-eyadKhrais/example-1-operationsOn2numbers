/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author eyad
 *
 */
public class AdditionOperationFor2Numbers extends OperatorFor2numbers implements Addition {

	AdditionOperationFor2Numbers(){};
	
	public AdditionOperationFor2Numbers(float number1, float number2)
	{
		super(number1, number2);
		System.out.println("parent number1 is" + super.number1);
		System.out.println("class number2 is" + number1);

	};
	
	public AdditionOperationFor2Numbers(float number1, float number2, String junk)
	{
		super(number1, number2);
		System.out.println("parent number1 is" + super.number1);
		System.out.println("class number2 is" + number1);	
		Float somejunk = this.add2numbers();
	};
	
	@Override
	public float add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public float add(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public float add2numbers() {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

}
