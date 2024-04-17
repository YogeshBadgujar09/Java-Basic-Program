import java.awt.*;
class AwtProgram extends Frame{

	AwtProgram()
	{
		Button button = new Button("Click Me !");
		button.setBounds(30,100,80,30);
		add(button);
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String args[])
	{
				AwtProgram awtProgram = new AwtProgram();

	}



}