import java.util.Scanner;

// Odrediti broj samoglasnika i suglasnika u unesenom stringu


public class TreciZadatak {
	private static boolean jeSamoglasnik(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tekst: ");
		String tekst = sc.nextLine();
		int brojSamoglasnika = 0;
		int brojSlova = 0;
		
		for (int i = 0; i < tekst.length(); i++) {
			char c = tekst.charAt(i);
			if (Character.isLetter(c)) {
				brojSlova++;
				if (jeSamoglasnik(c)) {
					brojSamoglasnika++;
				}
			}
		}
		
		System.out.println("Broj samoglasnika je: " + brojSamoglasnika);
		System.out.println("Broj suglasnika je: " + (brojSlova - brojSamoglasnika));
		sc.close();
	}

}
