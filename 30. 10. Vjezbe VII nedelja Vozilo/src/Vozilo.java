
public class Vozilo {
	protected String proizvodjac;
	protected int godinaProizvodnje;
	protected int kubikaza;
	protected String boja;
	
	
	public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja) {
		super();
		this.proizvodjac = proizvodjac;
		this.godinaProizvodnje = godinaProizvodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
	}



	public String getProizvodjac() {
		return proizvodjac;
	}
	
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
	

	@Override
	public String toString() {
		return "Vozilo [proizvodjac=" + proizvodjac + ", godinaProizvodnje=" + godinaProizvodnje + ", kubikaza="
				+ kubikaza + ", boja=" + boja + "]";
	}

	
	
	public static void main(String[] args) {
		
		
		
	}

}
