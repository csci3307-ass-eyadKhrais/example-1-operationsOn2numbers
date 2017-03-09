package com.mycompany.basicmathoperations.oop;


public class DivideOperationFor2Numbers extends OperatorFor2numbers implements Divide{

	public DivideOperationFor2Numbers(){};
	
	public DivideOperationFor2Numbers(float number1, float number2)
	{
		super(number1, number2);
		System.out.println("parent number1 is" + super.number1);
		System.out.println("class number2 is" + number1);

	};
	
	public DivideOperationFor2Numbers(float number1, float number2, String junk)
	{
		super(number1, number2);
		System.out.println("parent number1 is" + super.number1);
		System.out.println("class number2 is" + number1);	
		Float somejunk = this.divide();
	};
	
	@Override
	public float divide(int num1, int num2) {
		return num1/num2;
	}

	@Override
	public float divide(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

	@Override
	public float divide() {
		// TODO Auto-generated method stub
		return number1*number2;
	}

}
