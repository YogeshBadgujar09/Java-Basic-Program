import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Color;

class SmileEmoji extends Component{

	public static void main(String args[])
	{
		Frame frame = new Frame();
		frame.setSize(400,400);
		frame.setLocation(475,200);
		frame.add(new SmileEmoji());
		frame.setVisible(true);
	}

	public void paint(Graphics g){

		g.drawRect(75,75,200,200);
		g.setColor(Color.YELLOW);
		g.fillOval(75,75,200,200);


		g.setColor(Color.BLACK);
		g.fillOval(130,150,15,15);


		g.setColor(Color.BLACK);
		g.fillOval(210,150,15,15);

		g.drawArc(120,200,110,20,0,90);




	}

}