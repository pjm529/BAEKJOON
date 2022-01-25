import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		bw.write(check(N) + "\n");
		br.close();
		bw.flush();
		bw.close();
	}

	public static int check(int N) {

		int cnt = 0;

		if (N < 100) {

			return N;

		} else {
			cnt = 99;

			if (N == 1000)
				N = 999;

			for (int i = 100; i < N + 1; i++) {
				int h = i / 100;
				int t = (i / 10) % 10;
				int o = i % 10;

				if ((h - t) == (t - o)) {
					cnt++;
				}
			}

		}
		return cnt;
	}

}
