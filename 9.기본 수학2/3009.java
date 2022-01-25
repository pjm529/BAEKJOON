import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] XY1 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

		st = new StringTokenizer(br.readLine(), " ");

		int[] XY2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

		st = new StringTokenizer(br.readLine(), " ");

		int[] XY3 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

		int x, y;

		if (XY1[0] == XY2[0]) {
			x = XY3[0];
		} else if (XY1[0] == XY3[0]) {
			x = XY2[0];
		} else {
			x = XY1[0];
		}

		if (XY1[1] == XY2[1]) {
			y = XY3[1];
		} else if (XY1[1] == XY3[1]) {
			y = XY2[1];
		} else {
			y = XY1[1];
		}

		bw.write(x + " " + y);

		br.close();
		bw.flush();
		bw.close();
	}

}
