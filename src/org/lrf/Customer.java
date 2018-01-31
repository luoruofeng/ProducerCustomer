package org.lrf;

public class Customer implements Runnable {

	public Customer(CookRoom cr) {
		this.cr = cr;
	}

	private CookRoom cr;

	@Override
	public void run() {
		
		while (true) {
			cr.takeAway();
		}
	}

}
