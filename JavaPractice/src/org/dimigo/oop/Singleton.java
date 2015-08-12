package org.dimigo.oop;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton(){};
	
	public synchronized static Singleton getInstance() {
		return instance;
	}
}