
public class Racunari extends EProizvodi {
	private String procesor;
	private int memorija;
	
	
	public Racunari(String opisProizvoda, String sifraProizvoda, float uvoznaCijenaProizvoda, String procesor, int memorija) {
		super(opisProizvoda, sifraProizvoda, uvoznaCijenaProizvoda);
		setProcesor(procesor);
		setMemorija(memorija);
	}
	

	public String getProcesor() {
		return procesor;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}

	public int getMemorija() {
		return memorija;
	}

	public void setMemorija(int memorija) {
		this.memorija = memorija;
	}

	
	@Override
	public String toString() {
		return "Racunari [procesor=" + procesor + ", memorija=" + memorija + "]";
	}

	
	public static float maloprodajnaCijena (Racunari r) {
		float prvoUvecana = r.getUvoznaCijenaProizvoda() * 1.05f;
		float rezultat = prvoUvecana * 1.05f;
		return rezultat;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
