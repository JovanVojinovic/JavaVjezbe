
public class Automobil extends Vozilo {
	private int brojVrata;
	private String tipMotora;
	
	public Automobil(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int brojVrata, String tipMotora) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		setBrojVrata(brojVrata);
		setTipMotora(tipMotora);
	}
	
	
	public int getBrojVrata() {
		return brojVrata;
	}
	
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}

	public String getTipMotora() {
		return tipMotora;
	}

	public void setTipMotora(String tipMotora) {
		this.tipMotora = tipMotora;
	}


	@Override
	public String toString() {
		return "Automobil [proizvodjac=" + proizvodjac	+ ", godinaProizvodnje=" + godinaProizvodnje + ", kubikaza=" + kubikaza + 
				", boja=" + boja + "brojVrata=" + brojVrata + ", tipMotora=" + tipMotora + "]";
	}

	
	public String cijenaRegistracijeAutomobila(Automobil a) {
		int cijena = 100;
		if (a.getGodinaProizvodnje() < 2010) cijena += 30;
		if (a.getKubikaza() > 2000) cijena += 50;
		if (a.getTipMotora().toLowerCase().trim() == "dizel") cijena += 20;
		String rezultat = "Cijena registracije je " + cijena + "EUR.";
	
		return rezultat;
	}
	

	public static void main(String[] args) {

	}

}
