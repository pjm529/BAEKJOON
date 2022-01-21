import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken()); // 층
			int W = Integer.parseInt(st.nextToken()); // 호수
			int N = Integer.parseInt(st.nextToken()); // 사람 순번

			if (N % H == 0) {
				System.out.println((H * 100) + (N / H));

			} else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
		}

	}
}
