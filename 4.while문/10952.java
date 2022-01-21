import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		int A;
		int B;

		while (true) {
			st = new StringTokenizer(br.readLine() + " ");

			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			if (A == 0 && B == 0)
				break;

			bw.write(A + B + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
