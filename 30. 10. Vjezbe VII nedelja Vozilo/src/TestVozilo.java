
public class TestVozilo {

	public static void main(String[] args) {

		
		Automobil a1 = new Automobil("Mercedes", 2015, 2100, "crna", 4, "dizel");
		Kamion k1 = new Kamion("VW", 2009, 3000, "crvena", 40000, true);
		Kombi ko1 = new Kombi("VW", 2008, 4500, "bijela", 50);
		Automobil a2 = new Automobil("BMW", 2020, 3500, "plava", 4, "dizel");
		
		System.out.println(a1.toString());
		System.out.println(a1.cijenaRegistracijeAutomobila(a1));
		System.out.println(k1.toString());
		System.out.println(k1.cijenaRegistracijeKamiona(k1));
		System.out.println(ko1.toString());
		System.out.println(ko1.cijenaRegistracijeKombija(ko1));
		System.out.println(a2.toString());
		System.out.println(a2.cijenaRegistracijeAutomobila(a2));
		
		
	}

}
