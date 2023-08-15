package Methods;

public class Recursion {
	static void come(int i)
	{
		System.out.println("Hey: I am " + i);
		i--;
		if (i != 0)
			come(i);
	}
	public static void main(String[] args) {
		int i = 10;
		come(i);
	}
}
