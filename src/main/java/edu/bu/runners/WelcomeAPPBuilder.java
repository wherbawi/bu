package edu.bu.runners;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class WelcomeAPPBuilder {

	private JFrame frame;
	private JTextField employeeName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeAPPBuilder window = new WelcomeAPPBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeAPPBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 639, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel customerName = new JLabel("New label");
		customerName.setBounds(92, 85, 56, 16);
		frame.getContentPane().add(customerName);
		
		employeeName = new JTextField();
		employeeName.setBounds(300, 82, 116, 22);
		frame.getContentPane().add(employeeName);
		employeeName.setColumns(10);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(122, 153, 234, 42);
		frame.getContentPane().add(toolBar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(272, 258, 226, 22);
		frame.getContentPane().add(comboBox);
		
		JCheckBox experienced = new JCheckBox("New check box");
		experienced.setBounds(408, 153, 113, 25);
		frame.getContentPane().add(experienced);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(32, 243, 119, 26);
		frame.getContentPane().add(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setBounds(12, 294, 151, 24);
		frame.getContentPane().add(mntmNewMenuItem);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(312, 319, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
			}
		});
		btnNewButton.setBounds(27, 170, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
