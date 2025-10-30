
public class Kamion extends Vozilo {
	private int kapacitetTereta;
	private boolean prikolica;
	
	public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int kapacitetTereta, boolean prikolica) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		setKapacitetTereta(kapacitetTereta);
		setPrikolica(prikolica);
	}
	
	
	public int getKapacitetTereta() {
		return kapacitetTereta;
	}
	
	public void setKapacitetTereta(int kapacitetTereta) {
		this.kapacitetTereta = kapacitetTereta;
	}

	public boolean isPrikolica() {
		return prikolica;
	}

	public void setPrikolica(boolean prikolica) {
		this.prikolica = prikolica;
	}


	@Override
	public String toString() {
		return "Kamion [proizvodjac=" + proizvodjac + ", godinaProizvodnje=" + godinaProizvodnje + ", kubikaza="
				+ kubikaza + ", boja=" + boja + ", kapacitetTereta=" + kapacitetTereta + ", prikolica=" + prikolica
				+ "]";
	}

	
	public String cijenaRegistracijeKamiona(Kamion a) {
		int cijena = 100;
		if (a.getGodinaProizvodnje() < 2010) cijena += 30;
		if (a.getKubikaza() > 2000) cijena += 50;
		if (a.isPrikolica()) cijena += 50;
		String rezultat = "Cijena registracije je " + cijena + "EUR.";
	
		return rezultat;
	}
	

	public static void main(String[] args) {

		
		
	}

}
