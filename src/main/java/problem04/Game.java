package problem04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Pair {
	int a;
	int b;
	Pair(int _a, int _b) {
		this.a = _a;
		this.b = _b;
	}
}

public class Game {
	ArrayList<Pair> problems;
	int current_problem_index = 0;
	int score = 0;
	long timeDuration = 0;
	
	ArrayList<Pair> generateProblems() {
		problems = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j < 2; j++) {
				int temp = new Random().nextInt(9) + 1;
				problems.add(new Pair(i, temp));
			}
		}
		return problems;
	}
	
	void start() {
		long startTime = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		System.out.println("게임을 시작합니다.");
		while (problems.size() != current_problem_index) {
			showProblem(current_problem_index, problems.get(current_problem_index));
			int answer = scanner.nextInt(); 
			if (isRightAnswer(problems.get(current_problem_index), answer)) {
				score++;
				System.out.println("정답!");
			} else {
				System.out.println("오답입니다.");
			}
			current_problem_index++;
		}
		long endTime = System.currentTimeMillis();
		timeDuration = (endTime - startTime) / 1000;
	}
	
	void showProblem(int current_problem_index, Pair pair) {
		System.out.println((current_problem_index + 1) + " 번 문제");
		System.out.println(pair.a + " x " + pair.b + " ?");
	}
	
	boolean isRightAnswer(Pair pair, int answer) {
		return pair.a * pair.b == answer;
	}
	
	int getScore() {
		return score;
	}
	
	long getTimeDuration() {
		return timeDuration;
	}
}
