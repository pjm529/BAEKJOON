import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] OX = new String[N];

		for (int i = 0; i < N; i++) {
			OX[i] = br.readLine();
		}

		for (int i = 0; i < N; i++) {

			int count = 0;
			int sum = 0;
			for (int j = 0; j < OX[i].length(); j++) {

				if (OX[i].substring(j, j + 1).equals("O")) {

					count += 1;

				} else {
					count = 0;
				}

				sum += count;
			}

			System.out.println(sum);
		}

		br.close();
	}
}
