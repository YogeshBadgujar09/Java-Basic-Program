import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Color;

class FillColor extends Component
{

	public static void main(String args[])
	{
		Frame frame = new Frame();
		frame.setTitle("Fill Color in Shapes");
		frame.setSize(600,300);
		frame.setLocation(50,50);
		frame.add(new FillColor());
		frame.setVisible(true);
	}

	public void paint(Graphics graphic)
	{
		graphic.setColor(Color.RED);
		graphic.fillRect(200,200,400,400);


		graphic.setColor(Color.YELLOW);
		graphic.fillOval(50,50,100,100);

		graphic.setColor(Color.BLACK);
		graphic.drawLine(50,100,100,100);
	}

}