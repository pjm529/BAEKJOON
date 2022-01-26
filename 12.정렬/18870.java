import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int rank = 0;
		int[] origin = new int[N];
		int[] sorted = new int[N];
		HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(sorted);

		for (int key : sorted) {
			if (!rankMap.containsKey(key)) {
				rankMap.put(key, rank);
				rank++;
			}
		}

		for (int key : origin) {
			int ranking = rankMap.get(key);
			bw.write(ranking + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
