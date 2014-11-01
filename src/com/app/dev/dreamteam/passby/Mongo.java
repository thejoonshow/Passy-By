package com.app.dev.dreamteam.passby;

import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Mongo {
	
	private String URI = "mongodb://heroku_app31185285:bq7pjcjnp9i0aaolc087u968hr@ds047950.mongolab.com:47950/heroku_app31185285";
	private MongoClient mc;
	private DB db;
	
	public Mongo() { 
		MongoClientURI uri = new MongoClientURI(URI);
		try {
			mc = new MongoClient(uri);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db = mc.getDB("heroku_app31185285");
	}
	
	public String test() {
		DBCollection coll = db.getCollection("visitor");
		
		BasicDBObject doc = new BasicDBObject();
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone("America/New_York"));

		doc.append("ts", df.format(new Date()));
		coll.insert(doc);
		return "hello";
	}
}
