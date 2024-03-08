package com.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MovieTicket{
	
	String movieName;
	String seatNumber;
	boolean isTicketBooked;
	String emailUser;
	static int ticketNumber = 1;
	
	public MovieTicket() {

	}


	public MovieTicket(String movieName, String seatNumber, boolean isTicketBooked, String emailUser) {
		
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.isTicketBooked = isTicketBooked;
		this.emailUser = emailUser;
	}


	@Override
	public String toString() {
		return "MovieTicket [movieName=" + movieName + ", seatNumber=" + seatNumber + ", isTicketBooked="
				+ isTicketBooked + ", emailUser=" + emailUser + "]";
	}
	
}


class MovieTicketBookingTask implements Callable<String>{

	MovieTicket movieTicket;

	public MovieTicketBookingTask(MovieTicket movieTicket) {
		this.movieTicket = movieTicket;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Paying for the Ticket Seat: " + movieTicket.seatNumber + "for User: " + movieTicket.emailUser);
		
//		Thread.sleep(2000);
		movieTicket.seatNumber = "A" + MovieTicket.ticketNumber;
		movieTicket.isTicketBooked = true;
		MovieTicket.ticketNumber++;
		
		System.out.println("Ticket booked for User: " + movieTicket.emailUser);
		System.out.println();
		
		return "Ticket Booked for " + movieTicket.emailUser + " with Seat number: " + movieTicket.seatNumber;
	}
	
	
}

public class CallableFutureApp {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + ": Movie Ticket Booking App Started");
		
		MovieTicket ticket1 = new MovieTicket("Avengers", "A1", false, "john@gmail.com");
		MovieTicket ticket2 = new MovieTicket("Avengers", "A2", false, "roy@gmail.com");
		MovieTicket ticket3 = new MovieTicket("Avengers", "A3", false, "sam@gmail.com");
		MovieTicket ticket4 = new MovieTicket("Avengers", "A4", false, "dexter@gmail.com");
		MovieTicket ticket5 = new MovieTicket("Avengers", "A5", false, "harry@gmail.com");
			
		System.out.println("Processors: " + Runtime.getRuntime().availableProcessors());
		
		Callable task1 = new MovieTicketBookingTask(ticket1);
		Callable task2 = new MovieTicketBookingTask(ticket2);
		Callable task3 = new MovieTicketBookingTask(ticket3);
		Callable task4 = new MovieTicketBookingTask(ticket4);
		Callable task5 = new MovieTicketBookingTask(ticket5);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<String> future1 = service.submit(task1);
		Future<String> future2 = service.submit(task2);
		Future<String> future3 = service.submit(task3);
		Future<String> future4 = service.submit(task4);
		Future<String> future5 = service.submit(task5);
		
		
		try {
			System.out.println("Task1 result: " + future1.get());
			System.out.println("Task2 result: " + future2.get());
			System.out.println("Task3 result: " + future3.get());
			System.out.println("Task4 result: " + future4.get());
			System.out.println("Task5 result: " + future5.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println(Thread.currentThread().getName() + ": Movie Ticket Booking App Ended");
		
	}

}
