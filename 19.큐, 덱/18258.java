import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static int[] queue;
	public static int lastIdx = 0; // 다음 원소가 들어갈 idx번호
	public static int firstIdx = 0; // 가장 먼저 빠질 idx 번호

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		queue = new int[N];

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				bw.write(pop() + "\n");
				break;
			case "size":
				bw.write(size() + "\n");
				break;
			case "empty":
				bw.write(empty() + "\n");
				break;
			case "front":
				bw.write(front() + "\n");
				break;
			case "back":
				bw.write(back() + "\n");
				break;
			}

		}

		bw.flush();
		bw.close();
		br.close();

	}

	// push
	public static void push(int X) {
		queue[lastIdx] = X;
		lastIdx++;
	}

	// pop
	public static int pop() {

		// 아무것도 들어있지 않을 때
		if (firstIdx == lastIdx) {
			return -1;
		}

		else {
			int X = queue[firstIdx];
			queue[lastIdx] = 0; // 0으로 초기화
			firstIdx++;
			return X;
		}
	}

	// size
	public static int size() {
		return lastIdx - firstIdx;
	}

	// empty
	public static int empty() {
		if (firstIdx == lastIdx) {
			return 1;
		} else {
			return 0;
		}
	}

	// front
	public static int front() {
		if (firstIdx == lastIdx) {
			return -1;
		} else {
			return queue[firstIdx];
		}
	}

	// back
	public static int back() {
		if (firstIdx == lastIdx) {
			return -1;
		} else {
			return queue[lastIdx - 1];
		}
	}
}
