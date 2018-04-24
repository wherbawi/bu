package edu.bu.runners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstGUI {
	static JFrame myFrame;
	static JButton myButton;

	public static void main(String[] args) {

		myFrame = new JFrame("First JFrame");
		myFrame.setSize(1000, 1000);
		myFrame.setVisible(true);

		myButton = new JButton("click here");
		myButton.setSize(100, 100);
		myFrame.getContentPane().add(myButton);
		myFrame.setLayout(null);
		myButton.setAlignmentX(10);
		myButton.setAlignmentY(10);

		ActionListener l = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
			}
		};
		myButton.addActionListener(l);

		KeyListener k = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		};
		myButton.addKeyListener(k);
	}

}
