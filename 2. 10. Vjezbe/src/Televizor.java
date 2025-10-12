
public class Televizor {
	private int brojKanala;
	private int jacinaTona;
	private String nazivKanala;	    //ovo su atributi
	
	
	// ovo je konstruktor, obavezan za skoro svaku klasu, pomocu njega se zapravo pravi objekat
	
	public Televizor(int brojKanala, int jacinaTona, String nazivKanala) { // ovo troje u zagradi su parametri
		if (brojKanala >= 1) {
			this.brojKanala = brojKanala;  // this. koristi atribut brojKanala, a sa desne strane brojKanala je parametar iako je ime isto
		} else {
			this.brojKanala = 1;   // default vrijednost ako je broj kanala koje unosi korisnik <1
		}	
			
		this.nazivKanala = nazivKanala;
		
		if (jacinaTona >= 0 && jacinaTona <= 10) {
			this.jacinaTona = jacinaTona;
		} else {
			this.jacinaTona = 5;
		}
	}
	
	public int getBrojKanala() {   // napravi funkciju koja je vidljiva van ove klase koja nam vraca integer, getteri
		return this.brojKanala;
	}
	
	public int getJacinTona() {
		return this.jacinaTona;
	}
	
	public String getNazivKanala() {
		return this.nazivKanala;
	}
	
	public void setBrojKanala(int brojKanala) {
		if (brojKanala > 0) {
			this.brojKanala = brojKanala;
		} else {
			System.out.println("Nijeste dobro unijeli broj kanala (>0)");
		}
	}
	
	public void setJacinaTona(int jacinaTona) {
		if (jacinaTona >= 0 && jacinaTona <= 10) {
			this.jacinaTona = jacinaTona;
		} else {
			System.out.println("Potrebno je unijeti neku od vrijednosti između 0 i 10.");
		}
	}
	
	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}
	
	public void pojacajTon() {                // ovo je metoda
		if (this.jacinaTona < 10) {
			this.jacinaTona ++;
		} else {
			System.out.println("Jacina tona je već na maksimumu");
		}
	}
		
	public void ispis() {
		System.out.println("Broj kanala: " + this.brojKanala + "; jacina tona: " + this.jacinaTona + "; naziv kanala: " + this.nazivKanala);
	}
		 
	
	public static void main(String[] args) {
		Televizor televizor1 = new Televizor(10,6, "Kanal 1");   // desno od = je kreiranje objekta;; 10,6 i "Kanal 1" su argumenti, vrijednosti parametara
		System.out.println("Broj kanala: " + televizor1.brojKanala);
		System.out.println("Broj kanala: " + televizor1.getBrojKanala());  // linije 41 i 42 su iste, ovo se koristi kad pozivamo ovo u nekoj drugoj klasi
		Televizor televizor2 = new Televizor (15, 4, "Kanal 10");
		System.out.println("Broj kanala: " + televizor2.brojKanala);
		televizor2.brojKanala = 7;  // ovo ne valja da se radi van klase
		televizor2.setBrojKanala(7);  // isto kao iznad, ali ovako preko settera je bolje
		System.out.println("Broj kanala: " + televizor2.getBrojKanala());
		
		televizor1.pojacajTon();
		televizor1.pojacajTon();
		televizor1.ispis();
		
	}
	
}
