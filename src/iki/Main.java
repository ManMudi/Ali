package iki;
import java.awt.Toolkit;

import javax.swing.JFrame;

import iki.Level;
import iki.Login;


public class Main {

	public static void main(String[] args) {

		Login l=new Login();
		l.setSize(610,330);
	   l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setResizable(false);
		l.setLocation(350,200);
		l.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("/lo.png")));
		
		    Level level=new Level();
	       // level.setVisible(true);
			level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			level.setSize(1365,775);
			level.setResizable(false);
			level.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("/lo.png")));
          
	}

}
