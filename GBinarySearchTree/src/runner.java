import java.math.*;
public class runner { //runs the program
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int random = (int) (Math.floor(Math.random()*100)+1);	// random number from 1 to 6
		String framename;
		
		switch (random) {
		case 16:
			framename = "1% chance of this being the title";
			break;
		default:
			framename = "tree";
		} // if you want, you can add more stupid titles by just adding "case n: framename = "text here"; break;" whenever. enjoy.	
		frame graphicWindow = new frame (framename);
	}
}