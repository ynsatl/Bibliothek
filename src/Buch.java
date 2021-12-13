public class Buch extends AusleihbaresMedium {

	private String titel;
	private String autor;
	private boolean verfügbarkeit;
	private int exemplare;
	private long ISBN;


	public Buch(String titel, String autor, boolean verfügbarkeit, int exemplare, long ISBN) {
		super(titel, autor, verfügbarkeit, exemplare, ISBN);
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isVerfügbarkeit() {
		return verfügbarkeit;
	}

	public void setVerfügbarkeit(boolean verfügbarkeit) {
		this.verfügbarkeit = verfügbarkeit;
	}

	public int getExemplare() {
		return exemplare;
	}

	public void setExemplare(int exemplare) {
		this.exemplare = exemplare;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}
}