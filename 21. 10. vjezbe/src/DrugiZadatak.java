import java.util.Scanner;

public class DrugiZadatak {

	// Provjeri da li je unešeni string palindrom
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tekst: ");
		String tekst = sc.nextLine();
		tekst = tekst.trim(); 
		String suportno = new StringBuilder (tekst).reverse().toString();

		
		if (tekst.equalsIgnoreCase(suportno))
			System.out.println("String " + tekst + " je palindrom.");
		else
			System.out.println("String " + tekst + " nije palindrom. ");
		
		sc.close();
		
		// doraditi da se uklanjaju spaceovi
		
	}

}
