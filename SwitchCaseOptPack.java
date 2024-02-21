import javax.swing.JOptionPane;

class SwitchCaseOptPack
{
	public static void main(String args[])
	{
			String msg;
			String num ;
			int Intnum;
			msg = "Enter a number under 0 to 5";

			num = JOptionPane.showInputDialog(msg);

			Intnum=Integer.parseInt(num);

			switch(Intnum)
			{
				case 0:
				System.out.print("Number Is Zero");
				break ;

				case 1:
				System.out.print("Number Is one");
				break ;

				case 2:
				System.out.print("Number Is Two");
				break ;

				case 3:
				System.out.print("Number Is Three");
				break ;

				case 4:
				System.out.print("Number Is Four");
				break ;

				case 5:
				System.out.print("Number Is Five");
				break ;

				default:
				System.out.println("Enter valid number");
			}

	}
}
