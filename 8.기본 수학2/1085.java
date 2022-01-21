import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int c = (w - x);
		int d = (h - y);

		if (x <= y && x <= c && x <= d) {
			System.out.println(x);
		} else if (y <= x && y <= c && y <= d) {
			System.out.println(y);
		} else if (c <= x && c <= y && c <= d) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}
	}
}
