package edu.bu.threads;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ThreadsTesting {
	public static void main(String[] a) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(new Random().nextInt(10) + 1);
					System.out.println(Thread.currentThread().getName() + "task 1");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};

		Runnable task2 = new Runnable() {

			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(new Random().nextInt(10) + 1);
					System.out.println(Thread.currentThread().getName() + "task 2");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		Thread thread = new Thread(task);
		Thread thread2 = new Thread(task2);
		thread.start();
		thread2.start();
	}
}
