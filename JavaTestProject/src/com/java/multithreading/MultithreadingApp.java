package com.java.multithreading;

class CA{
	
}

//class PrintingTask extends Thread{
//	public void run() {
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("[PrintingTask] Printing book pages for LearningPython.pdf: Page#" + i);
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

class PrintingTask extends CA implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("[PrintingTask] Printing book pages for LearningPython.pdf: Page#" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class MultithreadingApp {

	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		
		Runnable pt = new PrintingTask();
		Thread printTask = new Thread(pt);
		printTask.setPriority(Thread.MAX_PRIORITY);
		printTask.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("[main] Printing book pages for LearningJava.pdf: Page#" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("printTask thread name is: " + printTask.getName() + " and priority is: " + printTask.getPriority());
		System.out.println("Main thread name is: " + Thread.currentThread().getName() + " and priority is: " + Thread.currentThread().getPriority());
		System.out.println("Main Thread Finished");
	}
	
}
