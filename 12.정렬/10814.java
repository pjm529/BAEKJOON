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

		String[][] human = new String[N][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			human[i][0] = st.nextToken();
			human[i][1] = st.nextToken();
		}

		Arrays.sort(human, new Comparator<String[]>() {

			@Override
			public int compare(String[] human1, String[] human2) {
				return Integer.parseInt(human1[0]) - Integer.parseInt(human2[0]);
			}
		});
		
		for (int i = 0; i < N; i++) {
			bw.write(human[i][0] + " " + human[i][1] + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
