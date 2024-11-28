package jspday1.task;

import java.util.ArrayList;

public class CricketPlayer {
	String name;
	int birthYear;
	int age;
	int currentYear=2024;
	ArrayList<Integer> scores;
	public CricketPlayer(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
		this.age=calculateAge();
		this.scores=new ArrayList<Integer>();
	}
	public void addScore(int score) {
		scores.add(score);
	}
	
	public int calculateAge() {
		return age=currentYear-birthYear;
		
	}
	@Override
	public String toString() {
		return "CricketPlayer [name=" + name + ", birthYear=" + birthYear + ", age=" + age + ", score=" + scores + "]";
	}
	
	

}
