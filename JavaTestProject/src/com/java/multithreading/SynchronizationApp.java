package com.java.multithreading;


class Printer{
	String status = "Available";
	synchronized void printDocument(String docName, int copies) {
		status = "Busy";
		System.out.println("[Printer] Printing the document: " + docName);
		showPrinterStatus();
		
		for(int i = 1; i <= copies; i++) {
			System.out.println("[Printer] " + docName + " Copy#" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		status = "Available";
	}
	
	void showPrinterStatus() {
		System.out.println("[Printer] Status: " + status);
	}
}

class Laptop extends Thread{
	Printer pRef;
	void attachPrinter(Printer p) {
		pRef = p;
	}
	@Override
	public void run() {
		pRef.printDocument(">> Johns Resume.pdf <<", 10);
	}
}

class Desktop extends Thread{
	Printer pRef;
	void attachPrinter(Printer p) {
		pRef = p;
	}
	@Override
	public void run() {
		pRef.printDocument("^^^ Harrys Resume.pdf ^^^", 10);
	}
}

public class SynchronizationApp {

	
	public static void main(String[] args) {
		
		
		Printer printer = new Printer();
//		printer.showPrinterStatus();
//		printer.printDocument("LearningJava.pdf", 10);
//		printer.showPrinterStatus();
		
		Laptop laptop = new Laptop();
		Desktop desktop = new Desktop();
		
		laptop.attachPrinter(printer);
		desktop.attachPrinter(printer);
		
		laptop.start();
		desktop.start();
		
		
	}
}
