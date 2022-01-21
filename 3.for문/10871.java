import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int A;
		for (int i = 0; i < N; i++) {
			A = Integer.parseInt(st.nextToken());

			if (A < X) {
				bw.write(A + " ");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
