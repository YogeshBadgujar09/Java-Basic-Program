import javax.swing.JOptionPane;

class OpPackWITHinput
{
	public static void main(String[] args)
	{
			String msg;
			String name;
			String display;

			msg="Enter Your Name ";

			name = JOptionPane.showInputDialog(msg);

			display= "Hello \n"+name+"\nNice to meet you";

			System.out.println(display);
	}
}