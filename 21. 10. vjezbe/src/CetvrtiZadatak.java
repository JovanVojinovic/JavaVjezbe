import java.util.Scanner;

public class CetvrtiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tekst: ");
		String tekst = sc.nextLine();
		StringBuilder rezultat = new StringBuilder ();
		
		for (int i = 0; i < tekst.length(); i++) {
			char c = tekst.charAt(i);
			int cifra = Character.getNumericValue(c);
			if (cifra % 2 == 0) {
				rezultat.append("0");
			} else {
				rezultat.append("1");
			}
		}
		
		System.out.println(rezultat);
		sc.close();
	}

}
