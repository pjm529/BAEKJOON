import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		int floor = 1; // 층수
		int min = 2; // 층수의 최소값 1층부터 시작.(1층 범위는 2~7)

		// 1~1가는건 1로 끝
		if (N == 1) {
			System.out.println("1");
		} else {

			// 찾아가려는 주소가 해당 층수 + 1의 최소값 보다 작을 때 까지
			while (min <= N) {
				min = min + (6 * floor); // 다음 층의 최소값으로 초기화
				floor++; // 다음 층
			}
			System.out.println(floor);
		}

	}
}
