package cog.cts.twentsix.lambda;

public class CalculateLambda {
	public static void main(String[] args) {

		Find add = (a,b) -> a+b;
		System.out.println(add.calculate(5, 3));
		Find sub = (a,b) -> a-b;
		System.out.println(sub.calculate(5, 3));
		Find multiply = (a,b) -> a*b;
		System.out.println(multiply.calculate(5, 3));
		Find divide = (a,b) -> a/b;
		System.out.println(divide.calculate(5, 3));
}
}
@FunctionalInterface   //to make sure it has only one method
 interface Find
 {
	double calculate(double a, double b);
	 

}
