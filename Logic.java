package Fazoolexperiments;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Logic {
	private boolean run = true;
	public Icon img;
	public JTextField tf;
	public JTextField tf2;
	public JLabel l2,l3;
	public JFrame frame;
	Random rnd = new Random();
	String name = "mango";
	String n;
	int counter = 0;
	int hl1;
	int hl2;
	int hl3;
	int length = name.length();
	int hintletter = length / 3;
	String dash = "_";
	String print;
	String correct;
	BufferedImage anim1;
	BufferedImage anim2;

	public Logic() {
		img = new ImageIcon(getClass().getResource("").getPath() + "5.jpg");
		try {
			anim1 = ImageIO.read(new File(getClass().getResource("").getPath()
					+ "6.png"));
			anim2 = ImageIO.read(new File(getClass().getResource("").getPath()
					+ "12.png"));
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e+"Exception caught at Logic");
		}
		frame = new JFrame("Testing HangMan");
		frame.setSize(700, 500);
		frame.setLayout(null);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1 = new JLabel(img);
		l1.setBounds(0, 0, 700, 500);
		l2 = new JLabel(new ImageIcon(anim1));
		l3 = new JLabel(new ImageIcon(anim2));
		l2.setBounds(10, 300, 90, 150);
		l3.setBounds(80, 290, 150, 180);
		JPanel p = new JPanel();
		p.setSize(700, 500);
		p.setLocation(0, 0);
		p.setLayout(null);
		p.add(l1);
		l1.add(l2);
		l1.add(l3);
		frame.add(p);
		p.addMouseListener(new MouseListener(){@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			int x=e.getX();int y=e.getY();
			if((x>27&&x<55)&&(y>37&&y<67)){
				frame.dispose();
				new Menu();
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}});

		tf = new JTextField(display("", false, 0));
		tf.setVisible(true);
		tf2 = new JTextField();
		tf2.setBounds(500, 250, 200, 80);
		tf2.setBackground(Color.magenta);
		tf2.setFont(new Font("Arial", 30, 30));
		p.add(tf2);
		tf.setBounds(200, 150, 300, 50);
		tf.setBackground(Color.green);
		tf.setFont(new Font("Arial", 30, 30));
		p.add(tf);
		frame.setVisible(true);
		tf.setEditable(false);
		tf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			key();}
		});
	}
	public String word(){
		String s = "";
		for (int i = 0; i < name.length(); i++) {
			if (i <= name.length() - 1)
				s += name.charAt(i) + " ";
			else
				s += name.charAt(i);
		}
		n = s;
		return n;
	}
	public void key(){
		boolean correct = false;
		for (int i = 0; i < name.length(); i++) {
			if (tf2.getText().charAt(0) < 'a'
					|| tf2.getText().charAt(0) > 'z') {
				JOptionPane
						.showMessageDialog(null,
								"Please enter correct type of letter");
				break;
			}
			if (tf2.getText().charAt(0) == name.charAt(i)) {
				for (int j = 0; j < word().length(); j++) {
					if (word().charAt(j) == name.charAt(i)){
						tf.setText(display(tf2.getText().charAt(0) + "",
								true, j));
						correct = true;
					}	
				}
			}	
		}
		tf2.setText("");
		if(!correct){
			if (counter == 0) {
				l2.setIcon(new ImageIcon(new Anims().anim3));
				JOptionPane.showMessageDialog(null,"Alas..!!\nYou have lost one chance\nGuess the correct letter to survive");
			}
			if (counter == 1) {
				l2.setIcon(new ImageIcon(new Anims().anim4));
				JOptionPane.showMessageDialog(null,"Alas..!!\nYou have lost another chance");
			}
			if (counter == 2) {
				l2.setIcon(new ImageIcon(new Anims().anim5));
				JOptionPane.showMessageDialog(null,"Alas..!!\nYou have lost another chance\nyou have 2 more chances left");
			}
			if (counter == 3) {
				l2.setIcon(new ImageIcon(new Anims().anim6));
				JOptionPane.showMessageDialog(null,"Alas..!!\nYou have lost another chance\nyou have last chance to survive");
			}
			if (counter == 4) {
				l2.setIcon(new ImageIcon(new Anims().anim7));{
					JOptionPane.showMessageDialog(null,
							"YOU LOSE\nBetter Luck Next Time...!",
							"OHHHH...!!!", 0, (new ImageIcon(
									new Anims().anim8)));
					counter=0;
					frame.dispose();		
					Menu m=new Menu();
				}		}
			counter++;
		}}	
	public String display(String set, boolean setText, int index) {
		String show = "";
		hl1 = rnd.nextInt(length);
		hl2 = rnd.nextInt(length);
		hl3 = rnd.nextInt(length);
		if (((hl1 == hl2) || (hl1 == hl3) || (hl2 == hl3))) {
			do {
				hl1 = rnd.nextInt(length);
				hl2 = rnd.nextInt(length);
				hl3 = rnd.nextInt(length);
			} while ((hl1 != hl2) && (hl1 != hl3) && (hl2 != hl3));
		}
		
		if (run) {
			if (hintletter == 1) {
				for (int i = 0; i <= length; i++) {
					if (i == hl1) {
						print = "" + name.charAt(hl1) + " ";
						show += print;
					} else if ((i < length) && (i != hl1)) {
						print = dash + " ";
						show += print;
					}
				}
			}
			if (hintletter == 2) {
				if (hl1 == hl2) {
					hl1 = 1;
					hl1 = 4;
				}
				for (int i = 0; i <= length; i++) {
					if (i == hl1) {
						print = "" + name.charAt(hl1) + " ";
						show += print;
					}
					if (i == hl2) {
						print = "" + name.charAt(hl2) + " ";
						show += print;
					} else if ((i < length) && ((i != hl1) && (i != hl2))) {
						print = dash + " ";
						show += print;
					}
				}
			}
			if (hintletter == 3) {
				if ((hl1 == hl2) || (hl1 == hl3) || (hl2 == hl3)) {
					hl1 = 0;
					hl2 = 4;
					hl3 = 6;
				}
				for (int i = 0; i <= length; i++) {
					if (i == hl1) {
						print = ("" + name.charAt(hl1) + " ");
						show += print;
					}
					if (i == hl2) {
						print = "" + name.charAt(hl2) + " ";
						show += print;
					}
					if (i == hl3) {
						print = ("" + name.charAt(hl3) + " ");
						show += print;
					} else if ((i < length)
							&& ((i != hl1) && (i != hl2) && (i != hl3))) {
						print = (dash + " ");
						show += print;
					}
				}
			}
		}
		run = false;
		if (show.equals("")) {
			show = tf.getText();
		}
		if (set.equals("") && setText == false) {
			return show;
		} else {
			String s = "";
			for (int x = 0; x < show.length(); x++) {
				if (index != x) {
					s = s + show.charAt(x);
				} else {
					s = s + set;
				}
			}
			return s;
		}
	}
}
