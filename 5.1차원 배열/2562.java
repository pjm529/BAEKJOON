import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = -1;

		int a;
		int index = 0;
		for (int i = 0; i < 9; i++) {

			a = Integer.parseInt(br.readLine());

			if (a > max) {
				max = a;
				index = i + 1;
			}
		}

		System.out.println(max + "\n" + index);

		br.close();
	}
}
