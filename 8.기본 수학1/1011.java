import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;

		int x, y;
		int distance;
		int max;
		int count;
		for (int i = 0; i < T; i++) {

			st = new StringTokenizer(br.readLine(), " ");

			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			distance = y - x;

			max = (int) Math.sqrt(distance);

			if (max == Math.sqrt(distance)) {
				count = 2 * max - 1;
			} else if (distance <= Math.pow(max, 2) + max) {
				count = 2 * max;
			} else {
				count = 2 * max + 1;
			}
			
			bw.write(count + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
