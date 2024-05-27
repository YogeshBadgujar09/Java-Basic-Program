import java.awt.Frame;

class FrameDemo
{

	public static void main(String args[])
	{
		//Frame is inbuil class in java.awt package
		Frame frame = new Frame();

		//setTitle is set title in Frame , title is given in the form of String
		frame.setTitle("My First Frame in Java");

		/*setLocation is  function which set the location of Frame
		*and take two arguments X and Y of axis of Graph
		*/
		frame.setLocation(400,300);

		/**
		*setSize is responsible to Give a size to Frame
		*It take two arguments Width and Height
		*first take width and after height
		*/
		frame.setSize(500,300);

		/*
		*seVisible is responsible for to show a frame to user
		*it takes argument in boolean type
		*true/false
		*/
		frame.setVisible(true);

	}

}