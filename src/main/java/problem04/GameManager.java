package problem04;

import java.util.ArrayList;

class Result {
	int score;
	long timeDuration;
	
	Result(int _score, long _timeDuration) {
		score = _score;
		timeDuration = _timeDuration;
	}
	
	String getResult() {
		return null;
	}
}

public class GameManager {
	ArrayList<Game> gameList;
	int userNum;
	
	GameManager(int _userNum) {
		userNum = _userNum;
		gameList = new ArrayList<>();
		for (int i = 0; i < _userNum; i++) {
			gameList.add(new Game());
		}
	}
	
	void startGame() {
		for (int i = 0; i < userNum; i++) {
			System.out.println((i+1) + "번 유저의 게임");
			gameList.get(i).generateProblems();
			gameList.get(i).start();
		}
		showResult();
	}
	
	void showResult() {
		for (int i = 0; i < userNum; i++) {
			int score = gameList.get(i).getScore();
			long timeDuration = gameList.get(i).getTimeDuration();
			System.out.println(score + " / " + (18 - score) + " 경과시간: " + timeDuration + "초");
		}
	}
}
