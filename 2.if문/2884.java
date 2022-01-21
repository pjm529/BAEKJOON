import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m - 45 < 0) {
			if (h - 1 < 0) {
				System.out.println(24 - 1 + " " + (60 + (m - 45)));
			} else {
				System.out.println(h - 1 + " " + (60 + (m - 45)));
			}

		} else {
			System.out.println(h + " " + (m - 45));
		}
	}
}
