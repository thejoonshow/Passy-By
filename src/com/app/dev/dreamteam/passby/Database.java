package com.app.dev.dreamteam.passby;

import java.util.HashMap;

public class Database {
	public Database() {
		
	}
	
	public void addUser(String u, String p, String firstName, String lastName) {
		
	}
	
	public int addCount(int toUserID, int fromUserID, int number) {
		int count = 0;
		return count;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public HashMap getUser(int userID) {
		HashMap hm = new HashMap();
		hm.put("username", "kenneth22");
		hm.put("firstName", "Kenneth");
		hm.put("lastName", "Rhee");
		HashMap count = new HashMap();
		count.put("Robert", 5);
		hm.put("count", count);
		return hm;
	}
}
