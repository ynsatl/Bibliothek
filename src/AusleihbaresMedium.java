public class AusleihbaresMedium<kategorie>{

	private String titel;
	private String autor;
	private int ISBN;
	private boolean verfügbarkeit;
	private int exemplare;
	private long mediumID;
	private boolean reserviert;
	private  kategorie kategorie;

	public AusleihbaresMedium(String titel, String autor, int ISBN, boolean verfügbarkeit, int exemplare, long mediumID, boolean reserviert, kategorie kategorie) {
		this.titel = titel;
		this.autor = autor;
		this.ISBN = ISBN;
		this.verfügbarkeit = verfügbarkeit;
		this.exemplare = exemplare;
		this.mediumID = mediumID;
		this.reserviert = reserviert;
		this.kategorie = kategorie;
	}

	/**
	 * 
	 * @param titel
	 * @param autor
	 * @param verfügbarkeit
	 * @param exemplare
	 */
	public AusleihbaresMedium(String titel, String autor, boolean verfügbarkeit, int exemplare) {
		// TODO - implement AusleihbaresMedium.AusleihbaresMedium
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param AGB
	 * @param mediumID
	 * @param nutzerID
	 */
	public void Ausleihen(boolean AGB, long mediumID, long nutzerID) {
		// TODO - implement AusleihbaresMedium.Ausleihen
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mediumID
	 * @param AGB
	 * @param nutzerID
	 */
	public void vorbestellung(long mediumID, boolean AGB, int nutzerID) {
		// TODO - implement AusleihbaresMedium.vorbestellung
		throw new UnsupportedOperationException();
	}

}