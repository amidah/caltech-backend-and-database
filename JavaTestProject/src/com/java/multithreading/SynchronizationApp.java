package com.java.multithreading;


class Printer{
	String status = "Available";
//	synchronized printDocument(String docName, int copies) {
	void printDocument(String docName, int copies) {
		status = "Busy";
		System.out.println("\n[Printer] Printing the document: " + docName);
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
		showPrinterStatus();
	}
	
	void showPrinterStatus() {
		System.out.println("[Printer] Status: " + status + "\n");
	}
}

class Laptop extends Thread{
	Printer pRef;
	void attachPrinter(Printer p) {
		pRef = p;
	}
	@Override
	public void run() {
		synchronized (pRef) {
			try {
				pRef.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
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
		synchronized (pRef) {
		pRef.printDocument("^^^ Harrys Resume.pdf ^^^", 10);
		pRef.notify();
		}
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
