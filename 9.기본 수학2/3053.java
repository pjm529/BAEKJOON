import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double R = Double.parseDouble(br.readLine());

		bw.write(R * R * Math.PI + "\n");
		bw.write(2 * R * R + "\n");

		br.close();
		bw.flush();
		bw.close();
	}

}
