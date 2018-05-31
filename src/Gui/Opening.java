package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Opening extends JFrame implements ActionListener{

	private static JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					Opening frame = new Opening();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Opening() {
		setTitle("辽宁大学导航系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 386);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("src\\0d338744ebf81a4c2c281ee9df2a6059252da6fc.jpg"));
		label.setBounds(189, 111, 206, 228);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("辽宁大学导航系统");
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 27));
		label_1.setBounds(96, 10, 231, 91);
		contentPane.add(label_1);
		
		JButton button = new JButton("进入");
		button.setBounds(31, 142, 108, 38);
		contentPane.add(button);
		button.addActionListener(this);
		
		JButton btnNewButton = new JButton("关于");
		btnNewButton.setBounds(31, 192, 108, 38);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		JButton btnNewButton_1 = new JButton("退出");
		btnNewButton_1.setBounds(31, 283, 108, 38);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="进入"){			
			GuiTe gt = new GuiTe();
			gt.go();
		    dispose();
		}
		if(e.getActionCommand()=="退出"){
			System.exit(0);
		}
	}

}
