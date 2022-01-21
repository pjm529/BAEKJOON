import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		String A = st.nextToken();
		String chA = "";

		for (int i = 2; i >= 0; i--) {
			chA += A.substring(i, i + 1);

		}

		String B = st.nextToken();
		String chB = "";

		for (int i = 2; i >= 0; i--) {
			chB += B.substring(i, i + 1);

		}

		if (Integer.parseInt(chA) > Integer.parseInt(chB)) {
			System.out.println(chA);
		} else {
			System.out.println(chB);
		}

	}

}
