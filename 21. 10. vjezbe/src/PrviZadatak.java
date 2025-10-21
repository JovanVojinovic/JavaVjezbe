import java.util.Scanner;
public class PrviZadatak {
	
	// Unijeti rečenicu koja sadrži više odvojenih prazninama i odrediti broj riječi
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tekst: ");
		String tekst = sc.nextLine();
		String[] rijeci = tekst.split(" ");        //  \s - space   \t - tab  \n - newline
		System.out.print("\nBroj riječi je: " + rijeci.length);
		sc.close();
		
	}

}
