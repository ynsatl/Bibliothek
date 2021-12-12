public class Buch extends AusleihbaresMedium {

	private int seitenanzahl;

	/**
	 * @param titel
	 * @param autor
	 * @param verfügbarkeit
	 * @param exemplare
	 */
	public Buch(String titel, String autor, boolean verfügbarkeit, int exemplare) {
		super(titel, autor, verfügbarkeit, exemplare);
	}
}