import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int min = 0;
		int sum;
		for (int i = N; i > 0 ; i--) {

			sum = 0;
			sum += i;
			String num = Integer.toString(i);

			for (int j = 0; j < num.length(); j++) {
				sum += Integer.parseInt(num.substring(j, j + 1));
			}

			if (sum == N) {
				min = i;
			}

		}
		System.out.println(min);
	}
}
