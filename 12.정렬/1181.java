import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;

		String[] s = new String[N];

		for (int i = 0; i < N; i++) {
			s[i] = br.readLine();
		}

		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				if (a.length() == b.length()) {
					return a.compareTo(b);
				} else {
					return a.length() - b.length();
				}
			}
		});

		bw.write(s[0] + "\n");
		
		for (int i = 1; i < N; i++) {
			if (!s[i].equals(s[i - 1])) {
				bw.write(s[i] + "\n");
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
