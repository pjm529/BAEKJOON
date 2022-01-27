import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];

		// 입력되는 수는 -4000 ~ 4000 - > 8001
		int[] arr2 = new int[8001];
		double sum = 0;

		for (int i = 0; i < N; i++) {
			sum += arr[i] = Integer.parseInt(br.readLine());
			arr2[4000 + arr[i]]++;
		}

		Arrays.sort(arr);

		boolean flag = false;
		int max = 0;
		int idx = 0;

		for (int i = 0; i < 8001; i++) {

			// 빈도수가 현재 max 보다 클 경우
			if (arr2[i] > max) {
				max = arr2[i]; // max에 빈도수 입력
				idx = i; // 해당 index idx에 입력
				flag = true; // 최빈수 true

				// 이전에 빈도수가 같고 이전 최빈수가 있을 경우 -> 2번째 최빈수
			} else if (arr2[i] == max && flag == true) {
				idx = i;
				flag = false;
			}
		}

		bw.write((int) Math.round(sum / N) + "\n");
		bw.write(arr[N / 2] + "\n"); // N은 홀수만들어오므로 N/2 는 중앙
		bw.write(idx - 4000 + "\n");
		bw.write(arr[N - 1] - arr[0] + "\n"); // 최대값 - 최소값이 범위

		bw.flush();
		bw.close();
		br.close();

	}
}
