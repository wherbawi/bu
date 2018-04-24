package edu.bu.runners;

import javax.swing.JFrame;

public class DrawingFrame {
	JFrame frame;
	MyDrawings myDrawings;

	public DrawingFrame() {
		frame = new JFrame("Drawing");
		frame.setLocation(0, 0);
		frame.setSize(1000, 1000);
		myDrawings = new MyDrawings();
		frame.add(myDrawings);

	}

	public static void main(String a[]) {
		DrawingFrame drawing = new DrawingFrame();
		drawing.frame.setVisible(true);
	}
}
