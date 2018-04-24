package edu.bu.runners;

import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import edu.bu.domain.Person;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class FirstAppWin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		FirstAppWin window = new FirstAppWin();
		window.frame.setVisible(true);

	}

	/**
	 * Create the application.
	 */
	public FirstAppWin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ActionListener l = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());// TODO Auto-generated method stub
			}
		};
		KeyListener l2 = new KeyListener() {

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
	}
}
