import java.util.Scanner;

public class Main {
	private final static int age = 2;
	public static final String name = "Main";

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		scan();
		System.out.println("Adios mundo");
	}

	private static void scan() {
		Scanner scanner = new Scanner(System.in);
		scanner.next();
	}


}
