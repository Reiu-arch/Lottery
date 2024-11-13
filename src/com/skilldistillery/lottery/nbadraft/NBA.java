package com.skilldistillery.lottery.nbadraft;

import java.util.HashMap;
import java.util.Map;

public class NBA {
		private DraftManager manager;
		
		private Map<String,Integer> teamList = new HashMap<>();
		
		
	public String runDraft()	{
		
		
		
		teamList.put("Striped Kamikaze", 250);
		teamList.put("Bratwurst", 156);
		teamList.put("Loco Explorers", 199);
		teamList.put("Gutter Balls", 119);
		teamList.put("Benchwarmer Battalion", 88);
		teamList.put("Avengers", 63);
		teamList.put("Titans", 43);
		teamList.put("Legends", 28);
		teamList.put("Tinkers", 17);
		teamList.put("Meltdown", 11);
		teamList.put("Traveling Circus", 8);
		teamList.put("Denizens", 7);
		teamList.put("Rebounding Ruins", 6);
		teamList.put("Coaching Catastrophe", 5);
		
		manager = new DraftManager(teamList);
		
		return manager.selectWinner();
		
		
	}
	
}
