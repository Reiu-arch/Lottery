package com.skilldistillery.lottery.nbadraft;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DraftSimulator {
		NBA nba = new NBA();
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DraftSimulator app = new DraftSimulator();
		int numTimes = 0;
		System.out.println("How many drafts would you like to do?");
		numTimes = sc.nextInt();
		
		app.runSimulations(numTimes);
		
		
	}

	private void runSimulations(int numTimes) {
		Map<String,Integer> weeners = new HashMap<>();
		
		String weener;
		
		for (int i = 0; i < numTimes; i++) {
		weener = nba.runDraft();
		printWinner(weener);
		if (weeners.containsKey(weener)){
			int victoryCount = weeners.get(weener);
			weeners.replace(weener, ++victoryCount);
		} else {
			weeners.put(weener, 1);
		}
		}
	System.out.println(weeners);
	}
	
	
	private void printWinner(String weener) {
		System.out.println(weener + " Has Won!!!");
	}

}
