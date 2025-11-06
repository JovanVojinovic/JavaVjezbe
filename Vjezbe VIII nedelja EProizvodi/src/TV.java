
public class TV extends EProizvodi {
	private int velicinaEkrana;
	
	public TV(String opisProizvoda, String sifraProizvoda, float uvoznaCijenaProizvoda, int velicinaEkrana) {
		super(opisProizvoda, sifraProizvoda, uvoznaCijenaProizvoda);
		setVelicinaEkrana(velicinaEkrana);
	}

	public int getVelicinaEkrana() {
		return velicinaEkrana;
	}

	public void setVelicinaEkrana(int velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}

	@Override
	public String toString() {
		return "TV [velicinaEkrana=" + velicinaEkrana + "]";
	}	
	
	public static float maloprodajnaCijena (TV t) {
		float prvobitnaCijena = t.getUvoznaCijenaProizvoda() * 1.05f;
		float rezultat = prvobitnaCijena;
		if (t.getVelicinaEkrana() > 65) {
			rezultat *= 1.1f;
		}
		return rezultat;
	}
	
}
