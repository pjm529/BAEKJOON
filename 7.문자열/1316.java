import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int count = 0;

		for (int i = 0; i < N; i++) {

			// 그룹단어 여부
			boolean tf = true;

			// 문자
			String str = br.readLine();

			// 알파벳 배열
			String[] arr = new String[str.length()];

			for (int j = 0; j < str.length(); j++) {

				if (j == 0) {
					arr[j] = str.substring(j, j + 1);
					continue;
				}

				if (str.substring(j, j + 1).equals(str.substring(j - 1, j))) {
					continue;
				}

				if (Arrays.asList(arr).contains(str.substring(j, j + 1))) {
					tf = false;
					break;
				}

				arr[j] = str.substring(j, j + 1);

			}

			if (tf) {
				count++;
			}
		}

		System.out.println(count);

	}
}
