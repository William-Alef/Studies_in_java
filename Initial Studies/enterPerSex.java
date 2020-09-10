import java.io.IOException;
import java.util.Scanner;

class enterPerSex {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);

		String name;
		char sex;

		System.out.printf("Type your name: ");
			name = read.nextLine();

		System.out.printf("\nType your sex (M/W): ");
			sex = (char)System.in.read();

		System.out.print("\nResult:\n");
		if ((sex =='M') || (sex == 'm'))
			System.out.printf("Welcome Sr. \"%s\".\n", name);
		else System.out.printf("Welcome Mrs. \"%s\".\n", name);
	}

}	