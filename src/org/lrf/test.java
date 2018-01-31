package org.lrf;

public class test {
	
	public static void main(String[] args) {
		CookRoom cr = new CookRoom();
		
		for (int i = 0; i < 13; i++) {
			Thread thread = new Thread(new Cooker(cr));
			thread.setPriority(1);
			thread.start();
		}
		
		for (int i = 0; i < 13; i++) {
			Thread thread = new Thread(new Customer(cr));
			thread.setPriority(10);
			thread.start();
		}
	}

}
