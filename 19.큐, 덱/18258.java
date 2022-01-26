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



// ==================================================== Queue 라이브러리 활용 ======================================================
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
//import java.util.Deque;
//import java.util.ArrayDeque;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//
//		Deque<Integer> q = new ArrayDeque<>();
//
//		int N = Integer.parseInt(br.readLine());
//
//		StringTokenizer command;
//
//		while (N-- > 0) {
//			command = new StringTokenizer(br.readLine(), " "); // 문자열 분리
//
//			switch (command.nextToken()) {
//
//			case "push":
//				// offer는 큐의 맨 뒤에 요소를 추가한다.
//				q.offer(Integer.parseInt(command.nextToken()));
//				break;
//
//			case "pop":
//				/*
//				 * poll은 가장 앞에 있는 요소를 삭제하며 삭제할 원소가 없을 경우 예외를 던지는 것이 아닌 null을 반환한다.
//				 */
//				Integer item = q.poll();
//				if (item == null) {
//					sb.append(-1).append('\n');
//				} else {
//					sb.append(item).append('\n');
//				}
//				break;
//
//			case "size":
//				sb.append(q.size()).append('\n');
//				break;
//
//			case "empty":
//				if (q.isEmpty()) {
//					sb.append(1).append('\n');
//				} else {
//					sb.append(0).append('\n');
//				}
//				break;
//
//			case "front":
//				// peek()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
//				Integer ite = q.peek();
//				if (ite == null) {
//					sb.append(-1).append('\n');
//				} else {
//					sb.append(ite).append('\n');
//				}
//				break;
//
//			case "back":
//				// peekLast()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
//				Integer it = q.peekLast();
//				if (it == null) {
//					sb.append(-1).append('\n');
//				} else {
//					sb.append(it).append('\n');
//				}
//				break;
//			}
//		}
//		System.out.println(sb);
//	}
//}
