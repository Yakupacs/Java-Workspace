import java.util.Scanner;

public class Calculator {
	public static void calc()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double number1 = scanner.nextDouble();

		System.out.println("Enter the second number: ");
		double number2 = scanner.nextDouble();

		System.out.println("Choose:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.print("İşlem seçeneğini girin (1/2/3/4): ");

		int choose = scanner.nextInt();

		double result = 0;

		switch (choose) {
			case 1:
				result = number1 + number2;
				break;
			case 2:
				result = number1 - number2;
				break;
			case 3:
				result = number1 * number2;
			case 4:
				if (number2 != 0)
					result = number1 / number2;
				else
				{
					System.out.println("Error!");
					scanner.close();
					return;
				}
				break;
			default:
				System.out.println("Invalid input!");
				break;
		}

		System.out.println("Result: " + result);
		scanner.close();
	}
	public static void main(String[] args)
	{
		try {
			while (true)
			{
				calc();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
