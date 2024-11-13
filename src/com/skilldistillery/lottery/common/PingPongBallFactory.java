package com.skilldistillery.lottery.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PingPongBallFactory {

	public static PingPongBall createPPB(String label) {

		PingPongBall ball = new PingPongBall(label);

		return ball;
	}

	public static List<PingPongBall> createPPB(String label, int qty) {

		List<PingPongBall> balls = new ArrayList<PingPongBall>();
		for (int i = 0; i < qty; i++) {
			balls.add(createPPB(label));
		}

		return balls;
	}

	public static List<PingPongBall> createPPB(Map<String, Integer> labelList) {
		
		List<PingPongBall> balls = new ArrayList();
		
		
		Set<String> keySet = labelList.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Integer val = labelList.get(key);
//			System.out.println(key + " - " + val);
			balls.addAll(createPPB(key, val));
		}
		return balls;
	}
}
