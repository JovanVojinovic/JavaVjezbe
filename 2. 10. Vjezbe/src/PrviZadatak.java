import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner(System.in);
		
		int i, razdaljina, broj_prijetnji=0;
		
		System.out.println("Unesite broj neprijateljskih katapulta: ");
		int N = unos.nextInt();
		System.out.println("Unesite maksimalnu distancu za domet: ");
		int D = unos.nextInt();
		System.out.println("Unesite health dvorca: ");
		int HD = unos.nextInt();
		System.out.println("Unesite napad katapulta: ");
		int KA = unos.nextInt();
		
		for (i=0; i<=N; i++) {
			System.out.println("Unesite koordinate katapulta: ");
			int x = unos.nextInt();
			int y = unos.nextInt();
			razdaljina = Math.abs(x) + Math.abs(y);
			
			if (razdaljina <= D)
				broj_prijetnji++;
		}

		
		System.out.printf("Broj katapulta koji predstavljaju prijetnju je %d", broj_prijetnji);	
		
		if (broj_prijetnji * KA >= HD)
			System.out.print("Dvrorac je srušen");
		else
			System.out.print("Dvorac nije srušen");
		
		unos.close();

	}

}
