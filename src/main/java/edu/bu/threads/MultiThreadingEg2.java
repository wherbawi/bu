package edu.bu.threads;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Factory;

public class MultiThreadingEg2 {

	public static void main(String[] args) {

		Runnable target = new Runnable() {

			@Override
			public void run() {
				int i = 0;
				while (true) {
					try {
						TimeUnit.SECONDS.sleep(1);
						System.out.println(i++);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread = new Thread(target);
		thread.start();
		Scanner scanner = new Scanner(System.in);
		while (scanner.nextInt() != 1) {
			System.out.println("hello");

		}
	}

}
