import java.util.Scanner;
import java.util.Random;

public class PetiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Unesite dužinu niza: ");
		int velicinaNiza = sc.nextInt();
		int[] brojevi = new int[velicinaNiza];
		
		for (int i = 0; i < brojevi.length; i++)
			brojevi [i] = rand.nextInt(100) + 1;
		
		for (int x: brojevi)
			System.out.println(x);
		
	}

}
