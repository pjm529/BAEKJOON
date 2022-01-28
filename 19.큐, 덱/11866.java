import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		Queue<Integer> Q = new LinkedList<>();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			Q.offer(i + 1);
		}
		bw.write("<");

		while (Q.size() > 1) {

			for (int i = 0; i < K - 1; i++) {
				Q.offer(Q.poll());
			}

			bw.write(Q.poll() + ", ");
		}
		bw.write(Q.poll() + ">");
		bw.flush();
		bw.close();
		br.close();
	}

}
