import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		if (str.length() == 1) {
			str = "0" + str;
		}
		int a = Integer.parseInt(str.substring(0, 1));
		int b = Integer.parseInt(str.substring(1, 2));
		int i = 0;
		int sum;
		String next;

		while (true) {

			sum = a + b;

			next = Integer.toString(sum);

			if (next.length() == 1) {
				next = "0" + next;
			}

			a = b;
			b = Integer.parseInt(next.substring(1, 2));

			i++;

			if (str.equals(Integer.toString(a) + Integer.toString(b)))
				break;
		}

		System.out.println(i);

	}
}
