import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(A);

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < M; i++) {

			if (binarySearch(A, Integer.parseInt(st.nextToken())) >= 0)
				bw.write("1\n");
			else
				bw.write("0\n");

		}
		bw.flush();
		bw.close();
		br.close();
	}

	public static int binarySearch(int[] arr, int key) {

		int left = 0; // 탐색 범위의 왼쪽 끝 인덱스
		int right = arr.length - 1; // 탐색 범위의 오른쪽 끝 인덱스

		while (left <= right) {

			int mid = (left + right) / 2; // 중간위치를 구한다.

			// key값이 중간 위치의 값보다 작을 경우
			if (key < arr[mid]) {
				right = mid - 1;
			}
			// key값이 중간 위치의 값보다 클 경우
			else if (key > arr[mid]) {
				left = mid + 1;
			}
			// key값과 중간 위치의 값이 같을 경우
			else {
				return mid;
			}
		}

		// 찾고자 하는 값이 존재하지 않을 경우
		return -1;

	}
}
