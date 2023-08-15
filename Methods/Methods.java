package Methods;

public class Methods {
	static void myMethod()
	{
		System.out.println("I just got executed!");
	}
	static String myStringFunc()
	{
		return ("Hello World! I am coming from myStringFunc");
	}
	static int myIntFunc()
	{
		return 42;
	}
	static int sum(int num1, int num2)
	{
		return (num1 + num2);
	}
	static String getFullName(String name, String surname)
	{
		return (name + " " + surname);
	}
	public static void main(String[] args)
	{
		myMethod();
		System.out.println(myStringFunc());
		System.out.println(myIntFunc());
		System.out.println(sum(3, 4));
		System.out.println(getFullName("Yakup", "Açış"));
	}
}
