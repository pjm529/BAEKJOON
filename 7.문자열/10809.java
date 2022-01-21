import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String S = br.readLine();

		for (int j = 97; j < 123; j++) {

			int idx = -1;

			for (int i = 0; i < S.length(); i++) {
				if (j == (int) S.substring(i, i + 1).charAt(0)) {
					idx = i;
					break;
				}
			}
			bw.write(idx + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
