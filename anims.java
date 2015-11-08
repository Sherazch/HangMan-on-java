package Fazoolexperiments;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Image;

public class Anims{
	public BufferedImage anim3;
	public BufferedImage anim4;
	public BufferedImage anim5;
	public BufferedImage anim6;
	public BufferedImage anim7;
	public BufferedImage anim8;
	public Anims(){
		try{
			anim3=ImageIO.read(new File(getClass().getResource("").getPath()+"7.png"));
			anim4=ImageIO.read(new File(getClass().getResource("").getPath()+"8.png"));
			anim5=ImageIO.read(new File(getClass().getResource("").getPath()+"9.png"));
			anim6=ImageIO.read(new File(getClass().getResource("").getPath()+"10.png"));
			anim7=ImageIO.read(new File(getClass().getResource("").getPath()+"11.png"));
			anim8=ImageIO.read(new File(getClass().getResource("").getPath()+"12.png"));
		}catch(IOException e){e.printStackTrace();
		JOptionPane.showMessageDialog(null,e+ "Exception caught at anims");
		}
	}
	public void paint(Graphics g){
		g.drawImage(anim3, 0, 250,200,350,null);
		g.drawImage(anim4, 0, 250,200,350,null);
		g.drawImage(anim5, 0, 250,200,350,null);
		g.drawImage(anim6, 0, 250,200,350,null);
		g.drawImage(anim7, 0, 250,200,350,null);
	}

}
