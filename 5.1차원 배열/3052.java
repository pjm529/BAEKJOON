import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];
		int count = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}

		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 42;
				}
			}

		}

		for (int i = 0; i < 10; i++) {
			if (arr[i] != 42) {
				count++;
			}
		}

		System.out.println(count);
	}
}
