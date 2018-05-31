package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.cbq.navigation.*;

import javax.swing.JTextPane;
public class GuiTe extends JFrame  {

	public  MyPanel mp;
	public static void go() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiTe frame = new GuiTe();
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
	public GuiTe() {
		mp = new MyPanel();	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 550);
		//contentPane = mp;
		//contentPane = new JPanel();
		
		mp.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mp);
		mp.setLayout(null);
		
		
		
		
	}
	
	
}
class MyPanel extends JPanel implements Runnable,ActionListener{   
	private JTextField textField_1;
	private JTextField textField;
	private JTextPane textPane;
	private static  boolean flag = false;
	public JPanel panel ;
	private int x = -100;
	private int y = -100;
	private  ImageIcon icon; 
	private Image car;
	JLabel label;
	Thread t ;
	boolean emotionflag = true;
	List<String> tempStr = new ArrayList<>();
	Coordinate tempco;
//	 public MyPanel(){
//		 setBorder(new EmptyBorder(5, 5, 5, 5));
//		 setContentPane(contentPane);
//		 contentPane.setLayout(null);
//	 }
	 public void paint(Graphics g) {  
	        Image bg,moon;  
	        ImageIcon icon;  
	        super.paint(g);  
//	        icon = new ImageIcon("src/lnu.jpg");  
//	        bg =icon.getImage();  
//	        g.drawImage(bg,0,0, null);  
	        if(emotionflag == true){
		        icon = new ImageIcon("src/111.png");  
		        moon = icon.getImage();               
		        g.drawImage(moon, x, y, null);  }
	        else{
	        	icon = new ImageIcon("src/333.png");  
		        moon = icon.getImage();               
		        g.drawImage(moon, x, y, null); 
	        }
	 }
	 public MyPanel (){
	        panel = new JPanel();
			panel.setBounds(811, 23, 123, 478);
			this.add(panel);
			panel.setLayout(null);
			
			textField_1 = new JTextField();
			textField_1.setBounds(10, 37, 103, 35);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			textField = new JTextField();
			textField.setBounds(10, 122, 103, 35);
			panel.add(textField);
			textField.setColumns(10);


			JLabel labela = new JLabel("显示地图");
			labela.setBounds(870, 0, 54, 15);
			this.add(labela);
			labela.addMouseListener(ma);
			
			JLabel label_40 = new JLabel("起点");
			label_40.setBounds(10, 10, 54, 15);
			panel.add(label_40);
			
			JLabel label_41 = new JLabel("终点");
			label_41.setBounds(10, 94, 54, 15);
			panel.add(label_41);
			
			JButton btnNewButton = new JButton("计算");
			btnNewButton.setBounds(10, 334, 93, 23);
			panel.add(btnNewButton);
			btnNewButton.addActionListener(this);
			JButton btnNewButton_1 = new JButton("重置");
			btnNewButton_1.setBounds(10, 367, 93, 23);
			panel.add(btnNewButton_1);
			btnNewButton_1.addActionListener(this);
			JButton btnNewButton_2 = new JButton("退出");
			btnNewButton_2.setBounds(10, 400, 93, 54);
			panel.add(btnNewButton_2);
			
			textPane = new JTextPane();
			textPane.setBounds(10, 192, 103, 120);
			panel.add(textPane);
			
			JLabel label_43 = new JLabel("结果");
			label_43.setBounds(10, 177, 54, 15);
			panel.add(label_43);
			btnNewButton_2.addActionListener(this);
			label = new JLabel();
			label.setText("关于");
			label.setBounds(10, 0, 924, 501);
			this.add(label);
			
			JLabel label_1 = new JLabel("七舍");
			label_1.setBounds(84, 43, 80, 24);
			this.add(label_1);
			label_1.addMouseListener(ma);
			
			
			JLabel label_2 = new JLabel("八舍");
			label_2.setBounds(84, 81, 80, 30);
			this.add(label_2);
			label_2.addMouseListener(ma);
			
			JLabel label_3 = new JLabel("九舍");
			label_3.setBounds(84, 126, 80, 24);
			this.add(label_3);
			label_3.addMouseListener(ma);
			
			JLabel label_4 = new JLabel("三、四食堂");
			label_4.setBounds(87, 181, 40, 65);
			this.add(label_4);
			label_4.addMouseListener(ma);
			
			JLabel label_5 = new JLabel("档案馆");
			label_5.setBounds(51, 332, 45, 30);
			this.add(label_5);
			label_5.addMouseListener(ma);
			
			JLabel label_6 = new JLabel("图书馆");
			label_6.setBounds(10, 372, 86, 46);
			this.add(label_6);
			label_6.addMouseListener(ma);
			
			JLabel label_7 = new JLabel("溯源楼");
			label_7.setBounds(10, 428, 136, 30);
			this.add(label_7);
			label_7.addMouseListener(ma);
			
			JLabel label_8 = new JLabel("六舍");
			label_8.setBounds(177, 34, 80, 24);
			this.add(label_8);
			label_8.addMouseListener(ma);
			
			JLabel label_9 = new JLabel("小篮球场");
			label_9.setBounds(174, 68, 52, 30);
			this.add(label_9);
			label_9.addMouseListener(ma);
			
			JLabel label_10 = new JLabel("医院");
			label_10.setBounds(226, 68, 31, 30);
			this.add(label_10);
			label_10.addMouseListener(ma);
			
			
			JLabel label_11 = new JLabel("十舍");
			label_11.setBounds(172, 126, 54, 20);
			this.add(label_11);
			label_11.addMouseListener(ma);
			
			JLabel label_12 = new JLabel("法硕楼");
			label_12.setBounds(137, 170, 60, 24);
			this.add(label_12);
			label_12.addMouseListener(ma);
			
			JLabel label_13 = new JLabel("回民餐厅");
			label_13.setBounds(151, 231, 54, 15);
			this.add(label_13);
			label_13.addMouseListener(ma);
			
			JLabel label_14 = new JLabel("驾校");
			label_14.setBounds(172, 282, 85, 55);
			this.add(label_14);
			label_14.addMouseListener(ma);
			
			JLabel label_15 = new JLabel("机关楼");
			label_15.setBounds(159, 347, 98, 40);
			this.add(label_15);
			label_15.addMouseListener(ma);
			JLabel label_16 = new JLabel("超市");
			label_16.setBounds(261, 43, 45, 24);
			this.add(label_16);
			label_16.addMouseListener(ma);
			
			JLabel label_17 = new JLabel("桃李园");
			label_17.setBounds(285, 81, 40, 40);
			this.add(label_17);
			label_17.addMouseListener(ma);
			
			JLabel label_18 = new JLabel("三舍");
			label_18.setBounds(234, 126, 31, 20);
			this.add(label_18);
			label_18.addMouseListener(ma);
			
			JLabel label_19 = new JLabel("四舍");
			label_19.setBounds(275, 126, 31, 20);
			this.add(label_19);
			label_19.addMouseListener(ma);
			
			JLabel label_20 = new JLabel("马克思学院");
			label_20.setBounds(207, 175, 58, 19);
			this.add(label_20);
			label_20.addMouseListener(ma);
			
			JLabel label_21 = new JLabel("五舍");
			label_21.setBounds(271, 175, 40, 19);
			this.add(label_21);
			label_21.addMouseListener(ma);
			
			JLabel label_22 = new JLabel("博远楼");
			label_22.setBounds(321, 181, 69, 30);
			this.add(label_22);
			label_22.addMouseListener(ma);
			
			JLabel label_23 = new JLabel("二舍");
			label_23.setBounds(311, 28, 24, 20);
			this.add(label_23);
			label_23.addMouseListener(ma);
			
			JLabel label_24 = new JLabel("斯巴达健身中心");
			label_24.setBounds(345, 31, 69, 27);
			this.add(label_24);
			label_24.addMouseListener(ma);
		
			
			JLabel label_25 = new JLabel("一舍");
			label_25.setBounds(346, 68, 40, 55);
			this.add(label_25);
			label_25.addMouseListener(ma);
			
			JLabel label_26 = new JLabel("博士生公寓");
			label_26.setBounds(317, 131, 73, 19);
			this.add(label_26);
			label_26.addMouseListener(ma);
			
			JLabel label_27 = new JLabel("友园");
			label_27.setBounds(400, 131, 109, 30);
			this.add(label_27);
			label_27.addMouseListener(ma);
			
			JLabel label_28 = new JLabel("足球场");
			label_28.setBounds(302, 265, 122, 65);
			this.add(label_28);
			label_28.addMouseListener(ma);
			
			JLabel label_29 = new JLabel("排球场");
			label_29.setBounds(285, 332, 163, 30);
			this.add(label_29);
			label_29.addMouseListener(ma);
			
			JLabel label_30 = new JLabel("西阶梯");
			label_30.setBounds(281, 372, 44, 30);
			this.add(label_30);
			label_30.addMouseListener(ma);
			
			JLabel label_31 = new JLabel("东阶梯");
			label_31.setBounds(400, 372, 48, 24);
			this.add(label_31);
			label_31.addMouseListener(ma);
			
			JLabel label_32 = new JLabel("哲经楼");
			label_32.setBounds(302, 424, 136, 30);
			this.add(label_32);
			label_32.addMouseListener(ma);
			
			JLabel label_33 = new JLabel("大篮球场");
			label_33.setBounds(498, 282, 60, 71);
			this.add(label_33);
			label_33.addMouseListener(ma);
			
			JLabel label_34 = new JLabel("彗星楼");
			label_34.setToolTipText("彗星楼");
			label_34.setBounds(473, 372, 122, 40);
			this.add(label_34);
			label_34.addMouseListener(ma);
			
			JLabel label_35 = new JLabel("理贤楼");
			label_35.setBounds(618, 231, 80, 46);
			this.add(label_35);
			label_35.addMouseListener(ma);
			
			JLabel label_36 = new JLabel("人文学院");
			label_36.setBounds(655, 302, 54, 40);
			this.add(label_36);
			label_36.addMouseListener(ma);
			
			JLabel label_37 = new JLabel("礼堂");
			label_37.setBounds(638, 347, 71, 71);
			this.add(label_37);
			label_37.addMouseListener(ma);
			
			JLabel label_38 = new JLabel("怀远楼");
			label_38.setBounds(617, 424, 109, 28);
			this.add(label_38);
			label_38.addMouseListener(ma);
			
			JLabel label_39 = new JLabel("辽大出版社");
			label_39.setBounds(727, 231, 60, 40);
			label_39.addMouseListener(ma);
			this.add(label_39);
			
			JLabel label_42 = new JLabel("友园餐厅");
			label_42.setBounds(473, 166, 54, 55);
			this.add(label_42);
			label_42.addMouseListener(ma);
	         
	    }  
	 public void going(){
		 HashMap<String, Coordinate> hm = new CoorMap().getmap();
		 Coordinate cor = hm.get(tempStr.get(0));
		 this.x = cor.x;
		 this.y = cor.y;
		 for(int i=1;i<tempStr.size();i++){
			 Coordinate cor2 = hm.get(tempStr.get(i));
			 tempco = new Coordinate(x, y);
			 Coordinate co = new RunMethond().running(tempco,cor2);
			 int vx = co.x;
		     int vy = co.y;
		     	while(x!=cor2.x&&y!=cor2.y){//小人的位置
		    	 	
		     		x = x+vx;  
		            y = y+vy;  
		            if(x >this.getWidth()){//直到到达窗口边界  
		                x = -100;  
		                y = -100;  
		            }  
		            try {  
		                Thread.sleep(30);//暂停三秒  
		            } catch (InterruptedException e) {  
		                e.printStackTrace();  
		            }  
		            repaint();//三秒后重新开始  
		        }  
		        if(x == cor2.x){
		        	while(y!=cor2.y){
		        	y=y+vy;
		        	   try {  
			                Thread.sleep(30);//暂停三秒  
			            } catch (InterruptedException e) {  
			                e.printStackTrace();  
			            }  
			            repaint();//三秒后重新开始  }
		        }  } 
		        else{
		        	while(x!=cor2.x){
			        	x=x+vx;
			        	   try {  
				                Thread.sleep(30);//暂停三秒  
				            } catch (InterruptedException e) {  
				                e.printStackTrace();  
				            }  
				            repaint();//三秒后重新开始  	
		        	}
		        }
		 }
		       emotionflag = false;
		       repaint();
	 } 
	 public void run() {  
	     System.out.println("run");  
	     going();
//	     HashMap<String, Coordinate> hm = new CoorMap().getmap();
//	     Coordinate co1 = hm.get("七舍");
//	     Coordinate co2 = hm.get("怀远楼");
//	     Coordinate co = new RunMethond().running(co1,co2);
//	     int vx = co.x;
//	     int vy = co.y;
//	     x = co1.x;
//	     y = co1.y;
//	     	while(x!=co2.x&&y!=co2.y){//小人的位置
//	    	 	
//	     		x = x+vx;  
//	            y = y+vy;  
//	            if(x >this.getWidth()){//直到到达窗口边界  
//	                x = -100;  
//	                y = -100;  
//	            }  
//	            try {  
//	                Thread.sleep(30);//暂停三秒  
//	            } catch (InterruptedException e) {  
//	                e.printStackTrace();  
//	            }  
//	            repaint();//三秒后重新开始  
//	        }  
//	        if(x == co2.x){
//	        	while(y!=co2.y){
//	        	y=y+vy;
//	        	   try {  
//		                Thread.sleep(30);//暂停三秒  
//		            } catch (InterruptedException e) {  
//		                e.printStackTrace();  
//		            }  
//		            repaint();//三秒后重新开始  }
//	        }  }
//	        else{
//	        	while(x!=co2.x){
//		        	x=x+vx;
//		        	   try {  
//			                Thread.sleep(30);//暂停三秒  
//			            } catch (InterruptedException e) {  
//			                e.printStackTrace();  
//			            }  
//			            repaint();//三秒后重新开始  	
//	        	}
//	        }
	    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand()=="计算"){
			 Dijkstra test=new Dijkstra();
 		        int begin=MyMap.getMap().get(textField_1.getText());
		        //Scanner input2=new Scanner(System.in);
		        int over =MyMap.getMap().get(textField.getText());
		        Node start=test.init(begin);  
		        test.computePath(start);  
		        int a [] = test.printPathInfo(over);
		        String tem = "";
		        for (int i : a) {
		        	for (String st : MyMap.getMap().keySet()) {
						if(MyMap.getMap().get(st)==i)
							{tem = tem+st+" ";
							tempStr.add(st);}
							
					}
				}
		        System.out.println(tem);
		        textPane.setText(tem);
		        t = new Thread(this);//启动面板的动画线程  
				t.start(); 
		}
		if(e.getActionCommand()=="重置"){
			emotionflag = true;
			textField.setText("");
			textField_1.setText("");
			textPane.setText("");
			if(t!=null)
			{t.stop();
				x = -100;
				y = -100;
				repaint();
			}
			tempStr = new ArrayList<>();;
		}
		if(e.getActionCommand()=="退出"){
			System.exit(0);
		}
	}
	MouseAdapter ma = new MouseAdapter() {
		 public void mouseClicked(MouseEvent e){  
			 JLabel jl = (JLabel)e.getSource();
			 String str = jl.getText();		 
			 if(str == "显示地图"){
				 if(flag == false)
					 {flag=true;
					 
					 label.setIcon(new ImageIcon("src\\lnu.jpg"));
					 }
				 else
				 { flag=false; 
				 label.setIcon(new ImageIcon(""));
				 }
				 System.out.println(flag);
				 return;
				 
			 }
			 else if(textField_1.getText().equals("")){
				 textField_1.setText(str);
			 }
			 else if(textField.getText().equals("")){
				 if(textField_1.getText().equals(str)){
					 System.out.println("重复");
					    int n = JOptionPane.showConfirmDialog(null, "起点与终点重复", "警告", JOptionPane.CLOSED_OPTION);   
					 return;
				 }
				 textField.setText(str);
			 }
		 }
	};
}
