package Methods;

public class Scope {
	public static void main(String[] args) {
		{
			int a = 5;
			System.out.println(a);
		}
		{
			// Code here can not use a variable.
			int b = 4;
			System.out.println(b);
		}
		{
			// Code here can not use a and b variables.
		}
	}
}
