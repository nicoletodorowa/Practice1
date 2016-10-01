import java.util.Scanner;

public class Practice001 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input first line:");
		String x1 = scanner.nextLine();
		System.out.println("Input second line:");
		String x2 = scanner.nextLine();
		scanner.close();
		x1 = x1.concat(" ").concat(x2);
		
		System.out.println(x1);
		
	}

}
