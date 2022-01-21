import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int R = Integer.parseInt(st.nextToken());

			String S = st.nextToken();

			for (int k = 0; k < S.length(); k++) {
				for (int j = 0; j < R; j++) {
					bw.write(S.substring(k, k + 1));
				}
			}
			
			bw.write("\n");

		}
		bw.flush();
		bw.close();
		br.close();

	}

}
