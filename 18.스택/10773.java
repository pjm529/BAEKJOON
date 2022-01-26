import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static int[] stack;
	public static int idx = 0; // 다음 원소가 들어갈 idx번호

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int K = Integer.parseInt(br.readLine());
		int code;
		stack = new int[K];

		for (int i = 0; i < K; i++) {
			code = Integer.parseInt(br.readLine());

			if (code == 0) {
				pop();
			} else {
				push(code);
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i < K; i++) {
			sum += stack[i];
		}
		
		bw.write(sum + " ");
		bw.flush();
		bw.close();
		br.close();

	}

	// push
	public static void push(int X) {
		stack[idx] = X;
		idx++;
	}

	// pop
	public static int pop() {
		// 아무것도 들어있지 않을 때
		if (idx == 0) {
			return -1;
		}

		else {
			// 현재 idx 는 다음 X가 들어갈 위치이기에 idx-1이 마지막 X
			int X = stack[idx - 1];
			stack[idx - 1] = 0; // 0으로 초기화
			idx--;
			return X;
		}
	}

	// size
	public static int size() {
		return idx;
	}

	// empty
	public static int empty() {
		if (idx == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	// top
	public static int top() {
		if (idx == 0) {
			return -1;
		} else {
			// 현재 idx 는 다음 X가 들어갈 위치이기에 idx-1이 마지막 X
			return stack[idx - 1];
		}
	}
}
