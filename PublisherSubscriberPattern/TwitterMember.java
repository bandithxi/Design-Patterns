import java.util.Observable;
import java.util.Observer;
import java.util.*;

public class TwitterMember extends Observable implements Observer{
	// Part of publisher
	private String msg;
	
	//Part of subscriber
	private String feed;
	
	// Functionality of a publisher
	public String getMsg() {
		return msg;
	}

	// Functionality of a publisher
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	// Functionality of a publisher
	public void postTweet() {
		setChanged();
		notifyObservers();
	}

	// Functionality of a subscriber
	public void viewTweets() {
		System.out.println(this.feed);
	}

	// Functionality of a subscriber
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof TwitterMember) {
			TwitterMember twitterData = (TwitterMember) o;
			this.feed = twitterData.getMsg();
			this.viewTweets();
		}
		
	}
	
	public static void main(String args[]) {
		TwitterMember jBieber = new TwitterMember();
		TwitterMember bandith = new TwitterMember();
		TwitterMember adele = new TwitterMember();
		
		adele.addObserver(bandith);
		jBieber.addObserver(bandith);
		
		adele.setMsg("Hello");
		jBieber.setMsg("Oh baby");
		bandith.setMsg("I'm not a fan");
		
		adele.postTweet();
		jBieber.postTweet();
		bandith.postTweet();
		
		jBieber.setMsg("#bandith has no followers haha!");
		jBieber.postTweet();
		
		adele.setMsg("Hence his message will never be read");
		adele.postTweet();
		
		bandith.setMsg("Savage :(");
		bandith.postTweet();
		
	}
}
