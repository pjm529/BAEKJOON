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

		int[][] XY = new int[N][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			XY[i][0] = Integer.parseInt(st.nextToken());
			XY[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(XY, new Comparator<int[]>() {
			@Override
			public int compare(int[] XY1, int[] XY2) {
				if (XY1[1] == XY2[1]) {
					return XY1[0] - XY2[0];
				} else {
					return XY1[1] - XY2[1];
				}
			}
		});


		for (int i = 0; i < N; i++) {
			bw.write(XY[i][0] + " " + XY[i][1] + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
