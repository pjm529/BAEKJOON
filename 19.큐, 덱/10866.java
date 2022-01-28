import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		Deque<Integer> Q = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {

			case "push_front":
				Q.offerFirst(Integer.parseInt(st.nextToken()));
				break;

			case "push_back":
				Q.offerLast(Integer.parseInt(st.nextToken()));
				break;

			case "pop_front":
				Integer item = Q.pollFirst();

				if (item == null)
					bw.write(-1 + "\n");
				else
					bw.write(item + "\n");
				break;

			case "pop_back":
				Integer item2 = Q.pollLast();

				if (item2 == null)
					bw.write(-1 + "\n");
				else
					bw.write(item2 + "\n");
				break;

			case "size":
				bw.write(Q.size() + "\n");
				break;

			case "empty":
				if (Q.isEmpty())
					bw.write(1 + "\n");
				else
					bw.write(0 + "\n");
				break;

			case "front":
				Integer item3 = Q.peekFirst();
				if (item3 == null)
					bw.write(-1 + "\n");
				else
					bw.write(item3 + "\n");
				break;

			case "back":
				Integer item4 = Q.peekLast();
				if (item4 == null)
					bw.write(-1 + "\n");
				else
					bw.write(item4 + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
