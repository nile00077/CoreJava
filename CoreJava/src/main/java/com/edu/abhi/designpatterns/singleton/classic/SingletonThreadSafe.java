package com.edu.abhi.designpatterns.singleton.classic;

public class SingletonThreadSafe {

	private static SingletonThreadSafe uniqueInstance;

	// other useful instance variables here

	private SingletonThreadSafe() {
	}

	public static SingletonThreadSafe getInstance() {

		if (uniqueInstance == null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("" + Thread.currentThread().getName());
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonThreadSafe();
				}
			}
		}
		return uniqueInstance;

	}

	// other useful methods here

}
