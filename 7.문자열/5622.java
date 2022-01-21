import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String[] arr = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		int time = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].contains(str.substring(i, i + 1))) {
					time = time + j + 3;
				}
			}
		}
		
		System.out.println(time);

	}

}
