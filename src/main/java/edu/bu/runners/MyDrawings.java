package edu.bu.runners;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import edu.bu.domain.MyRectangle;

public class MyDrawings extends JPanel {
	List<MyRectangle> rectangles = new ArrayList<>();

	public MyDrawings() {
		rectangles.add(new MyRectangle(10, 10, 100, 100));
		rectangles.add(new MyRectangle(10, 10, 100, 100));

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				rectangles.get(0).setX(rectangles.get(0).getX() + 1);
				rectangles.get(0).setY(rectangles.get(0).getY() + 2);
				repaint();
			}
		};
		Timer timer = new Timer(10, listener);
		timer.start();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (MyRectangle myRectangle : rectangles) {
			myRectangle.DrawShape(g);
		}
	}

	public static void main(String a[]) {

		JFrame frame = new JFrame("rects");
		frame.setSize(1000, 1000);
		frame.add(new MyDrawings());
		frame.setVisible(true);

	}

}
