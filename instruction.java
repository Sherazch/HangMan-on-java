package Fazoolexperiments;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

public  class Instruction extends Menu {
	public static boolean bg1=true;
	public Image img2;
	public Instruction(){
		img2=new ImageIcon(getClass().getResource("").getPath()+"2.jpg").getImage();
    setTitle("Instructions");
	setSize(700,500);
	setLocation(200,200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
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
			// TODO Auto-generated method stub
		int x=arg0.getX();
		int y=arg0.getY();
		if((x>20&x<115)&&(y>448&&y<475)){
			dispose();
			
			new Menu();
		}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});

}
	public void paint(Graphics g){
		if(bg1){g.drawImage(img2, 0 ,0, null);}
	}
	}
