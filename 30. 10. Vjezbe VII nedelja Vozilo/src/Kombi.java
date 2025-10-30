
public class Kombi extends Vozilo {
	private int kapacitetPutnika;
	
	public Kombi(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int kapacitetPutnika) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		setKapacitetPutnika(kapacitetPutnika);
	}
	
	
	public int getKapacitetPutnika() {
		return kapacitetPutnika;
	}

	public void setKapacitetPutnika(int kapacitetPutnika) {
		this.kapacitetPutnika = kapacitetPutnika;
	}


	@Override
	public String toString() {
		return "Kombi [proizvodjac=" + proizvodjac + ", godinaProizvodnje=" + godinaProizvodnje + ", kubikaza="
				+ kubikaza + ", boja=" + boja + ", kapacitetPutnika=" + kapacitetPutnika + "]";
	}


	public String cijenaRegistracijeKombija(Kombi a) {
		int cijena = 100;
		if (a.getGodinaProizvodnje() < 2010) cijena += 30;
		if (a.getKubikaza() > 2000) cijena += 50;
		if (a.getKapacitetPutnika() > 8) cijena += 30;
		String rezultat = "Cijena registracije je " + cijena + "EUR.";
	
		return rezultat;
	}
	
	
	public static void main(String[] args) {

		
		
	}

}
