import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class frame extends JFrame { //makes the window
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static final int WIDTH = (int) screenSize.getWidth();
	private static final int HEIGHT = (int) screenSize.getHeight();
	private BufferedImage cursor;
	
	public frame (String framename) {
		super(framename);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		/*
		try {
			//cursor = ImageIO.read(panel.class.getResource("/INCIDENTALS/cursor.png"));
		} catch (Exception e) {
			System.out.println("FRAME ERROR");
		}
		*/
		//Cursor c = toolkit.createCustomCursor(cursor , new Point(this.getX(), this.getY()), "img");
		//this.setCursor (c);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setting size, here it uses the private variables above
		setSize(WIDTH, HEIGHT);
		//window can be seen
		setExtendedState(this.MAXIMIZED_BOTH);
		add(new panel());
		setVisible(true);
	}
	 
}