import java.awt.Frame;
import java.awt.Component;
import java.awt.Graphics;

class DrawShapes extends Component{

	public static void main(String args[])
	{
		Frame frame = new Frame();
		frame.setSize(500,400);
		frame.setTitle("Draw Shapes in Frame");
		frame.setLocation(400,100);
		frame.add(new DrawShapes());
		frame.setVisible(true);

	}

			public void paint(Graphics g)
			{
				g.drawRect(50,50,100,100);
				g.drawOval(50,50,100,100);
			}



}