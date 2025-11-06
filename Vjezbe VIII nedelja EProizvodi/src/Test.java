import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void stampajProizvode (ArrayList<EProizvodi> niz, String tipUredjaja) {
		
		ArrayList<EProizvodi> rezultat = new ArrayList<>();
		
		if (tipUredjaja.equalsIgnoreCase("racunari")) {
			for (EProizvodi x: niz) {
				if (x.getSifraProizvoda().startsWith("RA")) rezultat.add(x);
			}
		} else if (tipUredjaja.equalsIgnoreCase("telefoni")) {
			for (EProizvodi x: niz) {
				if (x.getSifraProizvoda().startsWith("TE")) rezultat.add(x);
			}
		} else {
			for (EProizvodi x: niz) {
				if (x.getSifraProizvoda().startsWith("TV")) rezultat.add(x);
			}
		}	
		
		for (int i = 0; i < rezultat.size(); i++) {
			System.out.println(rezultat.get(i));
		}
	
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<EProizvodi> niz = new ArrayList<>();
		niz.add(new Racunari("Racunar1", "RA001", 500, "I5 10400", 16));
		niz.add(new Telefoni("Iphone 16", "TE001", 700, "IOS26", 6.1f));
		niz.add(new TV("SAMSUNG 200", "TV001", 600, 70));
		niz.add(new TV("PHILLIPS 400", "TV002", 650, 50));
		niz.add(new Telefoni("Samsung Galaxy S24", "TE002", 600, "OneUI 4.0", 6.3f));
		
		stampajProizvode(niz, "televizori");
		
		System.out.println("1. Unos uređaja\n2. Pregled svih uređaja sa maloprodajnom cijenom\n3. Pregled uređaja određenog tipa");
		System.out.println("Šta želite da uradite?");
		int N = sc.nextInt();
		
		if (N == 1) {
			System.out.println("Unesite vrstu uredjaja koju zelite da dodate u sistem: ");
			String vrstaUredjaja = sc.nextLine();
			if (vrstaUredjaja.equalsIgnoreCase("racunar")) {
				System.out.println("Unesite attribute za novi racunar: ");
				niz.add(new Racunari(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextLine(), sc.nextInt()));
			} else if (vrstaUredjaja.equalsIgnoreCase("telefon")) {
				System.out.println("Unesite attribute za novi telefon: ");
				niz.add(new Telefoni(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextLine(), sc.nextFloat()));
			} else {
				if (vrstaUredjaja.equalsIgnoreCase("tv")) {
					System.out.println("Unesite attribute za novi televizor: ");
					niz.add(new TV(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextInt()));
				}
			}
		} else if (N == 2) {
			stampajProizvode(niz, "racunari");
			stampajProizvode(niz, "telefoni");
			stampajProizvode(niz, "tv");
			

		}
		
		
	}

}
