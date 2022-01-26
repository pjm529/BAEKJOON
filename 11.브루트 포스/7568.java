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
		int N = Integer.parseInt(br.readLine());

		int[][] human = new int[N][3];

		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			human[i][0] = Integer.parseInt(st.nextToken());
			human[i][1] = Integer.parseInt(st.nextToken());
			human[i][2] = 1;
		}

		for (int i = 0; i < N; i++) {

			for (int j = i + 1; j < N; j++) {

				if (human[i][0] > human[j][0] && human[i][1] > human[j][1]) {
					
					human[j][2]++;
					
				} else if (human[i][0] < human[j][0] && human[i][1] < human[j][1]) {
					human[i][2]++;
				}

			}

		}

		for (int i = 0; i < N; i++) {
			bw.write(human[i][2] + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
