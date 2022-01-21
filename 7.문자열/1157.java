import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		str = str.toLowerCase();

		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			arr[str.substring(i, i + 1).charAt(0) - 'a']++;
		}

		int max = -1;
		char c = '?';

		for (int i = 0; i < 26; i++) {

			if (max == arr[i]) {
				c = '?';
			}

			if (max < arr[i]) {
				max = arr[i];
				c = (char) (i + 65);
			}
		}

		System.out.println(c);

	}

}
