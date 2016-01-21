package jp.kobe_u.cspiral.entity;

public class Ranking {

	private String id;

	private String gameMode;

	private String name;

	private String score;

	private int limitTime;

	public String getId() {
		return id;
	}

	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	public String getName() {
		return name;
	}

	public int getLimitTIme(){
		return limitTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public void setLimitTime(int limitTime){
		this.limitTime = limitTime;
	}



}
