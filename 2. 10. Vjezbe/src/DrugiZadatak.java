import java.util.Scanner;

public class DrugiZadatak {	
	
	public static void main(String[] args) {

	int i, brTrkaca=0;
	float razdaljina, max=0;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite koordinate centra: ");
	int cx = sc.nextInt();
	int cy = sc.nextInt();
	
	System.out.println("Unesite poluprečnik manje kružnice: ");
	int R1 = sc.nextInt();
	System.out.println("Unesite poluprečnik veće kružnice: ");
	int R2 = sc.nextInt();
	
	System.out.println("Unesite broj trkača: ");
	int N = sc.nextInt();
	
	for (i=0; i<N; i++) {
		System.out.println("Unesite x koordinatu trkača:");
		int xi = sc.nextInt();
		System.out.println("Unesite y koordinatu trkača:");
		int yi = sc.nextInt();
		razdaljina = (float)Math.sqrt(Math.pow(xi-cx, 2)+Math.pow(yi-cy, 2));
		
		if (razdaljina <= R2 && razdaljina >=R1 && yi>cy) {
			brTrkaca++;
			if (razdaljina > max)
				max = razdaljina;
		}
	}
	System.out.printf("Broj trkača je %d\n", brTrkaca);
	System.out.printf("Maksimalna razdaljina trkača je %.2f\n", max);
	
	sc.close();
	
	}
	}



