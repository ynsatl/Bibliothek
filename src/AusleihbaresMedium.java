public class AusleihbaresMedium<kategorie>{

	private String titel;
	private String autor;
	private int ISBN;
	private boolean verfügbarkeit;
	private int exemplare;
	private long mediumID;
	private boolean reserviert;
	private  kategorie kategorie;

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