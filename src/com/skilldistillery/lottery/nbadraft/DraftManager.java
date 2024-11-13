package com.skilldistillery.lottery.nbadraft;

import java.util.Map;

import com.skilldistillery.lottery.common.Hopper;
import com.skilldistillery.lottery.common.PingPongBallFactory;

public class DraftManager {
	
	private Hopper grassHopper;
	
	public DraftManager(Map<String,Integer> teamList) {
		
		grassHopper = new Hopper();
		
		grassHopper.loadBalls(PingPongBallFactory.createPPB(teamList));
	}
	
	public String selectWinner() {
		
		
		return grassHopper.pickBall().getLabel();
	}
}
