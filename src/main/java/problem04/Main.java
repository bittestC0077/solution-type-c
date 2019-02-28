package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("유저 수를 입력해주세요.");
		int userNum = scanner.nextInt();
		GameManager gameManager = new GameManager(userNum);
		gameManager.startGame();
	}
}