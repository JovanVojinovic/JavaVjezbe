
public class PrviZadatak {

	public static void main(String[] args) {
		
		int[] niz = new int[10];
		for (int i = 0; i < niz.length; i++) {            // lenght je atribut, znamo jer nema zagrada nakon njega
			niz[i] = i+1;
		}
		
		for (int i = 9; i >= 0; i--) {
			System.out.println(niz[i]);
		}	
	}
}