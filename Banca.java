import java.util.HashSet;

public class Banca {

	private String codBancar;

	public static void main(String[] args) {
		HashSet<Client> listOfClients = new HashSet<Client>();

		Client c1 = new Client("Florin", "Iosia");
		c1.createAccount("1029384756", 899, "EURO");
		System.out.println(c1.toString());
		c1.createAccount("9876543210", 599, "LEI");

		listOfClients.add(c1);
	}

}