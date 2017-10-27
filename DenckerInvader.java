import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class DenckerInvader extends JComponent implements Runnable {
	
	double direction = Math.random()*100;
	double speed = 10.0;
	int y=0;
	int x=0;
	int xv=(int) (speed);
	int yv=(int) (speed);

	Image american, soviet; 
	
	public DenckerInvader() {
		
		american = Toolkit.getDefaultToolkit().getImage("american.png"); 
		soviet = Toolkit.getDefaultToolkit().getImage("soviet.png"); 

		Thread t = new Thread(this);
		t.start();
	}
	public void update(Graphics g) { 
		paint(g); 
	} 

	public void paint(Graphics g) {
		g.drawImage(american, x,y,300,175,this);
		g.drawImage(soviet, x+100,y+100,300,175,this);

	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Cold War Revamped");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.add(new DenckerInvader());
		frame.getContentPane().setBackground(Color.black);
	}

	@Override
	public void run() {
		while(true) {

			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}