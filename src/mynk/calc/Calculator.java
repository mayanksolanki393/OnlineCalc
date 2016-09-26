package mynk.calc;

public class Calculator {
	public static double add(double num1,double num2){
		return num1 + num2;
	}
	
	public static double subtract(double num1,double num2){
		return num1 - num2;
	}

	public static double multiply(double num1,double num2){
		return num1 * num2;
	}
	
	public static double divide(double num1,double num2) throws Exception{
		if(num2 == 0.0){
			throw new Exception("divide by zero");			
		}
		return num1 / num2;
	}
	
	
}
