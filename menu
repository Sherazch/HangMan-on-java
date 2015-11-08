package Fazoolexperiments;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Menu extends JFrame {
	
	public Image img;
	public Menu(){
		img = new ImageIcon(getClass().getResource("").getPath()+"1.jpg").getImage();	
		setTitle("HangMan");
		setLocation(200,200);
		setResizable(false);
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				int x = arg0.getX();
				int y = arg0.getY();
				
				if((x>241&&x<461)&&(y>153&&y<192)){
					dispose();
					new Logic();
					
					
					
				}
				if((x>241&&x<461)&&(y>209&&y<246)){
					dispose();
					
					new Instruction();
					
					
				}
				if((x>241&&x<461)&&(y>262&&y<300)){
					dispose();
					new Credits();
					
				}
				if((x>241&&x<461)&&(y>314&&y<351)){
					System.exit(0);
					
			
					
				}
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});

	}
	
	public static void main(String[]args){
		 new Menu();
	}
	public void paint(Graphics g){
		
		
			g.drawImage(img, 0, 0, null);

	}
}

