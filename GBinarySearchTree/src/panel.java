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
			int dim = 65;
			int center_offset = (dim/2);
			/*
			for(int i = 0; i < 6; i++) {
			int height = 30;
				for (int k = 0; k < 5; k++) {
					g.drawOval(getWidth()/(int) Math.pow(2, i) + 1 - center_offset, height, dim, dim);
				}
			height += (int) (dim * 0.75);
				//2, 3, 5, 9, 17
				//2^i + 1
			}
			*/
			
			
			int height = 30;
			for(int i = 0; i < 5; i++) {
					for (int k = 1; k < Math.pow(2, i) + 1; k++) {
						if (k % 2 != 0) { g.drawOval(  (getWidth()/ (int) (Math.pow(2, i) + 1) * k - center_offset - 20) , height, dim, dim); } // left offset
						else { g.drawOval(  (getWidth()/ (int) (Math.pow(2, i) + 1) * k - center_offset + 20) , height, dim, dim); } // right offset
						// !! BOTH OFFSETS ARE BY 20. THIS IS BECAUSE YOUR TREE LOOKS LIKE SHIT WITHOUT THEM. have fun gabe !!
						//2, 3, 5, 9, [17]
						//2^i + 1
					}
				height += dim;					
			}
			
			height = 30;
			for(int i = 0; i < 4; i++) { // < 4 because there shouldnt be any lines on the bottom row
				int nCount = (int) Math.pow(2, i) + 1;	
				for (int k = 1; k < nCount; k++) {
						if (k == 1) {
							g.drawLine(((getWidth()/(int) (nCount)) * k - center_offset - 20) , height + center_offset, ((getWidth()/(int) (Math.pow(2, i + 1) + 1)) * k - center_offset * 2 - 20) + dim, height + dim); // left
							//g.drawLine(((getWidth()/(int) (nCount)) * k - center_offset  - 20) + dim, height + center_offset, ((getWidth()/(int) (Math.pow(2, i + 1) + 1)) * k + center_offset * 2 - 20) + dim, height + dim); // left
						}
						else {
							if (k % 2 != 0) {
								//g.drawLine(((getWidth()/(int) (nCount)) * k - center_offset) - 20 , height + center_offset, ((getWidth()/(int) (Math.pow(2, i + 1) + 1))  *  ((k * 2) - 1) - center_offset * 2 ) - 20 + dim, height + dim);
							}
							else {
								//g.drawLine(((getWidth()/(int) (nCount)) * k - center_offset) + 20 , height + center_offset, ((getWidth()/(int) (Math.pow(2, i + 1) + 1))  *  ((k * 2) - 1) - center_offset * 2) - 20 + dim, height + dim);
							}
							//g.drawLine(((getWidth()/(int) (nCount)) * k - center_offset) + dim, height + center_offset, ((getWidth()/(int) (Math.pow(2, i + 1) + 1))  *  ((k * 2) - 1) + center_offset * 2) + dim, height + dim); // left
						}
						//g.drawLine(((getWidth()/(int) (nCount)) * k - center_offset) , height + center_offset, ((getWidth()/(int) (Math.pow(2, i + 1) + 1)) * k - center_offset) + dim, height + dim); // left
						//          (((getWidth()/(int) (nCount)) * k - center_offset) + dim , height + center_offset, ((getWidth()/(int) (Math.pow(2, i + 1) + 1)) * k + center_offset) + dim, height + dim);
						//2, 3, 5, 9, 17
						//2^i + 1
					}
				height += dim;					
			}
			
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

