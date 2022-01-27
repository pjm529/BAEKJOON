import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static char[][] white = new char[8][8];
	public static char[][] black = new char[8][8];

	public static void main(String[] args) throws IOException {

		// 체스판 생성
		makeBoard();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		char[][] board = new char[N][M];

		int min = 65;

		// 보드 입력받기
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < M; j++) {
				board[i][j] = input.charAt(j);
			}
		}

		for (int i = 0; i < N - 7; i++) {

			for (int j = 0; j < M - 7; j++) {

				if (min > check(i, j, board))
					min = check(i, j, board);
			}

		}

		System.out.println(min);
	}

	// 체크
	public static int check(int x, int y, char[][] board) {

		int whiteCount = 0; // white 체스판이랑 비교했을 때
		int blackCount = 0; // black 체스판이랑 비교했을 때

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {
				if (white[i][j] != board[x + i][y + j])
					whiteCount++;

				if (black[i][j] != board[x + i][y + j])
					blackCount++;
			}
		}

		// 둘 중 더 작은 값을 return
		return (whiteCount <= blackCount) ? whiteCount : blackCount;
	}

	// 체스판 만들기
	public static void makeBoard() {
		boolean flag = true;

		// white
		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {
				if (flag) {
					white[i][j] = 'W';
				} else {
					white[i][j] = 'B';
				}
				flag = !flag;
			}
			flag = !flag;
		}

		flag = !flag;

		// black
		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8; j++) {
				if (flag) {
					black[i][j] = 'W';
				} else {
					black[i][j] = 'B';
				}
				flag = !flag;
			}
			flag = !flag;
		}
	}
}
