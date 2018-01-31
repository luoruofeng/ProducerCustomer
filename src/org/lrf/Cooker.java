package org.lrf;

public class Cooker implements Runnable{

	public Cooker(CookRoom cr) {
		this.cr = cr; 
	}
	
	private CookRoom cr;
	
	@Override
	public void run() {
		while(true) {
			cr.create();
		}
	}
	
}
