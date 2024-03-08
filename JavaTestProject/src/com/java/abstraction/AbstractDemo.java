package com.java.abstraction;

abstract class Cab{
	
	Cab(){
		System.out.println("Cab Object Constructed...");
	}
	
	abstract void bookCab(String source, String destination);
	
	void showCabDetails() {
		System.out.println("Cab is a black color Sedan");
	}
}

class MiniCab extends Cab{
	MiniCab(){
		System.out.println("MiniCab Object Constructed.");
	}

	@Override
	void bookCab(String source, String destination) {
		System.out.println("Book cab from source: " + source + " to destination: " + destination);
		
	}
}

abstract class Notification{
	abstract void notifyWithMessage(String message);
}

class YoutubeChannel{
	Notification notification;
	void subscribe(Notification nf) {
		notification = nf;
	}
	void uploadVideo(String name) {
		String message = "A new video is uploaded: " + name;
		notification.notifyWithMessage(message);
	}
}

class User extends Notification{

	@Override
	void notifyWithMessage(String message) {
		System.out.println("Received " + message);
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		MiniCab miniCab = new MiniCab();
		miniCab.bookCab("Home", "Office");
		miniCab.showCabDetails();
		
		User john = new User();
		
		YoutubeChannel you = new YoutubeChannel();
		you.subscribe(john);
		you.uploadVideo("Learning Java");
		
		
		
		
	}
}
