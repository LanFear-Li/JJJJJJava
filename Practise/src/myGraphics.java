import java.applet.Applet;
import java.awt.Graphics;;

public class myGraphics extends Applet{
	public void paint(Graphics g) {
		int counter = 1;
		while(counter <= 10) {
			g.drawLine(10, 10, 250, counter * 10);
			++counter;
		}
	}
}

