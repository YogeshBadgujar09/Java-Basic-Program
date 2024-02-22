import jack.Twofun;

class Twofuncall
{
	public static void main(String args[])
	{
		Twofun twofun = new Twofun();
		twofun.msg1();					// msg1() is create in Twofun class and Twofun class is in jack package
		twofun.msg2();					// msg2() is also create in Twofun class and Twofun class is in jack package

	}
}