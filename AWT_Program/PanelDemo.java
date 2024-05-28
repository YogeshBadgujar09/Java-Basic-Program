import java.awt.Frame;
import java.awt.Panel;
class PanelDemo
{

	public static void main(String args[])
	{
		Frame frame = new Frame();
		Panel p = new Panel();
		frame.setTitle("Add Panel");
		frame.setSize(600,300);
		frame.setLocation(50,50);
		frame.add(new Panel());
		frame.setVisible(true);

	}

}