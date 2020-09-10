import java.util.Scanner;

	public class Calculator {

	public static void main(String[] args) {
	Scanner read = new Scanner (System.in);
	int a, b;

		System.out.printf("Type a number: ");
		a = read.nextInt();

		System.out.printf("Other number: ");
		b = read.nextInt();

		System.out.printf("\nResult: \n");
		System.out.printf("\n%d + %d = %3d\n", a, b, (a + b));
		System.out.printf("\n%d - %d = %3d\n", a, b, (a - b));
		System.out.printf("\n%d * %d = %3d\n", a, b, (a * b));
		System.out.printf("\n%d / %d = %3d (Division)\n", a ,b, (a / b));
		System.out.printf("\n%d / %d = %6.2f (The remainder of the division)\n", a, b, ((double)a / b));
	}			
}
