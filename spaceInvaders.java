import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class spaceInvaders extends JComponent implements Runnable {

	spaceInvadersMain Alan, Alan1, Alan2, Alan3, Alan4, Alan5, Alan6, Alan7, Alan8, Alan9, Alan10, Alan11;

	ArrayList<spaceInvadersMain> denckers = new ArrayList<spaceInvadersMain>();

	public spaceInvaders() {
		for (int i = 0; i < 12; i++) {
		}
		for (int i = 0; i < 12; i++) {
			Alan = new spaceInvadersMain(0, 0);
			Alan1 = new spaceInvadersMain(50, 100);
			Alan2 = new spaceInvadersMain(50, 200);
			Alan3 = new spaceInvadersMain(150, 200);
			Alan4 = new spaceInvadersMain(250, 200);
			Alan5 = new spaceInvadersMain(350, 200);
			Alan6 = new spaceInvadersMain(450, 200);
			Alan7 = new spaceInvadersMain(550, 100);
			Alan8 = new spaceInvadersMain(450, 100);
			Alan9 = new spaceInvadersMain(350, 100);
			Alan10 = new spaceInvadersMain(250, 100);
			Alan11 = new spaceInvadersMain(150, 100);
		}
		denckers.add(Alan);
		denckers.add(Alan1);
		denckers.add(Alan2);
		denckers.add(Alan3);
		denckers.add(Alan4);
		denckers.add(Alan5);
		denckers.add(Alan6);
		denckers.add(Alan7);
		denckers.add(Alan8);
		denckers.add(Alan9);
		denckers.add(Alan10);
		denckers.add(Alan11);
		Thread t = new Thread(this);
		t.start();
		for (int i = 0; i < 100; i++)
			denckers.add(new spaceInvadersMain(300, 300));
		for (int i = 0; i < 100; i++) {
			denckers.get(i).update();
		}
	}
	public void paint(Graphics g) {
		Alan.paint(g, this);
		Alan1.paint(g, this);
		Alan2.paint(g, this);
		Alan3.paint(g, this);
		Alan4.paint(g, this);
		Alan5.paint(g, this);
		Alan6.paint(g, this);
		Alan7.paint(g, this);
		Alan8.paint(g, this);
		Alan9.paint(g, this);
		Alan10.paint(g, this);
		Alan11.paint(g, this);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Dencker is better thaN EVERYTHING!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 700);
		frame.setVisible(true);
		frame.add(new spaceInvaders());
		frame.getContentPane().setBackground(Color.black);
	}

	@Override
	public void run() {
		while (true) {
			Alan.update();
			Alan1.update();
			Alan2.update();
			Alan3.update();
			Alan4.update();
			Alan5.update();
			Alan6.update();
			Alan7.update();
			Alan8.update();
			Alan9.update();
			Alan10.update();
			Alan11.update();
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