import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());

		for (int i = 0; i < C; i++) {

			double count = 0;
			double sum = 0;
			double avg = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			// 입력할 성적 수
			int N = Integer.parseInt(st.nextToken());

			// 성적 배열
			double[] scoreArr = new double[N];

			for (int j = 0; j < N; j++) {

				double score = Integer.parseInt(st.nextToken());

				// 성적 입력
				scoreArr[j] = score;

				// sum 추가
				sum += score;

			}

			for (int k = 0; k < N; k++) {
				if ((sum / N) < scoreArr[k]) {
					count++;
				}
			}

			avg = count / N * 100;

			avg = (Math.round(avg * 1000)) / 1000.0;

			System.out.printf("%.3f%%\n", avg);
		}
	}
}
