package ControlStatements;

public class WhileLoop {
	public static void main(String[] args) {
		int i = 1;
		
		while (true)
		{
			System.out.println("Hey, I am " + i + " years old!");
			i += 1;
			if (i == 82)
			{
				System.out.println("Hey, I am going to...");
				break;
			}
		}

		i = 1;
		do {
			System.out.println(i);
			i++;
		}
		while (i != 5);
	}
}
