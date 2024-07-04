import java.util.UUID;

class UUIDclass
{
	public static void main(String args[])
	{
		System.out.println(UUID.randomUUID());

		System.out.println("\n" + UUID.randomUUID().toString().substring(0,4));
	}
}