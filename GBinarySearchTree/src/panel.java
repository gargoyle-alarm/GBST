import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import static java.lang.System.*;
@SuppressWarnings("serial")
public class panel extends JPanel implements MouseListener {

	
	private int alpha = 0;
	//Color template = new Color(0, 0, 0, alpha);
	Color color;
	private BufferedImage ref; // this sucks; calc layout >>>>>
	
	
	public panel() {
		BinarySearchTree tree = new BinarySearchTree();
		try {
			ref = ImageIO.read(panel.class.getResource("/images/dook.png"));
		}
		catch (Exception e) {
			out.println("Exception Error");
			return;
		}
		addMouseListener(this);	
	} // end of panel
	
	public void paint(Graphics g) {
		super.paint(g);
		//bg
			color = new Color(126, 143, 126);
			g.setColor(color);
			g.fillRect(0, 0, getWidth(), getHeight());

			//g.drawImage(ref, 0, 0, getWidth(), getHeight(), null); 
			g.setColor(color.white);
			int dim = 75;
			for(int i = 0; i < 5; i++) {
				//2, 3, 5, 9, 17
				//2^i + 1
			}
			g.drawOval(getWidth()/2 - (dim/2), 30, dim, dim);
			g.drawOval(getWidth()/3 - (dim/2), 30 + (int) (dim * 0.75), dim, dim);
	}
	
	public void mouseClicked(MouseEvent e) {
	
	}
				

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
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
	
}

