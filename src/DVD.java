public class DVD extends AusleihbaresMedium {

	private long dvdID;
	private int laufzeitMin;

	/**
	 * @param titel
	 * @param autor
	 * @param verfügbarkeit
	 * @param exemplare
	 */
	public DVD(String titel, String autor, boolean verfügbarkeit, int exemplare) {
		super(titel, autor, verfügbarkeit, exemplare);
	}
}