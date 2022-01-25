import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int i = 2;

		while (true) {

			if (i > N || N == 1) {
				break;
			}

			if (N % i == 0) {
				N = N / i;
				bw.write(i + "\n");
				continue;
			}
			i++;
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
