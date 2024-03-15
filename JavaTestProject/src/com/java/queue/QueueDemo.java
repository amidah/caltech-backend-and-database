package com.java.queue;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		for(int i = 1; i <= 10; i++) {
			priorityQueue.add(i);
		}
		
		System.out.println("priorityQueue before poll: " + priorityQueue);
		
		int head = priorityQueue.peek();
		
		System.out.println("Head of the queue before poll: " + head);
		
		priorityQueue.poll();
		
		System.out.println("priorityQueue after poll: " + priorityQueue);
		
		int head1 = priorityQueue.peek();
		
		System.out.println("Head of the queue after poll: " + head1);
		
		System.out.println("priorityQueue size: " + priorityQueue.size());
		
		
	}
}
