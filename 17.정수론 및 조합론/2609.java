import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int i = 1;

		int max = 0;
		int min = 0;

		while (i <= N && i <= M) {

			if (N % i == 0 && M % i == 0)
				max = i;

			i++;
		}

		i = 1;

		while (true) {
			if (i % N == 0 && i % M == 0) {
				min = i;
				break;
			}

			i++;
		}

		bw.write(max + "\n");
		bw.write(min + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
