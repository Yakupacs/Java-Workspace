package Methods;

public class MethodOverloading {
	static int sum(int num1, int num2)
	{
		return (num1 + num2);
	}
	static double sum(int num1, double num2)
	{
		return ((double)num1 + num2);
	}
	static double sum(double num1, double num2)
	{
		return (num1 + num2);
	}
	public static void main(String[] args) {
		System.out.println(sum(5, 5));	
		System.out.println(sum(5, 5.2));	
		System.out.println(sum(5.3, 5.2));	
	}
}
