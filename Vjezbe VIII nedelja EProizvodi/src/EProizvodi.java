
public class EProizvodi {
	protected String opisProizvoda;
	protected String sifraProizvoda;
	protected float uvoznaCijenaProizvoda;
	
	
	public EProizvodi(String opisProizvoda, String sifraProizvoda, float uvoznaCijenaProizvoda) {
		super();
		this.opisProizvoda = opisProizvoda;
		this.sifraProizvoda = sifraProizvoda;
		this.uvoznaCijenaProizvoda = uvoznaCijenaProizvoda;
	}


	public String getOpisProizvoda() {
		return opisProizvoda;
	}

	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}

	public String getSifraProizvoda() {
		return sifraProizvoda;
	}

	public void setSifraProizvoda(String sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}

	public float getUvoznaCijenaProizvoda() {
		return uvoznaCijenaProizvoda;
	}

	public void setUvoznaCijenaProizvoda(float uvoznaCijenaProizvoda) {
		this.uvoznaCijenaProizvoda = uvoznaCijenaProizvoda;
	}


	@Override
	public String toString() {
		return "EProizvodi [opisProizvoda=" + opisProizvoda + ", sifraProizvoda=" + sifraProizvoda
				+ ", uvoznaCijenaProizvoda=" + uvoznaCijenaProizvoda + "]";
	}

	
	
	
	

}
