package com.revature.service;

public class ArithmeticService {

	public String doAddition(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double sum = number1 + number2;
		double dif = number1 - number2;
		double pro = number1 * number2;
		double div = number1 / number2;
		double mod = number1 % number2;

		String result1 = "The sum of the numbers is " + sum;
		String result2 = "The difference of the numbers is " + dif;
		String result3 = "The product of the numbers is " + pro;
		String result4 = "The quotient of the numbers is " + div;
		String result5 = "The modulus of the numbers is " + mod;

		// return (result1, result2, result3, result4, result5);
		String result = result1 + result2 + result3 + result4 + result5;
		//return result1;
		return result;
	}

}
