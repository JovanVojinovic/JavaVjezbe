
public class Telefoni extends EProizvodi {
	private String operativniSistem;
	private float velicinaEkrana;
	
	public Telefoni(String opisProizvoda, String sifraProizvoda, float uvoznaCijenaProizvoda, 
			String operativniSistem, float velicinaEkrana) {
		super(opisProizvoda, sifraProizvoda, uvoznaCijenaProizvoda);
		setOperativniSistem(operativniSistem);
		setVelicinaEkrana(velicinaEkrana);
	}

	public String getOperativniSistem() {
		return operativniSistem;
	}

	public void setOperativniSistem(String operativniSistem) {
		this.operativniSistem = operativniSistem;
	}

	public float getVelicinaEkrana() {
		return velicinaEkrana;
	}

	public void setVelicinaEkrana(float velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}

	@Override
	public String toString() {
		return "Telefoni [operativniSistem=" + operativniSistem + ", velicinaEkrana=" + velicinaEkrana + "]";
	}
	
	public static float maloprodajnaCijena (Telefoni t) {
		float prvobitnaCijena = t.getUvoznaCijenaProizvoda() * 1.05f;
		float rezultat = prvobitnaCijena;
		if (t.getVelicinaEkrana() > 6) {
			rezultat *= 1.03f;
		}
		return rezultat;
	}
	
	
}
