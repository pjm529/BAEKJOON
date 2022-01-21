import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String str = sc.next();

		int sum = 0;

		for (int i = 0; i < N; i++) {
			sum += Integer.parseInt(str.substring(i, i + 1));
		}

		System.out.println(sum);

	}
}
