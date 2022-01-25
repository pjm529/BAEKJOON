import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			int n = Integer.parseInt(br.readLine());

			int a, b;

			a = n / 2;
			b = n - a;

			while (true) {
				if (prime(a) && prime(b)) {
					break;
				}
				a--;
				b++;
			}

			bw.write(a + " " + b + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	public static boolean prime(int n) {

		int count = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				count++;
		}

		if (count != 1)
			return false;

		return true;

	}
}
