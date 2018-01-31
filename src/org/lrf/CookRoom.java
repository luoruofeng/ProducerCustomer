package org.lrf;

public class CookRoom {
	private final static int MAX = 1000000;
	private final static int MIN = 0;
	
	private int count = 0;
	
	public synchronized void create() {
		waitIfMore();
		count++;
		System.out.println("create "+count);
		notifyAll();
	}
	
	public void waitIfMore() {
		if(count >= MAX) {
			try {
				wait();
				waitIfMore();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void takeAway() {
		waitIfNoMore();
		count--;
		System.out.println("take away  "+count);
		notifyAll();
	}
	
	
	public void waitIfNoMore() {
		if(count <= MIN) {
			try {
				wait();
				waitIfNoMore();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
