package com.skilldistillery.lottery.common;

import java.util.ArrayList;
import java.util.List;

public class Hopper {

	private List<PingPongBall> pingPongBalls = new ArrayList<>();

//	public void randomize()	{
//		
//	}

	public PingPongBall pickBall() {
		int ballpicked = (int) (Math.random() * pingPongBalls.size());

		return pingPongBalls.remove(ballpicked);

	}

//	public void loadBall(PingPongBall ball) {
//		
//		
//	}
	public void loadBalls(List<PingPongBall> balls) {
		pingPongBalls.addAll(balls);
	}

}
