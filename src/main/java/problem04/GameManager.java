package problem04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		File file = new File("/result.txt");
		
		for (int i = 0; i < userNum; i++) {
			int score = gameList.get(i).getScore();
			long timeDuration = gameList.get(i).getTimeDuration();	
//			try {
//				FileWriter fw = new FileWriter(file);
//				fw.write(score + " / " + (18 - score) + " 경과시간: " + timeDuration + "초 \n");
//				fw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			System.out.println(score + " / " + (18 - score) + " 경과시간: " + timeDuration + "초");
		}
	}
}
