import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		String sum = Integer.toString(A * B * C);

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < sum.length(); j++) {
				if (i == Integer.parseInt(sum.substring(j, j + 1))) {
					count++;
				}
			}
			bw.write(count + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
