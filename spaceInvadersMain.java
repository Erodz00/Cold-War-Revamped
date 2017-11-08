import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import javax.tools.Tool;

public class spaceInvadersMain {
	double x,y,vx,vy, sizex, sizey;
	Image gitgud;
	int dencks = 12;


	public spaceInvadersMain(int startx, int starty){
		this.x = startx;
		this.y = starty;
		this.vx = Math.random()*20;
		this.vy = Math.random()*20;
		
		for(int i = 0 ;i<dencks;i++){
			gitgud = Toolkit.getDefaultToolkit().getImage("flag-of-mexico.png");
		}
		

	}
	public void update(){
		this.x += vx;
		this.y +=vy;
		if (x<0){
			vx = Math.abs(vx);
		}
		if (y<0){
			vy = Math.abs(vy);
		}
		else if (x > 700 - 120){
			vx = -Math.abs(vx);
		}
		else if (y > 700 - 100){
			vy = -Math.abs(vy);

		}
	}
	
	public Image getImage(){
		return this.gitgud;
	}

	public void paint(Graphics g, ImageObserver io){

		g.drawImage(getImage(), (int) x, (int) y, io);

	}


}