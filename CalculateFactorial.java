

import java.math.BigInteger;

public class CalculateFactorial
{
	
	private final int MAX_DISPLAY_DIGIT = 10;
	
	public static void main(String [] args){
		CalculateFactorial factorial = new CalculateFactorial();
		factorial.print(10);
		factorial.print(100);
		factorial.print(1000);
	}
	
	public void print(int num){
		if(num < 1){
			System.out.println("Cannot do factorial of number : " + num);
			return;
		}
		
		BigInteger calculated = BigInteger.valueOf(1);
		
		for(int i = 1; i<= num; i++){
			calculated = calculated.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Calculated Value : " + calculated);
		String printValue = calculated.toString();
		
		System.out.println(num + " -> " + (printValue.length() < MAX_DISPLAY_DIGIT ? printValue : printValue.substring(0,MAX_DISPLAY_DIGIT-1)));
	}

}